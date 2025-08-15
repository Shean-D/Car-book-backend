package edu.icet.model.entity;

import edu.icet.util.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false, foreignKey = @ForeignKey(name = "fk_payment_booking"))
    private BookingEntity bookingId;

    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private Double amount;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDateTime;

    @Column(name = "method", nullable = false)
    private PaymentMethod method;
}

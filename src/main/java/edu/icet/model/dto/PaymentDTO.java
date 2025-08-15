package edu.icet.model.dto;

import edu.icet.util.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentDTO {

    private int id;
    private int bookingId;
    private Double amount;
    private LocalDateTime paymentDateTime;
    private PaymentMethod method;
}

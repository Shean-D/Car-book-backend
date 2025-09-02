package edu.icet.model.entity;

import edu.icet.util.CarCategory;
import edu.icet.util.CarStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @Column(name = "make", nullable = false, length = 50)
    private String make;

    @Column(name = "model", nullable = false, length = 50)
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "category", nullable = false)
    private CarCategory category;

    @Column(name = "daily_rate", nullable = false)
    private Double dailyRate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private CarStatus status = CarStatus.AVAILABLE;

    @Column(name = "image_url", nullable = false, length = 2048)
    private String imageURL;
}

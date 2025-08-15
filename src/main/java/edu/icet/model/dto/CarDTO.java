package edu.icet.model.dto;

import edu.icet.util.CarCategory;
import edu.icet.util.CarStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarDTO {

    private int carId;
    private String make;
    private String model;
    private int year;
    private CarCategory category;
    private Double dailyRate;
    private CarStatus status;
    private String imageURL;
}

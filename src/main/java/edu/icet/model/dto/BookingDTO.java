package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingDTO {

    private int bookingId;
    private int customerId;
    private int carId;
    private Date startDate;
    private Date endDate;
    private Double totalPrice;
    private String bookingStatus;
}

package edu.icet.model.dto;

import edu.icet.util.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {

    private int userId;
    private String userName;
    private String email;
    private String contactNumber;
    private String password;
    private UserRole role;
}

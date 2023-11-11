package ru.etozhealexis.itprojects.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegistrationDTO {
    private String username;
    private String email;
    private String password;
    private String passwordConfirmation;
}

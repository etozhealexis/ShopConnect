package ru.etozhealexis.itprojects.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserProfileDTO {
    private String userName;
    private String firstName;
    private String surname;
    private String phoneNumber;
    private String addressLineOne;
    private String addressLineTwo;
    private String postCode;
    private String state;
    private String area;
    private String email;
    private String country;
    private String region;
}

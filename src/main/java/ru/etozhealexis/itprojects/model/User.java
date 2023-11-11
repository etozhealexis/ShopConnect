package ru.etozhealexis.itprojects.model;


import lombok.*;

import javax.persistence.*;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String email;

    @Column(name = "first_name")
    private String firstName;

    private String surname;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String addressLineOne;

    private String addressLineTwo;

    @Column(name = "post_code")
    private String postCode;

    private String state;

    private String area;

    private String country;

    private String region;
}

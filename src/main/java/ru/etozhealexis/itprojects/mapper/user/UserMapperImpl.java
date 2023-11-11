package ru.etozhealexis.itprojects.mapper.user;

import org.springframework.stereotype.Component;
import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.model.User;

import java.util.Optional;

@Component
public class UserMapperImpl implements UserMapper {

    public User map(UserRegistrationDTO userRegistrationDTO) {
        return User.builder()
                .userName(userRegistrationDTO.getUsername())
                .email(userRegistrationDTO.getEmail())
                .password(userRegistrationDTO.getPassword())
                .build();
    }

    @Override
    public User map(UserProfileDTO userProfileDTO) {
        User.UserBuilder userBuilder = User.builder().userName(userProfileDTO.getUserName());
        Optional.ofNullable(userProfileDTO.getFirstName()).ifPresent(userBuilder::firstName);
        Optional.ofNullable(userProfileDTO.getUserName()).ifPresent(userBuilder::userName);
        Optional.ofNullable(userProfileDTO.getPhoneNumber()).ifPresent(userBuilder::phoneNumber);
        Optional.ofNullable(userProfileDTO.getAddressLineOne()).ifPresent(userBuilder::addressLineOne);
        Optional.ofNullable(userProfileDTO.getAddressLineTwo()).ifPresent(userBuilder::addressLineTwo);
        Optional.ofNullable(userProfileDTO.getPostCode()).ifPresent(userBuilder::postCode);
        Optional.ofNullable(userProfileDTO.getState()).ifPresent(userBuilder::state);
        Optional.ofNullable(userProfileDTO.getArea()).ifPresent(userBuilder::area);
        Optional.ofNullable(userProfileDTO.getEmail()).ifPresent(userBuilder::email);
        Optional.ofNullable(userProfileDTO.getCountry()).ifPresent(userBuilder::country);
        Optional.ofNullable(userProfileDTO.getRegion()).ifPresent(userBuilder::region);
        return userBuilder.build();
    }
}

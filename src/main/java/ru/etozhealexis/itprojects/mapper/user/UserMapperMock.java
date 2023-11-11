package ru.etozhealexis.itprojects.mapper.user;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.model.User;

@Component
@Profile("Dev")
public class UserMapperMock implements UserMapper {
    @Override
    public User map(UserRegistrationDTO userRegistrationDTO) {
        return User.builder()
                .password("12345")
                .email("sample@yahoo.com")
                .userName("username")
                .build();
    }

    @Override
    public User map(UserProfileDTO userProfileDTO) {
        return null;
    }
}

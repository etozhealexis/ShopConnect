package ru.etozhealexis.itprojects.service.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.model.User;

@Service
@Profile("Dev")
@Slf4j
public class UserServiceMock implements UserService {
    @Override
    public void register(UserRegistrationDTO userRegistrationDTO) {
        log.info("registered user: " + userRegistrationDTO.toString());
    }

    @Override
    public void edit(UserProfileDTO userProfileDTO) {
        log.info("edited user: " + userProfileDTO.toString());
    }

    @Override
    public void save(User user) {
        log.info("saved user: " + user.toString());
    }

    @Override
    public void update(User user) {
        log.info("updated user: " + user.toString());
    }
}

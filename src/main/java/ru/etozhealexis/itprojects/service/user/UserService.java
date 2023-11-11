package ru.etozhealexis.itprojects.service.user;

import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.model.User;

public interface UserService {
    void register(UserRegistrationDTO userRegistrationDTO);
    void edit(UserProfileDTO userProfileDTO);
    void save(User user);
    void update(User user);
}

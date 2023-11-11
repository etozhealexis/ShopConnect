package ru.etozhealexis.itprojects.mapper.user;

import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.model.User;


public interface UserMapper {
    User map(UserRegistrationDTO userRegistrationDTO);

    User map(UserProfileDTO userProfileDTO);
}

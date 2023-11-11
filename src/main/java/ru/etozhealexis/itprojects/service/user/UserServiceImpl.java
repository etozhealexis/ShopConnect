package ru.etozhealexis.itprojects.service.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.etozhealexis.itprojects.dto.UserProfileDTO;
import ru.etozhealexis.itprojects.dto.UserRegistrationDTO;
import ru.etozhealexis.itprojects.exception.PasswordConfirmationException;
import ru.etozhealexis.itprojects.mapper.user.UserMapper;
import ru.etozhealexis.itprojects.model.User;
import ru.etozhealexis.itprojects.repository.UserRepository;


@Service
@Profile("Prom")
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Transactional
    public void register(UserRegistrationDTO userRegistrationDTO) {
        if (!userRegistrationDTO.getPassword().equals(userRegistrationDTO.getPasswordConfirmation())) {
            throw new PasswordConfirmationException();
        }
        User user = userMapper.map(userRegistrationDTO);
        save(user);
    }

    @Transactional
    public void edit(UserProfileDTO userProfileDTO) {
        User user = userMapper.map(userProfileDTO);
        update(user);
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

//    @Transactional
    public void update(User user) {
        log.info(user.toString());
//        userRepository.update(user.getUserName());
    }
}

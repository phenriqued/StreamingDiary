package phenriqued.com.github.StreamingDiary.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phenriqued.com.github.StreamingDiary.DTO.UserDTO;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;
import phenriqued.com.github.StreamingDiary.Repositories.UserRepository;
import phenriqued.com.github.StreamingDiary.Util.Email.Email;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserDTO login(Email email, String password) {
        UserEntity user = userRepository.findByEmail(email);
        if(user != null && user.getPassword().equals(password)){
            return new UserDTO(user);
        }
        return null;
    }

}

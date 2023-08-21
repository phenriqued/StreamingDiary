package phenriqued.com.github.StreamingDiary.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phenriqued.com.github.StreamingDiary.Repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


}

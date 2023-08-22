package phenriqued.com.github.StreamingDiary.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;
import phenriqued.com.github.StreamingDiary.Repositories.UserRepository;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        UserEntity user1 = new UserEntity(null, "test1", "12345", "testProfile1@gmail.com");
        UserEntity user2 = new UserEntity(null, "test2", "12345", "testProfile2@gmail.com");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }



}

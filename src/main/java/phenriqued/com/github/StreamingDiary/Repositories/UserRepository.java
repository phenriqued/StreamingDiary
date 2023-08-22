package phenriqued.com.github.StreamingDiary.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;
import phenriqued.com.github.StreamingDiary.Util.Email.Email;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(Email email);
}

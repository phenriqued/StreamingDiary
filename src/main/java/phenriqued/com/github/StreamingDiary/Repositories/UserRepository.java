package phenriqued.com.github.StreamingDiary.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

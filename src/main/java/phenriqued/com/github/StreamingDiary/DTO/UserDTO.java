package phenriqued.com.github.StreamingDiary.DTO;

import org.springframework.beans.BeanUtils;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;
import phenriqued.com.github.StreamingDiary.Util.Email.Email;

public class UserDTO {

    private Long id;
    private String nickName;
    private String password;
    private Email email;

    public UserDTO() {}
    public UserDTO(UserEntity entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}

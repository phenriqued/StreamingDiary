package phenriqued.com.github.StreamingDiary.Entities;

import jakarta.persistence.*;
import phenriqued.com.github.StreamingDiary.DTO.UserDTO;
import phenriqued.com.github.StreamingDiary.Util.Email.Email;

import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nickName;
    private String password;
    @Embedded
    private Email email;

    public UserEntity() {}

    public UserEntity(Long id, String nickName, String password, String email) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.email = new Email(email);
    }
    public UserEntity(UserDTO dto){
        this.id = dto.getId();
        this.nickName = dto.getNickName();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
    }

    public Long getId() {
        return id;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName){
        if(nickName == null || nickName.equals(this.getNickName())){
            throw new RuntimeException("[ERROR]: The Nick Name cannot be the same as the previous one!.");
        }
        this.nickName = nickName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        if (password == null || password.equals(this.getPassword())){
            throw new RuntimeException("[ERROR]: The password cannot be the same as the previous one!.");
        }
        this.password = password;
    }
    public Email getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email.setEmailAddress(email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity that)) return false;

        return Objects.equals(id, that.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}

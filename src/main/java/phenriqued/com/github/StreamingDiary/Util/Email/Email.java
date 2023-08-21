package phenriqued.com.github.StreamingDiary.Util.Email;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {
    private String emailAddress;

    public Email() {}

    public Email(String emailAddress){
        if(emailAddress == null || !emailAddress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")){
            throw new RuntimeException("[ERROR]: Invalid e-mail.");
        }
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return  this.emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        if(emailAddress == null || !emailAddress.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new RuntimeException("Invalid e-mail.");
        }
        if(emailAddress.equalsIgnoreCase(this.getEmailAddress())){
            throw new RuntimeException("The email cannot be the same as the previous one!.");
        }
        this.emailAddress = emailAddress;
    }
}

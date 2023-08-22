package phenriqued.com.github.StreamingDiary.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phenriqued.com.github.StreamingDiary.Services.UserService;

@Controller
@RequestMapping("/StreamingDiary/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showRegisterForm(){
        return  "AuthenticationScreen/register";
    }




}

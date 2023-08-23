package phenriqued.com.github.StreamingDiary.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import phenriqued.com.github.StreamingDiary.DTO.UserDTO;
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

    @PostMapping
    public String processRegister(@RequestBody UserDTO user){
        userService.save(user);
        return "AuthenticationScreen/login";
    }
}

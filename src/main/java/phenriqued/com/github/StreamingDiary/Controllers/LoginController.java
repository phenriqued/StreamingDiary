package phenriqued.com.github.StreamingDiary.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import phenriqued.com.github.StreamingDiary.DTO.UserDTO;
import phenriqued.com.github.StreamingDiary.Entities.UserEntity;
import phenriqued.com.github.StreamingDiary.Services.UserService;

@Controller
@RequestMapping("/StreamingDiary/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showLoginForm(){
        return "AuthenticationScreen/login";
    }

    @PostMapping
    public String processLogin(@RequestBody UserDTO userDTO){
        UserDTO user = userService.login(userDTO.getEmail(), userDTO.getPassword());
        if(user != null){
            return "redirect:/StreamingDiary/home";
        }else{
            return "redirect:/StreamingDiary/login";
        }
    }

}

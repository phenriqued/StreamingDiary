package phenriqued.com.github.StreamingDiary.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StreamingDiary")
public class WelcomeController {

    @GetMapping
    public String welcomeScreen(){
        return "index";
    }

    @GetMapping("/register")
    public String registerScreen(){
        return "Authentication/register";
    }



}

package phenriqued.com.github.StreamingDiary.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/StreamingDiary/home")
public class HomePageController {

    @GetMapping
    public String welcomeScreen(){
        return "HomeScreen/home";
    }


}

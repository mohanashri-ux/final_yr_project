package healify_home.heal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/hi")
    String helloworld(){
        return  "Hi !";
    }

}

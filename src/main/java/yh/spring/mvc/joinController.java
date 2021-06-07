package yh.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class joinController {


    @GetMapping("/join/agree")
    public String agree(){
    return "join/agree.tiles";
    }
    @GetMapping("/join/chechkme")
    public String chechkme(){
        return "join/chechkme.tiles";
    }
    @GetMapping("/join/joinme")
    public String joinme(){
        return "join/joinme.tiles";
    }
    @GetMapping("/join/joinok")
    public String joinok(){
        return "join/joinok.tiles";
    }

}

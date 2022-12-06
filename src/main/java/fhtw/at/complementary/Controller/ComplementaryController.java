package fhtw.at.complementary.Controller;

import fhtw.at.complementary.Service.ComplementaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
public class ComplementaryController {

    @GetMapping("/comp/{color}")
    public String calculateComplementary(@PathVariable String color) {


        if (color.equals("Red")) {
            return "Green";
        } else if (color.equals("Orange")) {
            return "Blue";
        } else if (color.equals("Yellow")) {
            return "Purple";
        } else if (color.equals("Green")) {
            return "Red";
        } else if (color.equals("Blue")) {
            return "Orange";
        } else {
            return "Yellow";
        }
    }
}*/
@RestController
public class ComplementaryController {
    private final ComplementaryService compService;

    public ComplementaryController (ComplementaryService compService){
        this.compService = compService;
    }

    @GetMapping("/comp/{color}")
    String getColor(@PathVariable String color){
        return compService.getComplementary(color);
    }

}

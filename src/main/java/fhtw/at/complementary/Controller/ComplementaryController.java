package fhtw.at.complementary.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComplementaryController {

    @GetMapping("/comp/{color}")
    public String calculateRectangular(@PathVariable String color) {


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
}

package fhtw.at.complementary.DTO;

public class Color {
    public String getComplementaryColor(String color){

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

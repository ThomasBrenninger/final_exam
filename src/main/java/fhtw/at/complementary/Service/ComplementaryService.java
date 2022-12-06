package fhtw.at.complementary.Service;

import fhtw.at.complementary.DTO.Color;
import org.springframework.stereotype.Service;

@Service
public class ComplementaryService {

    private final Color color = new Color();

    public String getComplementary(String color){
        return this.color.getComplementaryColor(color);
    }
}

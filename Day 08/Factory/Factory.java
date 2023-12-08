package Factory;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    
    public Toy create(String toy) {
        switch (toy) {
            case "teddy":
                return new TeddyBear();

            case "gameboy":
                return new Gameboy();
        
            default:
                throw new NoSuchToyException(NoSuchToyException.MESSAGE_TOY_EXCEPTION.replace("[toy name]", toy));
        }
    }

    public List<GiftPaper> getPapers(int numberOfPaers) {
        List<GiftPaper> papers = new ArrayList<>();
        for (int i = 0; i < numberOfPaers; i++) {
            papers.add(new GiftPaper());
        }
        return papers;
    }
}

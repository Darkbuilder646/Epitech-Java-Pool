package Factory;

import java.util.List;

public class Elf {
    private Toy toy;
    private List<GiftPaper> papers;
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
        this.toy = null;
        this.papers = null;
    }

    public boolean pickToy(String toyName) {
        if (toy != null) {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }

        Toy newToy = factory.create(toyName);
        if (newToy != null) {
            System.out.println("What a nice one! I would have liked to keep it...");
            toy = newToy;
            return true;
        } else {
            System.out.println("I didn't find any " + toyName + ".");
            return false;
        }
    }

    public boolean pickPapers(int nb) {
        papers = factory.getPapers(nb);
        return true;
    }

    public GiftPaper pack() {
        if (toy != null) {
            if (papers != null && !papers.isEmpty()) {
                GiftPaper giftPaper = papers.remove(0);
                giftPaper.wrap(toy);
                toy = null;
                System.out.println("And another kid will be happy!");
                return giftPaper;
            } else {
                System.out.println("Wait... I can't pack it with my shirt.");
                return null;
            }
        } else {
            System.out.println("I don't have any toy, but hey at least it's paper!");
            return null;
        }

        // if(papers != null && !papers.isEmpty()) {
        //     return null;
        // }

        // if(toy != null && (papers != null && !papers.isEmpty())) {
        //     System.out.println("Wait... I can't pack it with my shirt.");
        //     return null;
        // }
        
        // if(toy != null) {
        //     GiftPaper giftPaper = papers.remove(0);
        //     giftPaper.wrap(toy);
        //     toy = null;
        //     System.out.println("And another kid will be happy!");
        //     return giftPaper;
        // }
        // else {
        //     System.out.println("I don't have any toy, but I've some paper!");
        //     return null;
        // }


    }
}

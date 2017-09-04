import java.util.Arrays;
import java.util.Date;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;



public class Example {
    public static void main(String[] args) {
        Treet treet = new Treet(
                "David Lim",
                "Join us for the first annual Veterans in Tech Summit where Seattle’s top technology, corporate, education, and civic leaders will showcase the innovation and opportunities available with the region’s military presence.",
                new Date(1504229850L)
        );
        Treet secondTreet = new Treet(
                "journeytocode",
                "@Treehouse makes learning Java so fun.",
                new Date()
        );
        System.out.printf("This is a new Treet: %s %n", treet);
        System.out.println("The words are: ");
        for (String word: treet.getWords()) {
            System.out.println(word);
        }
        Treet[] treets = {treet, secondTreet };
        Arrays.sort(treets);
        for (Treet exampleTreet : treets) {
            System.out.println(exampleTreet);
        }
        Treets.save(treets);
        Treet[] reloadedTreets = Treets.load();
        for (Treet reloaded : reloadedTreets) {
            System.out.println(reloaded);
        }
    }
}
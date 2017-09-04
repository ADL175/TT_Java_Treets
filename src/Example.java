import java.util.*;

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;


public class Example {

    public static void main(String[] args) {
        Treet[] treets = Treets.load();
        System.out.printf("There are %d treets. %n",
                treets.length);
        Set<String> allHashTags = new HashSet<>();
        Set<String> allMentions = new TreeSet<>();
        for (Treet treet : treets) {
            allHashTags.addAll(treet.getHashTags());
            allMentions.addAll(treet.getMentions());
        }
        System.out.printf("Hashtags: %s %n",
                allHashTags);
        System.out.printf("Mentions: %s %n",
                allMentions);
    }

}
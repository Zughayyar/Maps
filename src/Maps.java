import java.util.HashMap;
import java.util.Set;
public class Maps {
    public static void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<>();
        trackList.put("Bohemian Rhapsody" , "Mama, just killed a man, put a gun against his head, pulled my trigger, now he's dead...");
        trackList.put("Rolling in the Deep", "We could have had it all, rolling in the deep...");
        trackList.put("Hotel California", "You can check out any time you like, but you can never leave...");

        System.out.println(trackList.get("Hotel California"));
        //System.out.println(trackList);
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }

    }
}
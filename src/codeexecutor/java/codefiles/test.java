import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String message = "It worked !!";
//        while(true) {
//            System.out.println(message);
//        }

        List<String> hobbies = new ArrayList<>(Arrays.asList("cricket", "eating", "cooking"));
        for (String hobby: hobbies) {
            System.out.println(hobby);
        }
    }
}

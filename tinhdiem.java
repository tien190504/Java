
import java.util.*;
public class tinhdiem {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        int score = 0;
        int currentscore = 0;
        for(int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if(c == 'C') {
                currentscore++;
                score += currentscore;
            }
            else currentscore = 0;
        }
        System.out.println(score);
        sc.close();
    }
}

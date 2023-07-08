import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class First {
    
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ArrayList<Integer> rndArr = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            int rndNum = ThreadLocalRandom.current().nextInt(0, 20);
            rndArr.add(rndNum);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
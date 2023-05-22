package RandomNumGen;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random dice = new Random();
        int number= 0;
    
        for(int counter = 1; counter <= 10; counter ++){
            number = dice.nextInt(6) + 1; // 0 - 5 , if want 6 = nextInt(7)
            System.out.println(number);
        }  
    }
    
}

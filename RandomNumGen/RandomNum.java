package RandomNumGen;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        // Random dice = new Random();
        // int number= 0;
    
        // for(int counter = 1; counter <= 10; counter ++){
        //     number = dice.nextInt(6) + 1; // 0 - 5 , if want 6 = nextInt(7)
        //     System.out.println(number);
        // }  

        //Array Elements as counter
        Random random = new Random();
        int freq[] = new int[7];
        for(int roll = 1; roll < 1000; roll ++){
            ++freq[random.nextInt(6) + 1]; //every time it rolled a 1, it adds +1 to frequency table
        } 
        System.out.println("Face\tFrequency");

        for(int face = 1; face < freq.length; face++){
            System.out.println(face + "\t" + freq[face]); //shows how many times 1-6 is rolled  
        }
    }
    
}

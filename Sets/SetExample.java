package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

public class SetExample {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println); //pass println as argument to for each. for each then calls println method to each element in balls

        // List<Ball> list = new ArrayList<>();
        // list.add(new Ball("blue"));
        // list.add(new Ball("orange"));
        // list.add(new Ball("grey"));
        // list.forEach(System.out::println);
    }

    record Ball(String colour){}
}

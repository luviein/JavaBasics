package MethodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collections;

public class ReverseCollection {
    
    public static List<Integer> generateRandNum(){
        return new Random().ints(1 , 31).distinct().limit(10).boxed().collect(Collectors.toList());

    }
    
    public static void reverse(List<Integer> list){
       Collections.sort(list, Collections.reverseOrder());
    }


    public static void main(String[] args) {
        List<Integer> list = generateRandNum();
        System.out.println("before reverse: " + list);
        reverse(list);
        System.out.println("after reverse: " + list);

    }
}

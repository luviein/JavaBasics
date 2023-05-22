package VariableLengthArgs;

public class VarLengthArg {
    public static void main(String[] args) {
        System.out.println("Average is: " + average(10,69,24,104));
    }

    public static int average(int ... numbers){ //used when dont know need to pass in how many numbers
        int total = 0;
        for(int x : numbers){
            total += x;
        }
        return (total/numbers.length);
    }
}

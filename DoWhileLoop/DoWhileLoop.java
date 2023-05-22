package DoWhileLoop;

public class DoWhileLoop {
    
    //will always run at least once etc: print out 15
    //only run once, if doesn't fulfil while condition it will not continue the loop
    public static void main(String[] args) {
        int counter = 15;
        do{
            System.out.println(counter);
            counter ++;
        }while(counter<=10);
    }
}

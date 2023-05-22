package Arrays;

public class ArrayExample {

    // diff ways to create array

    // cam only store same data type
    /*
     * int bucky[] = new int[10]; //indicates how many numbers you wanna put in the
     * int array
     * bucky[0] = 100;
     * bucky[1] = 40;
     * bucky[9] = 3;
     */
    public static void main(String[] args) {
        int bucky[] = { 1, 2, 3, 4, 5 };

        // SUMMING ELEMENTS OF ARRAY (5 + 4 + 3 + 2 + 1)
        /* 
        int sum = 0;
        for (int counter = 0; counter < bucky.length; counter++) {
        sum += bucky[counter];

        }
        System.out.println("Sum of these numbers: " + sum); 
        */
        
        //ENHANCED FOR LOOP
        /* 
        int total = 0;
        for(int i : bucky){
            total += i;
        }
        System.out.println(total);
        */

        //ARRAYS IN METHODS
        //change(bucky);





    }

    public static void change(int x[]){
        for(int counter = 0; counter < x.length; counter ++){
            x[counter] += 5; //adds 5 to each value in the array
        }
        
        for(int j : x){
            System.out.println(j);
        }
    }

}

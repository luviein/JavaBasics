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

        // summing elements of array (5 + 4 + 3 + 2 + 1)
        int sum = 0;
        for (int counter = 0; counter < bucky.length; counter++) {
            sum += bucky[counter];

        }
        System.out.println("Sum of these numbers: " + sum);
    }

}

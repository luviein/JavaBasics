public class MultiDim{

    public static void main(String[] args) {
        
        //MULTIDIMENSIONAL ARRAY
        int firstArray[][] = {{8,9,10,11}/*first element = [0][1] */, {12,13,14,15}}; // []table[]row
        int secondArray[][] = {{30,31,32,33}, {43}/*[1][0] */, {4,5,6}};
        System.out.println("This is the first array:");
        display(firstArray);
        System.out.println("This is the second array:");
        display(secondArray);
    }

    public static void display(int x[][]){
        for(int row = 0; row < x.length; row++){
            for(int column = 0; column<x[row].length; column ++){ //checking for column[0].length
                System.out.print(x[row][column]+"\t");
            }
            System.out.println(); //prints a line before going to next loop

        }
    }
}
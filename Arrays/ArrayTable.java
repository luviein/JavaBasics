package Arrays;

public class ArrayTable {
    public static void main(String[] args) {
        // /t adds 5 spaces behind
        System.out.println("Index\tValue");
        int bucky[] = {1,2,3,4,5,6};
        for(int counter = 0; counter < bucky.length; counter ++){
            System.out.println((counter+1) + "\t" + bucky[counter]);
        }
    }

}

package CompoundInterestProgram;

public class CompoundInterest{
   
   public static void main(String[] args) {
        double amount;
        double principal = 10_000;
        double rate = .01; // 1 percent

        for(int day=1 ; day <= 20; day ++){
           amount = principal * Math.pow(1 + rate, day);
           System.out.println(day + "  " + amount);
        }
   }
    



}
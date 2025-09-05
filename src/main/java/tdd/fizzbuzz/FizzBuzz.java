package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        String Fizz = ifMutipleOf3or5(order);
        if (Fizz != null) return Fizz;
        return "" + order;
    }

    private static String ifMutipleOf3or5(int order) {
        boolean isMultipleOf3 = order % 3 == 0;
        boolean isMultipleOf5 = order % 5 == 0;
        if (isMultipleOf3 && isMultipleOf5) {
            return "FizzBuzz";
        } 
        else if (isMultipleOf3){
            return "Fizz";
        }
        else if(isMultipleOf5){
            return "Buzz";
        }
        return null;
    }
}

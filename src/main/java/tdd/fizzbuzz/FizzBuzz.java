package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        String Fizz = ifMutipleOf3or5(order);
        if (Fizz != null) return Fizz;
        return "" + order;
    }

    private static String ifMutipleOf3or5(int order) {
        if (order % 3 == 0 && order % 5 == 0) {
            return "FizzBuzz";
        } 
        else if (order % 3 == 0){
            return "Fizz";
        }
        else if(order % 5 == 0){
            return "Buzz";
        }
        return null;
    }
}

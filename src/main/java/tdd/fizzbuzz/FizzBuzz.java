package tdd.fizzbuzz;

public class FizzBuzz {
    public static String countOff(int order) {
        if (order % 3 == 0 && order % 5 == 0) {
            return "FizzBuzz";
        }

        return "" + order;
    }
}

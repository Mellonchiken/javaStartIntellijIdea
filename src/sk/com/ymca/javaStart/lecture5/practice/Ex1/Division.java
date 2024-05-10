package sk.com.ymca.javaStart.lecture5.practice.Ex1;

public class Division {
    public void division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("You can`t divide by 0.");
        } else {
            System.out.println(number1 / number2);
        }
    }
}

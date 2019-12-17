import java.util.*;

public class RomanMain {
    public static void main(String args[]) {
        RomanToNumber object = new RomanToNumber();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Roman Number here: ");
        String str = input.nextLine();
        object.setRomain(str);
        System.out.println("Integer form of Roman Numeral" + " is " + object.getRomain());
    }
}
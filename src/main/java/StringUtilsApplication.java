import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type something");
        String input = sc.nextLine();

        System.out.println("You entered: " + input);

        System.out.println("This is a number: " + StringUtils.isNumeric(input));
        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}

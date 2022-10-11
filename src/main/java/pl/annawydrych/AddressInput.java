package pl.annawydrych;
import java.util.Scanner;

public class AddressInput {

    public void myAddress() {

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);
    }
}

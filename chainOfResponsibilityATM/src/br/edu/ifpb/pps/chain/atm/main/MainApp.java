package br.edu.ifpb.pps.chain.atm.main;

import java.util.Scanner;

import br.edu.ifpb.pps.chain.atm.model.DispenserHandler;
import br.edu.ifpb.pps.chain.atm.model.FiftyATMDispenser;
import br.edu.ifpb.pps.chain.atm.model.FiveATMDispenser;
import br.edu.ifpb.pps.chain.atm.model.OneHundredATMDispenser;
import br.edu.ifpb.pps.chain.atm.model.TenATMDispenser;
import br.edu.ifpb.pps.chain.atm.model.TwentyATMDispenser;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Informe a quantia para saque: ");

        DispenserHandler fiveDispenser = new FiveATMDispenser();
        DispenserHandler tenDispenser = new TenATMDispenser();
        DispenserHandler twentyDispenser = new TwentyATMDispenser();
        DispenserHandler fiftyDispenser = new FiftyATMDispenser();
        DispenserHandler oneHundredDispenser = new OneHundredATMDispenser();

        oneHundredDispenser.setNextDispenser(fiftyDispenser);
        fiftyDispenser.setNextDispenser(twentyDispenser);
        twentyDispenser.setNextDispenser(tenDispenser);
        tenDispenser.setNextDispenser(fiveDispenser);

        Integer amount = scanner.nextInt();  // Read user input
        // Starts at one hundred
        oneHundredDispenser.getAmount(amount);

        scanner.close();
    }
}
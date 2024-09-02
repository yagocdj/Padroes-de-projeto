package br.edu.ifpb.pps.chain.atm.model;

public class FiftyATMDispenser extends ATMDispenser {

    @Override
    public void getAmount(final Integer amount) {
        if (amount >= 50) {
            Integer quantity = amount / 50;

            System.out.println("Dispensando " + quantity + " notas de R$50,00");

            Integer remainder = amount % 50;
            if (remainder != 0) {
                this.nextDispenser.getAmount(remainder);
            }
        } else {  // amount < 50
            this.nextDispenser.getAmount(amount);
        }
    }
}
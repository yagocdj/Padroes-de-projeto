package br.edu.ifpb.pps.chain.atm.model;

public class FiveATMDispenser extends ATMDispenser {
    @Override
    public void getAmount(final Integer amount) {
        if (amount >= 5) {
            Integer quantity = amount / 5;

            System.out.println("Dispensando " + quantity + " notas de R$5,00");

            Integer remainder = amount % 5;
            if (remainder != 0) {
                this.nextDispenser.getAmount(remainder);
            }
        } else {  // amount < 5
            this.nextDispenser.getAmount(amount);
        }
    }
}

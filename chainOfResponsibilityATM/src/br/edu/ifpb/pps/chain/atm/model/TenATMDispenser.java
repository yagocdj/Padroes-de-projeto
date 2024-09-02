package br.edu.ifpb.pps.chain.atm.model;

public class TenATMDispenser extends ATMDispenser {

    @Override
    public void getAmount(final Integer amount) {
        if (amount >= 10) {
            Integer quantity = amount / 10;

            System.out.println("Dispensando " + quantity + " notas de R$10,00");

            Integer remainder = amount % 10;
            if (remainder != 0) {
                this.nextDispenser.getAmount(remainder);
            }
        } else {  // amount < 10
            this.nextDispenser.getAmount(amount);
        }
    }

}

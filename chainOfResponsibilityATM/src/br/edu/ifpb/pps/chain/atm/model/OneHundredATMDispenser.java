package br.edu.ifpb.pps.chain.atm.model;

public class OneHundredATMDispenser extends ATMDispenser {
   
    @Override
    public void getAmount(final Integer amount) {
        if (amount >= 100) {
            Integer quantity = amount / 100;

            System.out.println("Dispensando " + quantity + " notas de R$100,00");

            Integer remainder = amount % 100;
            if (remainder != 0) {
                this.nextDispenser.getAmount(remainder);
            }
        } else {  // amount < 100
            this.nextDispenser.getAmount(amount);
        }
    }
}

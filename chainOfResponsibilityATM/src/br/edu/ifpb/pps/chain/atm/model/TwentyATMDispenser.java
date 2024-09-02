package br.edu.ifpb.pps.chain.atm.model;

public class TwentyATMDispenser extends ATMDispenser {

    @Override
    public void getAmount(Integer amount) {
        if (amount >= 20) {
            Integer quantity = amount / 20;
            
            System.out.println("Dispensando " + quantity + " notas de R$20,00");
            
            Integer remainder = amount % 20;
            if (remainder != 0) {
                this.nextDispenser.getAmount(remainder);
            }
        } else {  // amount < 20
            this.nextDispenser.getAmount(amount);
        }
    }

}
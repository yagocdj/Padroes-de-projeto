package br.edu.ifpb.pps.chain.atm.model;

public abstract class ATMDispenser implements DispenserHandler {
    
    protected DispenserHandler nextDispenser;

    @Override
    public void setNextDispenser(DispenserHandler nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

}

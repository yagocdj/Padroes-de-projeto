package br.edu.ifpb.pps.chain.atm.model;

public interface DispenserHandler {
    public void setNextDispenser(DispenserHandler dispenserHandler);
    public void getAmount(Integer amount);
}

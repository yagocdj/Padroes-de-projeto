package br.edu.ifpb.pps.state;

public interface State {

    public void nextState();
    public Sinal getEstadoAtual();
}

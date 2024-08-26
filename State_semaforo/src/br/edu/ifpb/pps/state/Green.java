package br.edu.ifpb.pps.state;

public class Green implements State {

    private Semaforo semaforo;

    public Green(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void nextState() {
        semaforo.changeState(new Yellow(this.semaforo));
    }

    @Override
    public Sinal getEstadoAtual() {
        return Sinal.VERDE;
    }
    
}

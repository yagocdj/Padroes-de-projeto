package br.edu.ifpb.pps.state;

public class Yellow implements State {

    private Semaforo semaforo;

    public Yellow(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void nextState() {
        semaforo.changeState(new Red(semaforo));
    }

    @Override
    public Sinal getEstadoAtual() {
        return Sinal.AMARELO;
    }
    
}

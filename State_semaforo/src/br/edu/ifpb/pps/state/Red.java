package br.edu.ifpb.pps.state;

public class Red implements State {

    private Semaforo semaforo;

    public Red(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void nextState() {
        semaforo.changeState(new Green(this.semaforo));
    }

    @Override
    public Sinal getEstadoAtual() {
        return Sinal.VERMELHO;
    }
    
}

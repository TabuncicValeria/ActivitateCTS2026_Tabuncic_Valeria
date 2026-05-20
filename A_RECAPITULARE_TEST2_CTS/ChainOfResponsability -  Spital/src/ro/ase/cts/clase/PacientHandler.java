package ro.ase.cts.clase;

public abstract class PacientHandler {

    protected PacientHandler pacientHandler;

    public PacientHandler() {
        this.pacientHandler = null;
    }

    public void setPacientHandler(PacientHandler pacientHandler) {
        this.pacientHandler = pacientHandler;
    }

    public abstract String directioneazaPacient(Pacient pacient);
}
package ro.ase.cts.clase;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Clientul a platit cu cardul suma de "+suma+" lei.");
    }
}

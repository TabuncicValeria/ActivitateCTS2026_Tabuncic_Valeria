package ro.ase.cts.clase;

public class PlataCash implements ModPlata{

    @Override
    public void plateste(float suma) {
        System.out.println("Clientul a platit cash suma de "+suma+" lei");
    }
}

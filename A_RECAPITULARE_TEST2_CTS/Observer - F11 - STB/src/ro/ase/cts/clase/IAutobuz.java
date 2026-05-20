package ro.ase.cts.clase;

public interface IAutobuz {
    void trimiteNotificare(String mesaj);
    void aboneazaCalator(ICalator calator);
    void dezaboneazaCalator(ICalator calator);
}

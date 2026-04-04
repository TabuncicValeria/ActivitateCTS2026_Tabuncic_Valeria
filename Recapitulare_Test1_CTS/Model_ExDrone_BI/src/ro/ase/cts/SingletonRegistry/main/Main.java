package ro.ase.cts.SingletonRegistry.main;

import ro.ase.cts.SingletonRegistry.model.MicroServiceRegistry;

public class Main {
    /*2.	În backend, trebuie să gestionezi conexiunea către diferite microservicii REST API, cum ar fi serviciul
    de utilizatori, serviciul de date meteo, serviciul cu date de fabricație, etc. Fiecare serviciu are un nume unic
    și o adresă URL asociată, bazate pe clasa AbstractMicroService. De asemenea, fiecare serviciu acceptă o singură
    conexiune de la fiecare client. Implementează o clasă care va gestiona conexiunile unice pentru microservicii,
    extinzând AbstractMicroService. */

    public static void main(String[] args)
    {
        MicroServiceRegistry s1=MicroServiceRegistry.getInstance("User service","https://api.app.ro/users");
        MicroServiceRegistry s2=MicroServiceRegistry.getInstance("Meteo service","https://api.app.ro/users");
        MicroServiceRegistry s3=MicroServiceRegistry.getInstance("Fabricare service","https://api.app.ro/users");

        System.out.println("s1 si s2 sunt aceeasi instanta? " + (s1 == s2));
        System.out.println("s1 si s3 sunt aceeasi instanta? " + (s1 == s3));

        s1.connect();
        s3.connect();

        s2.connect();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

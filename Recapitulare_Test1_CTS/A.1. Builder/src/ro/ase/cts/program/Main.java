package ro.ase.cts.program;

import ro.ase.cts.builder_v1.Internare;
import ro.ase.cts.builder_v1.InternareBuilder;
import ro.ase.cts.builder_v2.Internare2;
import ro.ase.cts.builder_v2.InternareBuilder2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Builder - Versiunea 1");
        Internare internare1=new InternareBuilder("Tiberiu Alexandru").setPatRabatabil(true).setMicDejun(true).build();
        Internare internare2=new InternareBuilder("Tecaru Gabriel").build();
        System.out.println(internare1);
        System.out.println(internare2);

        System.out.println("Builder - Versiunea 1");
        Internare2 internare21=new InternareBuilder2("Tomescu Alexandru").setPatRabatabil(true).setMicDejun(true).build();
        Internare2 internare22=new InternareBuilder2("Tanasa Gabriel").build();
        System.out.println(internare21);
        System.out.println(internare22);
    }
}
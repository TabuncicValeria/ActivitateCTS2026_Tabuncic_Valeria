package ro.ase.cts.main;

import ro.ase.cts.clase.AdapterSoftBar;
import ro.ase.cts.clase.ISoftRestaurant;
import ro.ase.cts.clase.SoftBar;
import ro.ase.cts.clase.SoftBucatarie;

public class Main {
    public static void main(String[] args) {
        /*B.5.	Restaurantul achiziționează un nou soft nou pentru lucrul de la bar, însă acesta nu este compatibil cu
        softul de printare facturi folosit pentru produsele de la bucătărie. Vechiul soft era compatibil deoarece au
        fost realizate de aceeași echipa. Să se implementeze un nivel intermediar prin care noul soft să poată fi folosit
        cu softul existent, fără a se modifica codul din vreo aplicație.  */
        System.out.println("Adapter - B5 - RESTAURANT - ADAPTER DE OBIECTE");

        ISoftRestaurant softBucatarie=new SoftBucatarie("Paste cu ciuperci");
        softBucatarie.printeazaFactura();

        SoftBar softBar=new SoftBar("Frappe");
        ISoftRestaurant adapter=new AdapterSoftBar(softBar);
        adapter.printeazaFactura();
    }
}
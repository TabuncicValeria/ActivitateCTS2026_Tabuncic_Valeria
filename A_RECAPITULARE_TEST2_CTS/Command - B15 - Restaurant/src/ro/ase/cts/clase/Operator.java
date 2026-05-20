package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<ICommand> listaComenzi=new ArrayList<>();

    public Operator() {
    }
    public void adaugaComanda(ICommand command){
        listaComenzi.add(command);
    }

    public void executaComanda()
    {
        if(listaComenzi.size()>0)
        {
            listaComenzi.removeFirst().executa();
        }
        else {
            System.out.println("Lista de comenzi este goala!");
        }
    }
}

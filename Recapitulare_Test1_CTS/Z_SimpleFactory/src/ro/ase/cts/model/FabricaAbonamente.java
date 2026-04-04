package ro.ase.cts.model;

public class FabricaAbonamente {
    public AbonamentAbstract creareAbonament(TipAbonament tip,String numePlan,int numarDispozitive,double pretBaza)
    {
        switch(tip){
            case FREE:
                return new AbonamentFree(numePlan,numarDispozitive,pretBaza);
            case FAMILIY:
                return new AbonamentFamily(numePlan,numarDispozitive,pretBaza);
            case STUDENT:
                return new AbonamentStudent(numePlan,numarDispozitive,pretBaza);
            case PREMIUM:
                return new AbonamentPremium(numePlan,numarDispozitive,pretBaza);
            default:
                throw new IllegalArgumentException("Nu exista acest tip de abonament!");
        }

    }
}

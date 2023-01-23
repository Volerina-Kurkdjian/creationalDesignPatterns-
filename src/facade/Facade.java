package facade;

public class Facade {

    public static boolean esteMasaPregatita(Masa masa){
        if(OperatorMese.esteLibera(masa.getNrMasa())){
            Picolo picolo=new Picolo("Gigel");
            if(picolo.esteDebarasata(masa.getNrMasa())){
                if(picolo.esteAranjata(masa.getNrMasa())){
                    System.out.println("Poftiti la masa");
                }
            }
        }

        return false;
    }

}

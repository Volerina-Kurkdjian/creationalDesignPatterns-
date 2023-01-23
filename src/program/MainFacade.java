package program;

import facade.Facade;
import facade.Masa;
import facade.OperatorMese;
import facade.Picolo;

public class MainFacade {

    public static void main(String[] args) {
        Masa masa=new Masa(30,10);
        if(OperatorMese.esteLibera(masa.getNrMasa())){
            Picolo picolo=new Picolo("Gigel");
            if(picolo.esteDebarasata(masa.getNrMasa())){
                if(picolo.esteAranjata(masa.getNrMasa())){
                    System.out.println("Poftiti la masa");
                }
                System.out.println("Va rog sa mai asteptati!");
            }
            System.out.println("Va rog sa mai asteptati!");
        }
        else{
            System.out.println("Va rog sa mai asteptati!");
        }

        if(Facade.esteMasaPregatita(new Masa(30,4))){
            System.out.println("Poftiti la masa");
        }
        else{
            System.out.println("Va rog sa mai asteptati!");
        }


    }
}

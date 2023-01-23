package program;

import command.*;

public class MainComand {

    public static void main(String[] args) {
        ManagerComenzi managerComenzi=new ManagerComenzi();
        Executant cont=new Executant("George");

        ComandCreare comandCreare=new ComandCreare(cont,1000);
        managerComenzi.adaugaComanda(comandCreare);
        managerComenzi.adaugaComanda(new ComandRetragere(cont,123));
        managerComenzi.adaugaComanda(new ComandDepunere(cont,50));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}

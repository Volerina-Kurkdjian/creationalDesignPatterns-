package program;

import flyweight.Client;
import flyweight.FabricaClienti;
import flyweight.Reteta;

public class MainFlyweight {

    public static void main(String[] args) {
        FabricaClienti fabricaClienti=new FabricaClienti();
        Reteta reteta1=new Reteta(1,100,5);
        Client client1=new Client("Ion",1);
        client1.printareReteta(reteta1);

        Reteta reteta2=new Reteta(2,50,2);
        client1.printareReteta(reteta2);

        fabricaClienti.getClient(client1.getNumarAsigurare(), client1.getNume()).printareReteta(reteta2);
        Client client2= (Client) fabricaClienti.getClient(1,"cineva");


    }
}

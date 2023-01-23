package flyweight;

import java.util.HashMap;

public class FabricaClienti {

    private HashMap<Integer, Client> clienti;

    public FabricaClienti(HashMap<Integer, Client> clienti) {
        this.clienti = new HashMap<Integer, Client>();

    }

    public FabricaClienti() {
        this.clienti = new HashMap<Integer, Client>();
    }

    public IClient getClient(int nrAsigurare, String nume) {
        IClient client = clienti.get(nrAsigurare);
        if(client==null){
            client=new Client(nume,nrAsigurare);
        }
        return client;
    }

    public  int getClienti(){
        return  clienti.size();
    }
}

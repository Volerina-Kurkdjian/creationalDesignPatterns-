package adapter;

public class ClassesAdapter extends Leasing implements Creditable{


    public ClassesAdapter(String numeClient, int suma) {
        super(numeClient, suma);
    }

    @Override
    public void crediteaza() {
        super.oferaLeasing();//it works with this too, because this contains super
        //but we want to explicitly mention that it is the method from the parent class
    }
}

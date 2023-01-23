package program;

import adapter.AdapterLeasing;
import adapter.ClassesAdapter;
import adapter.Creditable;
import adapter.Leasing;

public class MainAdapter {

    public static void print(Creditable credit){
            credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing=new Leasing("George ",10000);
        //print((Creditable) leasing); will give ClassCastException
        AdapterLeasing adapterLeasing=new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();
        print(adapterLeasing);

        //class adapter
        ClassesAdapter classesAdapter=new ClassesAdapter("Georgiana",123456);
        print(classesAdapter);

    }
}

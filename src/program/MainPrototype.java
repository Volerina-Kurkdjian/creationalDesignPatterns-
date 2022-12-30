package program;

import prototype.classes.AbstractPrototype;
import prototype.classes.DrugPrescription;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {

    public static void main(String[] args) {
        //prototype
        List<String> solution=new ArrayList<>();
        solution.add("AQUA");
        List<Integer> quantities=new ArrayList<>();
        quantities.add(100);
        List<String> solutions1=new ArrayList<>();
        solutions1.add("HYDROCLERIN");

        AbstractPrototype drugPrescription=new DrugPrescription(solution,quantities);
        DrugPrescription drugPrescription1= (DrugPrescription) drugPrescription.copy();
        drugPrescription1.setSolutions(solutions1);

        System.out.println(drugPrescription);
        System.out.println(drugPrescription1);



    }
}

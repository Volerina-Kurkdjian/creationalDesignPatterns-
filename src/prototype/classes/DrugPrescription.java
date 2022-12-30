package prototype.classes;

import java.util.ArrayList;
import java.util.List;

public class DrugPrescription implements AbstractPrototype{
    public List<String> solutions;
    public List<Integer> quantity;

    public List<String> getSolutions() {
        return solutions;
    }

    public void setSolutions(List<String> solutions) {
        this.solutions = solutions;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public DrugPrescription(List<String> solutions, List<Integer> quantity) {
        this.solutions = solutions;
        this.quantity = quantity;
    }

    private DrugPrescription(){//we do not want to be possible to create solutions and quantity with 0 from outside of this class
        //to create objects copy() should be used
    }

    @Override
    public AbstractPrototype copy() {
        DrugPrescription drugPrescription=new DrugPrescription();
       // drugPrescription.quantity=this.quantity; shallow copy
        //deep copy is necessary
        drugPrescription.quantity=new ArrayList<>();
        drugPrescription.quantity.addAll(this.quantity);

        drugPrescription.solutions=new ArrayList<>();
        drugPrescription.solutions.addAll(this.solutions);

        return drugPrescription;
    }

    @Override
    public String toString() {
        return "DrugPrescription{" +
                "solutions=" + solutions +
                ", quantity=" + quantity +
                '}';
    }
}

package factory.simple;

public class Medic extends MedicalPersonnel{


    public Medic(String name, Float salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Medic{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

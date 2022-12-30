package factory.simple;

public abstract class MedicalPersonnel {

    public String name;
    public Float salary;

    public MedicalPersonnel(String name, Float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PersonalMedical{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

package factory.simple;

public class Assistant extends MedicalPersonnel{

    public Assistant(String name, Float salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

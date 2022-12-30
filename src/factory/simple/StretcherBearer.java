package factory.simple;

public class StretcherBearer extends MedicalPersonnel{

    public StretcherBearer(String name, Float salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "StretcherBearer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

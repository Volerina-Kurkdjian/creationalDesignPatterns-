package factory.simple;

public class SimpleFactory {

    public MedicalPersonnel createMedicalPersonnel(PersonnelType personnelType, String name, Float salary){

        switch(personnelType){
            case MEDIC:{
                Medic medic=new Medic(name, salary);
                return medic;
            }
            case ASSISTENT:{
                Assistant assistant=new Assistant(name, salary);
                return assistant;
            }
            case STRETCHERBEARER:{
                StretcherBearer stretcherBearer=new StretcherBearer(name, salary);
                return stretcherBearer;
            }
            default:throw new IllegalArgumentException();
        }
    };
}

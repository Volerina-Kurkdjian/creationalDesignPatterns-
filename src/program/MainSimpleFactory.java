package program;

import factory.simple.*;

public class MainSimpleFactory {

    public static void main(String[] args) {

        SimpleFactory simpleFactory=new SimpleFactory();

        MedicalPersonnel medic= simpleFactory.createMedicalPersonnel(PersonnelType.MEDIC,"Anna",5000.0F);
        MedicalPersonnel assistant= simpleFactory.createMedicalPersonnel(PersonnelType.ASSISTENT,"Luise",10000.0F);
        System.out.println(medic);
        System.out.println(assistant);
    }
}

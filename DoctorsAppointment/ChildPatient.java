/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 10, 2022
 * Description:This ChildPatient class is a subclass that extends from the Patient superclass.
 * This class utilizes the variables from the superclass but includes its own; missingTeeth.
 */

package DoctorsAppointment;

public class ChildPatient extends Patient{

    private boolean missingTeeth;

    public ChildPatient(String name, String gender, int age, int weight, boolean allergies, boolean missingTeeth){
        super(name,gender,age,weight,allergies);
        this.missingTeeth = missingTeeth;
    }

    public boolean isMissingTeeth() {
        return missingTeeth;
    }

    public void setMissingTeeth(boolean missingTeeth) {
        this.missingTeeth = missingTeeth;
    }

    @Override
    public String toString(){
        return super.toString() + "Child[missingTeeth= " + missingTeeth + "]";
    }
}

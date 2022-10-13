/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 10, 2022
 * Description: This ElderlyPatient subclass extends from the Patient superclass and
 * utilizes the variables from the superclass and includes its own as well; canWalk and healthy.
 *
 */

package DoctorsAppointment;

public class ElderlyPatient extends Patient {

    private boolean canWalk;
    private boolean healthy;

    public ElderlyPatient(String name, String gender, int age, int weight, boolean allergies, boolean canWalk, boolean healthy){
        super(name,gender,age,weight,allergies);
        this.canWalk = canWalk;
        this.healthy = healthy;
    }

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    @Override
    public String toString(){
        return super.toString() + " Elderly[canWalk= " + canWalk + ", healthy= " + healthy + "]";
    }
}

/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 10, 2022
 * Description: This class will serve as a tester and we will create an array consisting of subclasses that
 * extend from the superclass. After doing so, a function called appointment reminder is created where a message is
 * generated to read like an appointment reminder. The, using a for loop, all indexes will be accessed and a unique
 * appointment reminder will be created for each.
 */

package DoctorsAppointment;
import java.util.Date;


public class DoctorsClients {
    public static void main(String[]args){

        Patient [] patients = new Patient[5];

        patients[0] = new ChildPatient("Ty","male", 11,50,true,true);
        patients[1] = new ElderlyPatient("Lan", "female", 77,110,false,true,true );
        patients[2] = new ChildPatient("Daniela", "female",12,70,true,true);
        patients[3] = new ChildPatient("Rocky", "male", 10, 65,false,true);
        patients[4] = new ElderlyPatient("Rose", "female",90,120,true,false,false);

        Date date = new Date();
        long time = date.getTime();
        time += 24*60*60*1000;

        for(Patient p: patients){
            appointmentReminder(p,time);
            time += 40*60*1000;
        }


    }

    public static void appointmentReminder(Patient patient, long time){
        Date date = new Date(time);
        System.out.println("Dear " + patient.getName() + ",");
        System.out.println("this is a friendly reminder that your appointment is on " + date);
        System.out.println("We can't wait to see you" + "\n");

    }
}

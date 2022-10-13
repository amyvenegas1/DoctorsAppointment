/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 10, 2022
 * Description: This Patient class will serve as a superclass for the subclasses that will be
 * created. Within this class the variables name,gender,age,weight and allergies are created and the
 * constructors, and setters and getters for these variables all reside in this class.
 */

package DoctorsAppointment;

public class Patient {
    private String name;
    private String gender;
    private int age;
    private int weight;
    private boolean allergies;

    public Patient(String name, String gender, int age, int weight, boolean allergies){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.allergies = allergies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }




    @Override
    public String toString(){
        return "Patient[name= " + name + ",gender= " + gender + ",age= " + age + ",weight= " + weight + ",allergies= " + allergies + ",bloodType= " ;
    }
}

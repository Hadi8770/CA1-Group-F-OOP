/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sleeptracker;

/**
 *
 * @author hadis
 */
public class AgeGroup {
    private String name;
    private int age;

    public AgeGroup(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getAgeGroup(){
        if(age >= 6 && age<= 12){
            return "child";
        }
        else if(age >= 13 && age<= 17){
            return "Teenager";
        }
        else if(age >= 18 && age<= 25){
            return "Young adult";
        }
        else if(age >= 26 && age<= 64){
            return "Adult";
        }
        else if(age >= 65){
            return "Older Adult";
        }
        else{
            return "Please enter a valid age";
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sleeptracker;

/**
 *
 * @author hadis
 */
public class SleepRecommendation {
    private int age;
    
    public SleepRecommendation(int age){
        this.age = age;
    }
    
    public String getSleepHours(){
        if(age >= 6 && age<= 12){
            return "9-12";
        }
        else if(age >= 13 && age<= 17){
            return "8-10";
        }
        else if(age >= 18 && age<= 25){
            return"7-9";
        }
        else if(age >= 26 && age<= 64){
            return "7-9";
        }
        else if(age >= 65){
            return "7-8";
        }
        else{
            return "Please enter your age";
        }
    }
    public String displayDetails(){
        return "Recommended Sleep: " + getSleepHours() + " hours per night.";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activitytracker;

/**
 *
 * @author catha
 */
public class ActivityRecord {
    private String steps;
    private String hours;
    private String exercise;
    
    public ActivityRecord(String steps, String hours, String exercise) {
        this.steps = steps;
        this.hours = hours;
        this.exercise = exercise;
    }
    
    public String getSummary() {
        return "Steps: " + steps + " | Hours " + hours + " | Exercise: " + exercise + "\n";
    }
}

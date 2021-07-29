/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainsmart;

import controller.ReadinessCtrl;
import controller.SerializedCtrl;
import controller.SetCtrl;
import controller.SetListCtrl;
import java.util.ArrayList;
import model.Exercise;
import model.ExerciseList;
import model.Readiness;
import model.Set;
import model.TestHarness;

/**
 *
 * @author Sarah
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    SerializedCtrl serCtrl;
            
    public static void main(String[] args)
    {
        //SerializedCtrl serCtrl = new SerializedCtrl();
        
        //add elements needed for a new exercise
        ArrayList<Set> sampleSet = new ArrayList();
        sampleSet.add(new Set(225.0, 5));
        sampleSet.add(new Set(235.0, 8));
        ArrayList<String> sampleMuscles = new ArrayList();
        sampleMuscles.add("Hamstrings");
        sampleMuscles.add("Glutes");
        
        //create linked list and test methods
//        ExerciseList exerciseList = new ExerciseList();
//        exerciseList.addExercise(new Exercise("Deadlift", sampleSet, sampleMuscles, "Legs", exerciseList.nextExOrderNum()));
//        System.out.println("\nAfter add:");
//        exerciseList.printList();
//        Exercise lunge = exerciseList.getExercise("Reverse Lunges");
//        exerciseList.removeExercise(lunge);
//        System.out.println("\nAfter remove:");
//        exerciseList.printList();
        
        ReadinessCtrl rdCtrl = new ReadinessCtrl();
                
    }

}

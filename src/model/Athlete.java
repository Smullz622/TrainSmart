/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.User;
import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class Athlete extends User
{
    private String trainingPhase;
    private String experienceLvl;
    private String goals;
    private int athleteCode;

    public Athlete(String trainingPhase, String experienceLvl, String goals, int athleteCode, String username, String password, String name, String birthDate, String email)
    {
        super(username, password, name, birthDate, email);
        this.trainingPhase = trainingPhase;
        this.experienceLvl = experienceLvl;
        this.goals = goals;
        this.athleteCode = athleteCode;
    }

 
    
      public Athlete()
    {
        super();
        this.trainingPhase = "None";
        this.experienceLvl = "Beginner";
        this.goals = "General Fitness";
        this.athleteCode = 0;
    }

    public String getTrainingPhase()
    {
        return trainingPhase;
    }

    public void setTrainingPhase(String trainingPhase)
    {
        this.trainingPhase = trainingPhase;
    }

    public String getExperienceLvl()
    {
        return experienceLvl;
    }

    public void setExperienceLvl(String experienceLvl)
    {
        this.experienceLvl = experienceLvl;
    }

    public String getGoals()
    {
        return goals;
    }

    public void setGoals(String goals)
    {
        this.goals = goals;
    }
    
    public int getAthleteCode()
    {
        return athleteCode;
    }

    public void setAthleteCode(int athleteCode)
    {
        this.athleteCode = athleteCode;
    }

    public boolean exists(ArrayList<Athlete> registeredAthletes, int code)
    {
        boolean check = false;
        for (int i = 0; i < registeredAthletes.size(); ++i)
        {
            if (registeredAthletes.get(i).getAthleteCode() == code)
            {
                check = true;
                System.out.println("Error. An athlete is already registered with this code");
            }
        }
        return check;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\nAthlete{" + "trainingPhase: " + trainingPhase + ", experience level: " + experienceLvl + ", goals: " + goals +", code: " + athleteCode + '}';
    }

    
    
}

package model;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sarah
 */
public class Readiness implements Serializable
{

    private int hoursSlept;
    private int sleepScore;
    private int lastTrained;
    private int lastTrainScore;
    private boolean warmup;
    private int warmupScore;
    private boolean recovery;
    private int recoveryScore;
    private boolean hydration;
    private int hydrationScore;
    private int totalScore;
    private String date;

    //full constructor
    public Readiness(int hoursSlept, int sleepScore, int lastTrained, int lastTrainScore, boolean warmup, int warmupScore, boolean recovery, int recoveryScore, boolean hydration, int hydrationScore, String date)
    {
        this.hoursSlept = hoursSlept;
        this.sleepScore = sleepScore;
        this.lastTrained = lastTrained;
        this.lastTrainScore = lastTrainScore;
        this.warmup = warmup;
        this.warmupScore = warmupScore;
        this.recovery = recovery;
        this.recoveryScore = recoveryScore;
        this.hydration = hydration;
        this.hydrationScore = hydrationScore;
        this.date = date;
        
        this.totalScore = calcScore(hoursSlept, lastTrained, warmup, recovery, hydration);
    }

    //response only constructor
    public Readiness(int hoursSlept, int lastTrained, boolean warmup, boolean recovery, boolean hydration, String date)
    {
        this.hoursSlept = hoursSlept;
        this.sleepScore = 0;
        this.lastTrained = lastTrained;
        this.lastTrainScore = 0;
        this.warmup = warmup;
        this.warmupScore = 0;
        this.recovery = recovery;
        this.recoveryScore = 0;
        this.hydration = hydration;
        this.hydrationScore = 0;
        this.date = date;
        
        this.totalScore = calcScore(hoursSlept, lastTrained, warmup, recovery, hydration);
    }

    //default constructor
    public Readiness()
    {
        this.hoursSlept = 0;
        this.sleepScore = 0;
        this.lastTrained = 0;
        this.lastTrainScore = 0;
        this.warmup = false;
        this.warmupScore = 0;
        this.recovery = false;
        this.recoveryScore = 0;
        this.hydration = false;
        this.hydrationScore = 0;
        this.date = "YYYY/MM/DD";
        
        this.totalScore = calcScore(hoursSlept, lastTrained, warmup, recovery, hydration);
    }

    //calculate score for hours slept
    public static int sleepScore(int hours)
    {
        int score;
        if (hours <= 2)
        {
            score = 0;
        } else if (hours <= 4)
        {
            score = 5;
        } else if (hours < 6)
        {
            score = 10;
        } else if (hours < 7){
            score = 13;
        }
        else if (hours < 8)
        {
            score = 15;
        } else
        {
            score = 20;
        }
        //System.out.println("Score = " + score);
        return score;
    }

    //calculate score based on how many days its been since they last trained the body part
    public static int lastTrainScore(int days)
    {
        int score;
        if (days <= 1){
            score = 5;
        }
        else if(days == 2)
        {
            score = 10;
        }
        else if(days == 3)
        {
            score = 15;
        }
        else 
        {
            score = 20;
        }
        //System.out.println("days since score = " + score);
        return score;
    }

    //calculate score for true/false questions
    public static int boolScores(boolean check)
    {
        int score;
        if (check == true){
            score = 20;
        }
        else {
            score = 0;
        }
        //System.out.println("bool check scores = " + score);
        return score;
    }

    //calculate the total score
    public static int calcScore(int hoursSlept, int lastTrained, boolean warmup, boolean recovery, boolean hydration){
        int score;
        
        int sleep = sleepScore(hoursSlept);
        int daysSinceTrained = lastTrainScore(lastTrained);
        int ifWarmup = boolScores(warmup);
        int ifRecovery = boolScores(recovery);
        int ifHydrated = boolScores(hydration);
        
        score = sleep + daysSinceTrained + ifWarmup + ifRecovery + ifHydrated;
        
        return score;
    }

   
    
    public int getHoursSlept()
    {
        return hoursSlept;
    }

    public void setHoursSlept(int hoursSlept)
    {
        this.hoursSlept = hoursSlept;
    }

    public int getSleepScore()
    {
        return sleepScore;
    }

    public void setSleepScore(int sleepScore)
    {
        this.sleepScore = sleepScore;
    }

    public int getLastTrained()
    {
        return lastTrained;
    }

    public void setLastTrained(int lastTrained)
    {
        this.lastTrained = lastTrained;
    }

    public int getLastTrainScore()
    {
        return lastTrainScore;
    }

    public void setLastTrainScore(int lastTrainScore)
    {
        this.lastTrainScore = lastTrainScore;
    }

    public boolean isWarmup()
    {
        return warmup;
    }

    public void setWarmup(boolean warmup)
    {
        this.warmup = warmup;
    }

    public int getWarmupScore()
    {
        return warmupScore;
    }

    public void setWarmupScore(int warmupScore)
    {
        this.warmupScore = warmupScore;
    }

    public boolean isRecovery()
    {
        return recovery;
    }

    public void setRecovery(boolean recovery)
    {
        this.recovery = recovery;
    }

    public int getRecoveryScore()
    {
        return recoveryScore;
    }

    public void setRecoveryScore(int recoveryScore)
    {
        this.recoveryScore = recoveryScore;
    }

    public boolean isHydration()
    {
        return hydration;
    }

    public void setHydration(boolean hydration)
    {
        this.hydration = hydration;
    }

    public int getHydrationScore()
    {
        return hydrationScore;
    }

    public void setHydrationScore(int hydrationScore)
    {
        this.hydrationScore = hydrationScore;
    }

    @Override
    public String toString()
    {
        return "Readiness{" + "hoursSlept=" + hoursSlept + ", sleepScore=" + sleepScore + ", lastTrained=" + lastTrained + ", lastTrainScore=" + lastTrainScore + ", warmup=" + warmup + ", warmupScore=" + warmupScore + ", recovery=" + recovery + ", recoveryScore=" + recoveryScore + ", hydration=" + hydration + ", hydrationScore=" + hydrationScore + '}';
    }

     public int getTotalScore(){
                 
        return totalScore;
    }

    public void setTotalScore(int hoursSlept, int lastTrained, boolean warmup, boolean recovery, boolean hydration){
  
        int sleep = sleepScore(hoursSlept);
        int daysSinceTrained = lastTrainScore(lastTrained);
        int ifWarmup = boolScores(warmup);
        int ifRecovery = boolScores(recovery);
        int ifHydrated = boolScores(hydration);
        
        this.totalScore = sleep + daysSinceTrained + ifWarmup + ifRecovery + ifHydrated;    
    }
    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }
    
    
}

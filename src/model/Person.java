package model;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Person
{
    private String name;
    private String birthDate;
    private String gender;
    private String email;

    public Person(String name, String birthDate, String gender, String email)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        
    }
    
    public Person()
    {
        this.name = "None";
        this.birthDate = "Unknown";
        this.gender = "Unknown";
        this.email = "Unknown";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //method to check if a person exists that is using the given email (ie. if they already have an account)
    public boolean exists(ArrayList<Person> registeredPersons)
    {
        boolean check = false;
        for (int i = 0; i < registeredPersons.size(); ++i)
        {
            if (registeredPersons.get(i).getEmail().compareTo(this.email) == 0)
            {
                check = true;
                System.out.println("An account using this email already exists.");
            }
        }
        return check;
    }
    
     @Override
    public String toString()
    {
        return "Person{" + "name: " + name + ", birth date: " + birthDate + ", gender: " + gender + ", email: "+ email + '}';
    }
    
}

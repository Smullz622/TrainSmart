/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sarah
 */
public class SetList
{
    private ArrayList list = new ArrayList();
    private String listFileName = "listOfSets.ser";
    
    public SetList(){
        this.readSetListFile();
        if(list.isEmpty() || list == null)
        {
            this.createTestSetList();
            this.writeSetListFile();
            this.readSetListFile();
        }
        this.printSetList();
    }

    public ArrayList<Set> getList()
    {
        return list;
    }

    public void setList(ArrayList<Set> list)
    {
        this.list = list;
    }

    private void readSetListFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(listFileName);
            in = new ObjectInputStream(fis);
            list = (ArrayList)in.readObject();
            in.close();
            if(!list.isEmpty())
            {
                System.out.println("There are sets in the set list");
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File must be created");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
    }

    private void createTestSetList()
    {
        list.add(new Set(135.0, 5));
        list.add(new Set(185.0, 8));
        list.add(new Set(225.0, 6));
        
        System.out.println("Test SetList Created");
        System.out.println("The SetList is: "+ list);
    }

    public void writeSetListFile()
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(list);
            out.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private void printSetList()
    {
        System.out.println("The SetList has these weights: ");
        for (int i = 0; i < list.size(); i++)
        {
            Set currentSet = (Set) list.get(i);
            System.out.println(currentSet.getWeight());
        }
    }
    
}

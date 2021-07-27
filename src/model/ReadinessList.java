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
public class ReadinessList
{
    private ArrayList rdList = new ArrayList();
    private String rdListFileName = "rdList.ser";
    
    public ReadinessList(){
        this.readRdListFile();
        if(rdList.isEmpty() || rdList == null)
        {
            this.createTestRdList();
            this.writeRdListFile();
            this.readRdListFile();
        }
        this.printRdList();
    }

    public ArrayList<Readiness> getList()
    {
        return rdList;
    }

    public void setList(ArrayList<Readiness> list)
    {
        this.rdList = list;
    }

    private void readRdListFile()
    {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(rdListFileName);
            in = new ObjectInputStream(fis);
            rdList = (ArrayList)in.readObject();
            in.close();
            if(!rdList.isEmpty())
            {
                System.out.println("There are readiness scores in the readiness list");
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

    private void createTestRdList()
    {
        rdList.add(new Readiness(8, 5, true, true, true, "07-18-21"));
        rdList.add(new Readiness(6, 3, false, true, false, "07-16-21"));
        rdList.add(new Readiness(9, 2, true, false, false, "07-12-21"));
        
        System.out.println("Test ReadinessList Created");
        System.out.println("The ReadinessList is: "+ rdList);
    }

    private void writeRdListFile()
    {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(rdListFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(rdList);
            out.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private void printRdList()
    {
        System.out.println("The ReadinessList has these scores: ");
        for (int i = 0; i < rdList.size(); i++)
        {
            Readiness currentRd = (Readiness) rdList.get(i);
            System.out.println(currentRd.getTotalScore());
        }
    }
}

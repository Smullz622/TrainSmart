/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.TreeMap;

/**
 *
 * @author Sarah
 */
public class ReadinessTreeMap
{

    TreeMap<String, Readiness> rdMap;

    public ReadinessTreeMap()
    {        
        createMap();
    }

    public Readiness getRd(String key)
    {
        Readiness rdToReturn;
        if (rdMap.containsKey(key))
        {
            rdToReturn = rdMap.get(key);
        } 
        else
        {
            System.out.println("Key Not Found");
            rdToReturn = null;
        }
        return rdToReturn;
    }
    
    public TreeMap getMap()
    {
        return rdMap;
    }

    private void createMap()
    {
        rdMap = new TreeMap();
        rdMap.put("2021/07/28", new Readiness(8, 7, true, true, true, "2021/07/28"));
        rdMap.put("2021/07/26", new Readiness(6, 3, true, false, false, "2021/07/26"));
        rdMap.put("2021/07/29", new Readiness(7, 2, true, false, true, "2021/07/29"));
    }

}

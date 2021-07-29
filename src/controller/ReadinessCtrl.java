/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import model.Readiness;
import model.ReadinessTreeMap;
import view.ReadinessDetailUI;

/**
 *
 * @author Sarah
 */
public class ReadinessCtrl
{
    ReadinessTreeMap rdMap = new ReadinessTreeMap();
    TreeMap<String, Readiness> map;
    ReadinessDetailUI rdDetailUI;

    public ReadinessCtrl()
    {
        map = rdMap.getMap();
        rdDetailUI = new ReadinessDetailUI(map);
        rdDetailUI.setVisible(true);
    }

    public TreeMap<String, Readiness> getMap()
    {
        return map;
    }

    public void setMap(TreeMap<String, Readiness> map)
    {
        this.map = map;
    }

   
    
    
}

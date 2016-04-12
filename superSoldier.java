/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author dennis
 */
public class superSoldier extends Enemy {
    public superSoldier(int hitpoints,int lives){
        super(hitpoints,lives);
    }

    @Override
    public int takeDmage(int damage) {
        return super.takeDmage(damage/2); //To change body of generated methods, choose Tools | Templates.
    
    }
   
       }
   
    
   

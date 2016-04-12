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
public class Game {

    
    public static void main(String[] args) {
        Enemy KillerX=new Enemy(2000,3);//instatiate object with relevant values
        Soldier Army=new Soldier(3000,3);
        superSoldier Navyseals=new superSoldier(5000,3);
        Player spi=new Player("Bond");
        //call the take dmage 
        KillerX.takeDmage(1500);
        Army.takeDmage(1000);
        Navyseals.takeDmage(2500);
        //print out remainning hitpoints
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}

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
public class Enemy {
    private int hitpoints;
    private int live;
    public Enemy(int points,int live){
        this.hitpoints=points;
        this.live=live; 
    }
    public void setHitpoints(int points){
        this.hitpoints=points;
    }
    public  void setLives(int lives){
        this.live=lives;
    }
    public static int getLives(int lives){
        return lives;
    }
    public static int getHitpoints(int points){
        return points;
    }
    public int takeDmage(int damage){
        int remaining=hitpoints-damage;
        hitpoints=remaining;
        return remaining; 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.InputMismatchException;

/**
 *
 * @author dennis
 */
public class Player {
   private String handlename;
    private int lives;
    private int  score;
   private int level;
    public Player(String handlename){
        //this.handlename=handlename;
        setHandlename(handlename);
        this.lives=3;
        this.score=0;
        this.level=1;
    }
        public void setLives(int lives){
            this.lives=lives;
        }
        public int getLives(){
            return lives;
        }
        public void setScore( int score){
            this.score=score;
        }
        public int getScore(){
            return score;
        }
        public void setLevel( int level){
            this.level=level;
        }
        public int getLevel(){
            return level;
        }
        public void setHandlename(String handlename){
            try{
                if(handlename.length()>=4){
                this.handlename=handlename;
            }else{
                    System.out.println("Handlename is to short");
                }
            }
            catch(InputMismatchException e){
                System.out.println();
                
            }
        }
        public String getHandlename(){
            return handlename;
        }
    }

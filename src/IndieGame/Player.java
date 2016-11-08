/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndieGame;

/**
 *   pass();
        shoot();
 * @author UserPL022Pc03
 */
public class Player extends SensibleDummy{
    int fatigue, defence, atack;
    char faceTo;

    public Player(int fatigue, int defence, int atack, char faceTo, String nome, String cor) {
        super(nome, cor);
        this.fatigue = fatigue;
        this.defence = defence;
        this.atack = atack;
        this.faceTo = faceTo;
        
        pass();
        shoot();
        
    }  
    
       
    private void pass(){        
    }
    
    private void shoot(){        
    }
    
}

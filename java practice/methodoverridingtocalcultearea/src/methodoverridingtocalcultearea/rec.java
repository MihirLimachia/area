/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverridingtocalcultearea;

/**
 *
 * @author ACER
 */
public class rec extends defa{
    rec(double e1,double e2){
    super(e1,e2);     
    }
    @Override
    double vol(){
    return(w*l);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.gl.exo3;

/**
 *
 * @author barry
 */
public class ClassMetier {
    IRelais instance;
    
    public ClassMetier(IRelais instance){
        this.instance = instance;
    }
    public void afficher(){
        this.instance.afficher();
    }
}

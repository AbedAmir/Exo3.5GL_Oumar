/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.gl.exo3;

import java.time.LocalDateTime;

/**
 *
 * @author barry
 */
public class ClassTechnique implements IRelais{

    @Override
    public void afficher() {
        System.out.println(LocalDateTime.now());
    }
    
}

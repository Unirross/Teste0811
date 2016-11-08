/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuporteAulas;

/**
 *
 * @author UserPL022Pc03
 */
public class ProvaOral extends MomentoAvaliacao{
    
    int fluencia, DominioMateria;

    public ProvaOral(int fluencia, int DominioMateria) {
        this.fluencia = fluencia;
        this.DominioMateria = DominioMateria;
    }

    public int getFluencia() {
        return fluencia;
    }

    public void setFluencia(int fluencia) {
        this.fluencia = fluencia;
    }
    
    
    
}

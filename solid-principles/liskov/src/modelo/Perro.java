/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Andres Angarita <andres.angarita96@gmail.com>
 */
public class Perro extends Animal{
    
    public Perro() {
    }
    @Override
    public void emitirSonido() {
        System.out.println("guau guau");
    }
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }
}

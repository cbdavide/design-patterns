package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andres Angarita <andres.angarita96@gmail.com>
 */
public class Persona {
    
    private String nombre;
    private String barrio;
    private ArrayList<Animal> corral;
    private Animal mascota;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        corral = new ArrayList<>();
        mascota = new Perro();
        corral.add(mascota);
        mascota = new Vaca();
        corral.add(mascota);
  }

    public ArrayList<Animal> getMascotas(){
    return corral;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}

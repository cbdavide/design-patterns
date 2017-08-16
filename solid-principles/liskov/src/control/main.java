package control;

import java.util.ArrayList;
import java.util.Iterator;
import modelo.Animal;
import modelo.Persona;

/**
 *
 * 
 */
public class main {

    public static void main(String[] args) {
        Iterator ite;
        Persona raul = new Persona("raul");
	
	System.out.println("yo soy " + raul.getNombre() + " y tengo un perro y una vaca que hacen: ");
	
        ArrayList<Animal> corralito = raul.getMascotas();
        ite = corralito.iterator();
        while (ite.hasNext()) {
            Animal mascota = (Animal) ite.next();
            mascota.getNombre();
            mascota.emitirSonido();
        }

    }

}

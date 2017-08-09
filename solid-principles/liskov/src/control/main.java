package control;

import java.util.ArrayList;
import java.util.Iterator;
import modelo.Animal;
import modelo.Persona;

/**
 *
 * @author Andres Angarita <andres.angarita96@gmail.com>
 */
public class main {

    public static void main(String[] args) {
        Iterator ite;
        Persona raul = new Persona("raul");
        ArrayList<Animal> corralito = raul.getMascotas();
        ite = corralito.iterator();
        while (ite.hasNext()) {
            Animal mascota = (Animal) ite.next();
            mascota.getNombre();
            mascota.emitirSonido();
        }

    }

}

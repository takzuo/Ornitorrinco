package ornitorrinco;

import intefaces.Anfibio;
import intefaces.Oviparo;
import intefaces.Venenoso;
import mamifero.Mamifero;

public class Ornitorrinco extends Mamifero implements Anfibio, Oviparo, Venenoso {
    public Ornitorrinco() {
    }
    
    public void ponerHuevos(int cantidad) {
        System.out.println("He puesto: " + cantidad + " huevitos");
    }
    
    public void respirarPorBranquias() {
        System.out.println("Respirando por branquias");
    }
    
    public void nadarEnAgua() {
        System.out.println("Nadando en el agua");
    }
    
    public void envenenar() {
        System.out.println("Venenoso");
    }
}


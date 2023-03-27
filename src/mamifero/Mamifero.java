package mamifero;

public abstract class Mamifero {
protected int temperatura;
    
    public void regularTemperatura(int nuevaTemperatura) {
        this.temperatura = nuevaTemperatura;
        System.out.println("La temperatura del mamífero se ha regulado a " + this.temperatura + " grados.");
    }
}

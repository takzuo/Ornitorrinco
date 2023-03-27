package aplicacion;

import ornitorrinco.Ornitorrinco;

public class aplicacion {
	
	    public static void main(String[] args) {
	        Ornitorrinco ornitorrinco1 = new Ornitorrinco();
	        Ornitorrinco ornitorrinco2 = new Ornitorrinco();
	        
	        ornitorrinco1.respirarPorBranquias();
	        ornitorrinco1.nadarEnAgua();
	        ornitorrinco1.ponerHuevos(2);
	        ornitorrinco1.envenenar();
	        ornitorrinco1.regularTemperatura(37);
	        
	        System.out.println();
	        
	        ornitorrinco2.respirarPorBranquias();
	        ornitorrinco2.nadarEnAgua();
	        ornitorrinco2.ponerHuevos(3);
	        ornitorrinco2.envenenar();
	        ornitorrinco2.regularTemperatura(35);
	    }
	

}

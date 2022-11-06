package pattern;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;
import pattern.domain.Fabrica.Fabricas;
import pattern.factories.AbstractFactory;
import pattern.factories.FabricaFactory;

public class AutomovelApp {
	
	public static void main(String[] args) {
		
		AbstractFactory factory = FabricaFactory.getFactory(Fabricas.GeneralMotorsSP);
		
		Automovel automovel = factory.solicitarAutomovel(Modelo.Astra);
		
		System.out.println(automovel); 
		
	}

}

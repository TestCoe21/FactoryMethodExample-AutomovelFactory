package pattern.factories;

import pattern.domain.Fabrica.Fabricas;

public abstract class FabricaFactory implements AbstractFactory{
	
	public static AbstractFactory getFactory(Fabricas fabrica) {
		
		AbstractFactory factory;
		if (fabrica.equals(Fabricas.GeneralMotorsRS)){
			factory = new FabricaGMRSFactory();
		} else if (fabrica.equals(Fabricas.GeneralMotorsSP)) {
			factory = new FabricaGMSPFactory();
		} else if (fabrica.equals(Fabricas.MitsubishiMotorsGO)) {
			factory = new FabricaMitsubishiMotorsGOFactory();
		} else {
			factory = new FabricaVolkswagenAudiPRFactory();
		}
	    return factory;
	}
}
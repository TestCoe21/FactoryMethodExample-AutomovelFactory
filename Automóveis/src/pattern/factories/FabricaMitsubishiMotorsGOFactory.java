package pattern.factories;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;
import pattern.domain.Fabrica;
import pattern.domain.FabricaMitsubishiMotorsGO;

public class FabricaMitsubishiMotorsGOFactory extends FabricaFactory {

	private Fabrica fabrica;
	
	public FabricaMitsubishiMotorsGOFactory() {
		fabrica = new FabricaMitsubishiMotorsGO();
	}
	
	@Override
	public Automovel solicitarAutomovel(Modelo modelo) {
		return fabrica.solicitarAutomovel(modelo);
	}
}
package pattern.factories;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;
import pattern.domain.Fabrica;
import pattern.domain.FabricaGMRS;

public class FabricaGMRSFactory extends FabricaFactory {

	private Fabrica fabrica;
	
	public FabricaGMRSFactory() {
		fabrica = new FabricaGMRS();
	}
	
	@Override
	public Automovel solicitarAutomovel(Modelo modelo) {
		return fabrica.solicitarAutomovel(modelo);
	}
}
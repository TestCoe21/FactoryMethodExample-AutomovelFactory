package pattern.factories;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;
import pattern.domain.Fabrica;
import pattern.domain.FabricaGMSP;

public class FabricaGMSPFactory extends FabricaFactory {

	private Fabrica fabrica;
	
	public FabricaGMSPFactory() {
		fabrica = new FabricaGMSP();
	}
	
	@Override
	public Automovel solicitarAutomovel(Modelo modelo) {
		return fabrica.solicitarAutomovel(modelo);
	}
}
package pattern.factories;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;
import pattern.domain.Fabrica;
import pattern.domain.FabricaVolkswagenAudiPR;

public class FabricaVolkswagenAudiPRFactory extends FabricaFactory {

	private Fabrica fabrica;
	
	public FabricaVolkswagenAudiPRFactory() {
		fabrica = new FabricaVolkswagenAudiPR();
	}
	
	@Override
	public Automovel solicitarAutomovel(Modelo modelo) {
		return fabrica.solicitarAutomovel(modelo);
	}
}
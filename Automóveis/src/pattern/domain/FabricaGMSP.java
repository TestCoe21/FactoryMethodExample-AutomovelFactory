package pattern.domain;

public class FabricaGMSP extends Fabrica {

	Automovel produzirAutomovel(Automovel.Modelo modelo) {
		if (modelo.equals(Automovel.Modelo.Astra)) {
			return new AutomovelAstraFabricaGMSP();
		} else {
			return null;
		}
	}
}

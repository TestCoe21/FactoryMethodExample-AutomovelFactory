package pattern.domain;

public class FabricaGMRS extends Fabrica {

	Automovel produzirAutomovel(Automovel.Modelo modelo) {
		if (modelo.equals(Automovel.Modelo.Astra)) {
			return new AutomovelAstraFabricaGMRS();
		} else {
			return null;
		}
	}
}

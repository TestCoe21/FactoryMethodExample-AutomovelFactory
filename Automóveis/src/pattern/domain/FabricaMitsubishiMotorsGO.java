package pattern.domain;

public class FabricaMitsubishiMotorsGO extends Fabrica {

	Automovel produzirAutomovel(Automovel.Modelo modelo) {
		if (modelo.equals(Automovel.Modelo.Lancer)) {
			return new AutomovelLancer();
		} else {
			return null;
		}
	}
}

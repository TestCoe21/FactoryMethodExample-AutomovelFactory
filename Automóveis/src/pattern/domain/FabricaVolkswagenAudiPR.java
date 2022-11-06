package pattern.domain;

public class FabricaVolkswagenAudiPR extends Fabrica {

	Automovel produzirAutomovel(Automovel.Modelo modelo) {
		if (modelo.equals(Automovel.Modelo.Golf)) {
			return new AutomovelGolf();
		} else if (modelo.equals(Automovel.Modelo.Gol)) {
			return new AutomovelGol();
		} else {
			return null;
		}
	}
}

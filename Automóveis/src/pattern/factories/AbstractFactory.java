package pattern.factories;

import pattern.domain.Automovel;
import pattern.domain.Automovel.Modelo;

public interface AbstractFactory {
	
	public Automovel solicitarAutomovel(Modelo modelo);

}

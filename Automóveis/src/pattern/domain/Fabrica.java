package pattern.domain;

public abstract class Fabrica {
	
	public static enum Fabricas {
		GeneralMotorsRS,
		GeneralMotorsSP,
		MitsubishiMotorsGO,
		VolkswagenAudiPR
	}
 
	abstract Automovel produzirAutomovel(Automovel.Modelo modelo);
 
	public Automovel solicitarAutomovel(Automovel.Modelo modelo) {
		Automovel automovel = produzirAutomovel(modelo);
		System.out.println("**************************************");
		System.out.println("Produzindo seu " + automovel.getNome() + "");
		automovel.produzindo();
		automovel.montar();
		return automovel;
	}
}
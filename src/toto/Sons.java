package toto;


public class Sons {
	public static final String TAB_FICHIERS[] = {
			"accenteur.mouchet.wav",
			"alouette.lulu.wav",
			"bec.croise.des.sapins.wav",
			"bergeronnette.printanniere.Motacilla.flava.wav",
			"bernachecanada.wav",
			"bruant.roseaux.wav",
			"bruant.zizi.wav",
			"busard.cendre.Circus.pygargus.wav",
			//"buse.wav",
			"choucas.des.tours.Corvus.monedula.wav",
			"corbeau.wav",
			"corneillenoire.wav",
			"coucou.wav",
			"cygne.tubercule.Cygnus.olor.wav",
			"test.wav"
	};
	public final static int NB_FICHIERS = TAB_FICHIERS.length;
	public static String getFichiers(int i) {
		return TAB_FICHIERS[i];
	}
}

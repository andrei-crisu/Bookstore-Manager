package gestiune.resurse.casete;

import gestiune.resurse.generic.Activitate;
import gestiune.resurse.generic.GenericResource;

public class Caseta extends GenericResource implements Activitate {

	private String artist;
	private int anAparitie;
	private int durataMinute;

	public Caseta(String numeResursa, String numeArtist, int anAparitie, int durataMinute) {
		super(numeResursa);
		this.setArtist(numeArtist);
		this.setAnAparitie(anAparitie);
		this.setDurataMinute(durataMinute);
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getAnAparitie() {
		return anAparitie;
	}

	public void setAnAparitie(int anAparitie) {
		if (anAparitie >= 1950 && anAparitie < 2000)
			this.anAparitie = anAparitie;
		else
			this.anAparitie = -1;
	}

	public int getDurataMinute() {
		return durataMinute;
	}

	public void setDurataMinute(int durataMinute) {
		if (durataMinute > 0)
			this.durataMinute = durataMinute;
		else
			this.durataMinute = 0;
	}

	@Override
	public boolean isEqual(Activitate activitate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ArataInformatii(char ch) {
		switch (ch) {

		case 'c':
			System.out.print("Album: " + this.getNumeResursa() + " | Artist: " + this.getArtist() + " | Aparitie: ");
			if (this.anAparitie < 0)
				System.out.print("-");
			else
				System.out.print(this.anAparitie);

			System.out.println(" | Durata: " + this.durataMinute + " min ");
			break;
		case 'l':
			System.out.println("---" + this.getClass().getName() + "---");
			System.out.println("Nume album: " + this.getNumeResursa());
			System.out.println("Artist: " + this.getArtist());
			System.out.print("An aparitie: ");
			if (this.anAparitie < 0)
				System.out.println("-");
			else
				System.out.println(this.anAparitie);
			System.out.println("Durata: " + this.durataMinute);
			System.out.println("----------------");

			break;
		default:
			System.out.println("ERR -> UNKNOWN FORMAT IN: < " + this.getClass().getName() + " >  instance attribute name: "
					+ this.getNumeResursa());
			break;
		}
	}

	@Override
	public String classHelp(String string) {
		String helpString = new String("C:>	");
		if (string.toLowerCase().compareTo("nume") == 0) {
			helpString += "Atributul <nume>  reprezinta numele albumului de tip String ";
			return helpString;
		}

		if (string.toLowerCase().compareTo("artist") == 0) {
			helpString += "Atributul <artist>  reprezinta numele artistului de tip String ";
			return helpString;
		}

		if (string.toLowerCase().compareTo("an") == 0) {
			helpString += "Atributul <an>  reprezinta anul aparitiei si este de tip intreg ";
			return helpString;
		}

		helpString += (" ERR:Parametrul introdus nu reprezinta un atribut al acestei clase: <"
				+ this.getClass().getName() + "> si nici al superclasei: <" + this.getClass().getSuperclass().getName()
				+ "> ");

		return helpString;
	}

	@Override
	public String classDoc() {
		String helpString = new String("C:>	");
		helpString += ("Numele acestei clase este : <"
				+ this.getClass().getName() + "> ,al superclasei: <" + this.getClass().getSuperclass().getName()
				+ "> ");
		if (this instanceof Activitate)
			helpString += "de asemenea se implementeaza interfata Activitate!";

		return helpString;

	}

}

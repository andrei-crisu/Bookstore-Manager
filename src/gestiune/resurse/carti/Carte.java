package gestiune.resurse.carti;

import gestiune.resurse.generic.Activitate;
import gestiune.resurse.generic.GenericResource;

public class Carte extends GenericResource implements Activitate {

	private String autor;
	private String editura;
	private int anul_aparitiei;
	private int numar_pagini;

	public Carte(String titlu, String autor, String editura, int anul_aparitiei, int numar_pagini) {
		super(titlu);
		this.autor = autor;
		this.editura = editura;
		this.anul_aparitiei = anul_aparitiei;
		this.numar_pagini = numar_pagini;
	}

	public String getTitlu() {
		return this.getNumeResursa();
	}

	public void setTitlu(String titlu) {
		this.setNumeResursa(titlu);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditura() {
		return editura;
	}

	public void setEditura(String editura) {
		this.editura = editura;
	}

	public int getAnul_aparitiei() {
		return anul_aparitiei;
	}

	public void setAnul_aparitiei(int anul_aparitiei) {
		this.anul_aparitiei = anul_aparitiei;
	}

	public int getNumar_pagini() {
		return numar_pagini;
	}

	public void setNumar_pagini(int numar_pagini) {
		this.numar_pagini = numar_pagini;
	}

	@Override
	public boolean isEqual(Activitate carte) {
		if ((this.getNumeResursa().compareTo(((Carte) carte).getNumeResursa()) != 0)
				|| (this.autor.compareTo(((Carte) carte).autor) != 0)
				|| (this.editura.compareTo(((Carte) carte).editura) != 0)
				|| (this.anul_aparitiei != ((Carte) carte).anul_aparitiei)
				|| (this.numar_pagini != ((Carte) carte).numar_pagini))
			return false;
		return true;
	}

	private void afisareCompactaCarte() {
		System.out.println(this.getNumeResursa() + " | " + this.autor + "\tEditura: " + this.editura + "\tapartie: "
				+ this.anul_aparitiei + "\tnr.pag: " + this.numar_pagini);
	}

	private void afisareExtinsaCarte() {
		System.out.println("-- CARTE -- ");
		System.out.println("Titlu: " + this.getNumeResursa());
		System.out.println("Autor: " + this.autor);
		System.out.println("Editura: " + this.editura);
		System.out.println("An aparitie: " + this.anul_aparitiei);
		System.out.println("Numar pagini: " + this.numar_pagini);
		System.out.println("------------");

	}

	@Override
	public void ArataInformatii(char ch) {
		switch (ch) {
		case 'c':
			afisareCompactaCarte();
			break;
		case 'l':
			afisareExtinsaCarte();
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
			helpString += "Atributul <nume>  reprezinta titlul cartii si este de tip String ";
			return helpString;
		}
		if (string.toLowerCase().compareTo("autor") == 0) {
			helpString += "Atributul <autor>  reprezinta numele autorului care a scris cartea si este de tip String ";
			return helpString;
		}

		if (string.toLowerCase().compareTo("editura") == 0) {
			helpString += "Atributul <editura>  reprezinta numele editurii care a tiparit cartea si este de tip String ";
			return helpString;
		}

		if (string.toLowerCase().compareTo("an") == 0) {
			helpString += "Atributul <an>  reprezinta anul aparitiei  si este de tip intreg ";
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

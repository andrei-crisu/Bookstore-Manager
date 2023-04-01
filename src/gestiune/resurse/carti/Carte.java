package gestiune.resurse.carti;

public class Carte {

	private String titlu;
	private String autor;
	private String editura;
	private int anul_aparitiei;
	private int numar_pagini;

	public Carte(String titlu, String autor, String editura, int anul_aparitiei, int numar_pagini) {
		super();
		this.titlu = titlu;
		this.autor = autor;
		this.editura = editura;
		this.anul_aparitiei = anul_aparitiei;
		this.numar_pagini = numar_pagini;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
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

	public boolean isEqual(Carte carte) {
		if ((this.titlu.compareTo(carte.titlu) != 0) || (this.autor.compareTo(carte.autor) != 0)
				|| (this.editura.compareTo(carte.editura) != 0) || (this.anul_aparitiei != carte.anul_aparitiei)
				|| (this.numar_pagini != carte.numar_pagini))
			return false;
		return true;
	}

	public void afisareCompactaCarte() {
		System.out.println(this.titlu + " | " + this.autor + "\tEditura: " + this.editura + "\tapartie: "
				+ this.anul_aparitiei + "\tnr.pag: " + this.numar_pagini);
	}

	public void afisareExtinsaCarte() {
		System.out.println("-- CARTE -- ");
		System.out.println("Titlu: " + this.titlu);
		System.out.println("Autor: " + this.autor);
		System.out.println("Editura: " + this.editura);
		System.out.println("An aparitie: " + this.anul_aparitiei);
		System.out.println("Numar pagini: " + this.numar_pagini);
		System.out.println("------------");

	}

}

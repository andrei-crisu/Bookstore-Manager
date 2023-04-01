package gestiune.resurse.carti;
public class CarteTiparita extends Carte {
	
	private int numarCartiExistente;
	private int numarCartiDisponibile;
	
	public CarteTiparita(String titlu, String autor, String editura,int anul_aparitiei, 
			int numar_pagini,int numarCartiExistente) {
		super(titlu, autor,editura, anul_aparitiei, numar_pagini);
		this.numarCartiExistente=numarCartiExistente;
		this.numarCartiDisponibile=numarCartiExistente;
	}

	public int getNumarCartiExistente() {
		return numarCartiExistente;
	}

	public void adaugaExemplare(int numarExemplare) {
		this.numarCartiExistente+=numarExemplare;
	}

	public int getNumarCartiDisponibile() {
		return numarCartiDisponibile;
	}

	public boolean realizareImprumutare() {
		if(this.numarCartiDisponibile>0)
		{
			this.numarCartiDisponibile--;
			return true;
		}
		else
			return false;
	}
	
	public void returnareCarte()
	{
		this.numarCartiDisponibile++;
	}
	
	public void afiseazaCarte(char ch)
	{
		System.out.println("--- ("+this.numarCartiDisponibile+"/"+this.numarCartiExistente+") --- ");
		super.ArataInformatii(ch);
		System.out.println("-----------------");
	}
	

}

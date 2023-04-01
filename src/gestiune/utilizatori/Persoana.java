package gestiune.utilizatori;

import utile.tipuri.Sex;
public class Persoana {
	private String nume;
	private String prenume;
	private int varsta;
	private String cnp;
	private String telefon;
	private String adresa;
	private Sex sex;
	
	public Persoana(String nume, String prenume, int varsta, 
			String cnp, String telefon, String adresa, Sex sex) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.cnp = cnp;
		this.telefon = telefon;
		this.adresa = adresa;
		this.sex = sex;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	
	public void afiseazaDatePersoana() {
		
		System.out.println("-------------------");
		System.out.println("Nume: "+this.nume+" "+this.prenume+"("+this.sex+")");
		System.out.println("CNP: "+this.cnp+"\tVarsta: "+this.varsta);
		System.out.println("Telefon: "+this.telefon);
		System.out.println("Adresa: "+this.adresa);
		System.out.println("-------------------");


	}
	
	

}

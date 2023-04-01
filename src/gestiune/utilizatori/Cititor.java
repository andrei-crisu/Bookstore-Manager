package gestiune.utilizatori;
import java.util.ArrayList;
import java.util.List;

import gestiune.resurse.carti.CarteTiparita;
import utile.tipuri.Sex;

public class Cititor extends Persoana {
	private static int currentID=0;
	final public static int NR_MAX_CARTI_IMPRUMUTATE=3;
	private int ID_cititor;
	private int nrCartiImprumutate;
	List <CarteTiparita> cartiImprumutate;
	public Cititor(String nume, String prenume, int varsta, 
			String cnp, String telefon, String adresa, Sex sex) {
		super(nume, prenume, varsta, cnp, telefon, adresa, sex);
		ID_cititor=genereazaID();
		nrCartiImprumutate=0;
		cartiImprumutate=new ArrayList<CarteTiparita>();
	}
	
	private int genereazaID()
	{
		currentID++;
		return currentID;
	}

	public static int getCurrentID() {
		return currentID;
	}

	public int getID_cititor() {
		return ID_cititor;
	}

	
	public int getNrCartiImprumutate() {
		return nrCartiImprumutate;
	}

	
	public List<CarteTiparita> getCartiImprumutate() {
		return cartiImprumutate;
	}
	
	public boolean imprumutaCarte(CarteTiparita carte)
	{
		cartiImprumutate.add(carte);
		this.nrCartiImprumutate++;
		return true;
		
	}
	
	public boolean restituieCarte(CarteTiparita carte)
	{
		if(cartiImprumutate.isEmpty())
			return false;
		else
		{
			this.nrCartiImprumutate--;
			cartiImprumutate.remove( carte);
			return true;
		}
		
	}
	
	public boolean poateImprumuta()
	{
		if(this.nrCartiImprumutate<Cititor.NR_MAX_CARTI_IMPRUMUTATE)
			return true;
		else
			return false;
	}
	
	public boolean areCartiImprumutate()
	{
		if(this.nrCartiImprumutate!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void afiseazaCititor()
	{
		System.out.println(">>>>>>>>");
		System.out.println("Cititor ID: "+this.getID_cititor());
		super.afiseazaDatePersoana();
		System.out.println("Carti imprumutate: ("+this.nrCartiImprumutate+"/"+this.NR_MAX_CARTI_IMPRUMUTATE+")");
		for(int i=0;i<this.cartiImprumutate.size();i++)
		{
			this.cartiImprumutate.get(i).afisareCompactaCarte();
		}
	}

	

}

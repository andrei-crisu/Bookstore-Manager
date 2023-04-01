import gestiune.informatii.Inventar;
import gestiune.resurse.carti.CarteTiparita;
import gestiune.utilizatori.Cititor;
import utile.tipuri.Sex;

public class ActivitateBiblioteca {	

	public static void main(String[] args) {
		Inventar inventarBiblioteca=new Inventar();
		Cititor cititor1=new Cititor("Ionescu","Mihai",23,"5010438125321","0712150600",
				"Dolj,Craiova,Calea Bucuresti",Sex.BARBAT);
		Cititor cititor2=new Cititor("Popescu","Adela",23,"6010438125321","0712140612",
				"Dolj,Craiova,Bulevardul Decebal",Sex.FEMEIE);
		
		CarteTiparita carte1=new CarteTiparita("Poezii","Mihai Eminescu","Eminescu",1880,200,30);
		CarteTiparita carte2=new CarteTiparita("Basme","Petre Ispirescu","Art",1920,340,50);
		CarteTiparita carte3 =new CarteTiparita("20000 de leghe sub mari","Jules Verne","Art", 1977,500,20);
		
		inventarBiblioteca.adaugaCarte(carte1);
		inventarBiblioteca.adaugaCarte(carte2);
		inventarBiblioteca.adaugaCarte(carte3);
		
		System.out.println("\n >>> >>> >>> Inainte!");
		inventarBiblioteca.afiseazaInventar();
		cititor1.afiseazaCititor();
		imprumutareCarte(cititor1,inventarBiblioteca,carte1);
		imprumutareCarte(cititor1,inventarBiblioteca,carte3);
		imprumutareCarte(cititor1,inventarBiblioteca,carte3);
		imprumutareCarte(cititor1,inventarBiblioteca,carte2);
		System.out.println("------------------------------------------------------------------");
		System.out.println("\n >>> >>> >>> Dupa!");
		inventarBiblioteca.afiseazaInventar();
		cititor1.afiseazaCititor();
		restituireCarte(cititor1,inventarBiblioteca,carte1);
		restituireCarte(cititor1,inventarBiblioteca,carte3);
		restituireCarte(cititor1,inventarBiblioteca,carte3);
		System.out.println("\n >>> >>> >>> La final!");
		inventarBiblioteca.afiseazaInventar();
		cititor1.afiseazaCititor();

	}
	
	public static void imprumutareCarte(Cititor cititor, Inventar inventar,CarteTiparita carte)
	{
		if(cititor.poateImprumuta())
		{
			if(inventar.realizareImprumut(carte))
				cititor.imprumutaCarte(carte);
		}
		else
		{
			System.out.println("Cititorul: "+cititor.getNume()+" "+cititor.getPrenume()+" nu mai poate imprumuta carti!");
		}
	}
	
	
	public static void restituireCarte(Cititor cititor,Inventar inventar,CarteTiparita carte)
	{
		if(cititor.areCartiImprumutate())
		{
			if(inventar.realizareRestituire(carte))
				cititor.restituieCarte(carte);
		}
		else
		{
			System.out.println("Cititorul: "+cititor.getNume()+" "+cititor.getPrenume()+" nu are nimic de imprumutat!");
		}
	}
	

}

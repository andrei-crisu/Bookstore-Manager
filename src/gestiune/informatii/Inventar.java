package gestiune.informatii;
import java.util.ArrayList;
import java.util.List;

import gestiune.resurse.carti.CarteTiparita;

public class Inventar {
	private List<CarteTiparita> cartiBiblioteca;

	public Inventar() {
		cartiBiblioteca = new ArrayList<CarteTiparita>();

	}

	public void afiseazaInventar() {
		System.out.println("--- INVENTAR ---");
		for (int i = 0; i < cartiBiblioteca.size(); i++)
			cartiBiblioteca.get(i).afiseazaCarte();
		System.out.println("----------------");
	}

	public void adaugaCarte(CarteTiparita carte) {
		cartiBiblioteca.add(carte);
	}

	public boolean realizareImprumut(CarteTiparita carte) {
		CarteTiparita temp;
		for (int i = 0; i < cartiBiblioteca.size(); i++) {
			if (cartiBiblioteca.get(i).isEqual(carte)) {

				if (cartiBiblioteca.get(i).realizareImprumutare())
					return true;
				break;
			}
		}

		return false;
	}

	public boolean realizareRestituire(CarteTiparita carte) {
		int index=cartiBiblioteca.indexOf(carte);
		if(index>=0)
		{
			cartiBiblioteca.get(index).returnareCarte();
			return true;
		}
		return false;
	}

}

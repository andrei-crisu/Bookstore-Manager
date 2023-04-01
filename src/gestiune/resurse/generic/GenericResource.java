package gestiune.resurse.generic;

public  abstract class GenericResource extends Object{
	private String numeResursa;
	public GenericResource(String numeResursa)
	{
		this.numeResursa=numeResursa;
	}
	
	public String getNumeResursa()
	{
		return numeResursa;
	}
	
	public void setNumeResursa(String nume) {
		this.numeResursa=nume;
	}
	
	

}

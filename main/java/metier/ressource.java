package metier;

public class ressource {
	private int ressource_id;
	private String ressource_name;
	private String type;
	private int quantity;
	private String informationsFournisseur;
	public ressource() {
		super();
	}
	public ressource(String ressource_name, String type, int quantity,
			String informationsFournisseur) {
		super();
		this.ressource_name = ressource_name;
		this.type = type;
		this.quantity = quantity;
		this.informationsFournisseur = informationsFournisseur;
	}
	public int getRessource_id() {
		return ressource_id;
	}
	public void setRessource_id(int ressource_id) {
		this.ressource_id = ressource_id;
	}
	public String getRessource_name() {
		return ressource_name;
	}
	public void setRessource_name(String ressource_name) {
		this.ressource_name = ressource_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getInformationsFournisseur() {
		return informationsFournisseur;
	}
	public void setInformationsFournisseur(String informationsFournisseur) {
		this.informationsFournisseur = informationsFournisseur;
	}
	
}


public class Usuario {
	String nombre;
	ListaPR prs;
	Shirt camiseta;
	int talla;
	
	public Usuario(String n, int t) {
		nombre = n;
		talla = t;
		prs = new ListaPR();
		camiseta = null;
	}
	
	public boolean hasShirt(){
		if(camiseta != null)
			return true;
		return false;
	}
	
	public void doPullRequest(String titulo) {
		prs.insertarPR(titulo);
		if(prs.getSize() >= 4) {
			pedirCamiseta(talla);
		}
	}
	
	public void pedirCamiseta(int t) {
		System.out.println("Quiero mi camiseta.");
		camiseta = new Shirt(t);
	}
	
	public int getTotalRequests() {
		return prs.getSize();
	}
	
	public void listPullRequests() {
		prs.listPRs();
	}
}

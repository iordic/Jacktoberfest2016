
public class Usuario {
	String nombre;
	ListaPR prs;
	Shirt camiseta;
	int talla;
	
	public Usuario(String n) {
		//...
		prs = new ListaPR();
		camiseta = null;
	}
	
	public boolean hasShirt(){
		//...
		return true;
	}
	
	public void doPullRequest(String titulo){
		
		if() {
			// Sí tiene tamaño(prs) >= 4 -> pedirCamiseta(talla)
		}
	}
	
	public void pedirCamiseta(int talla) {
		
	}
	
	public int getTotalRequests() {
		//...
		return 0;
	}
}

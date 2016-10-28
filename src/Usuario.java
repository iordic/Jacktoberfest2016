
public class Usuario {
	String nombre;
	ListaPR prs;
	Shirt camiseta;
	
	public Usuario(String n) {
		//...
		prs = new ListaPR();
		camiseta = null;
	}
	
	public boolean hasShirt(){
		//...
		return false;
	}
	
	public void doPullRequest(String titulo){
		
	}
	
	public void pedirCamiseta(int talla) {
		
	}
	
	public int getTotalRequests() {
		//...
		return 0;
	}
}

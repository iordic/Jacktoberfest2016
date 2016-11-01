
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
	
	/**
	 * Comprueba si el usuario tiene la camiseta ya creada
	 * @return true si ya se ha inicializado
	 */
	public boolean hasShirt(){
		if(camiseta != null)
			return true;
		return false;
	}
	
	/**
	 * Crea un PR (nodo) en la lista de PRs del usuario
	 * y comprueba si el usuario tiene 4 o más para pedir
	 * la camiseta
	 * @param titulo titulo del PR
	 */
	public void doPullRequest(String titulo) {
		prs.insertarPR(titulo);
		if(prs.getSize() >= 4) {
			pedirCamiseta(talla);
		}
	}
	
	/**
	 * Inicializa el objeto de la camiseta con la talla
	 * @param t la talla del usuario
	 */
	public void pedirCamiseta(int t) {
		System.out.println("Quiero mi camiseta.");
		camiseta = new Shirt(t);
	}
	
	/**
	 * Devuelve el número de PRs creados por el usuario
	 * @return tamaño de la lista
	 */
	public int getTotalRequests() {
		return prs.getSize();
	}
	
	/**
	 * Imprime por pantalla los titulos de los PRs 
	 * creados por el usuario
	 */
	public void listPullRequests() {
		prs.listPRs();
	}
}

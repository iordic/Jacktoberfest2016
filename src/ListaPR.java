/**
 * Implementación de lista simplemente enlazada.
 * @author Jordi
 */
public class ListaPR {

    PullRequest first;

    public ListaPR() {
        first = new PullRequest(null);
    }

    /**
     * Crea un nuevo PR (nodo) y lo inserta en la lista
     * @param t título del PR nuevo a insertar
     */
    public void insertarPR(String t) {
        PullRequest newNode = new PullRequest(t);
        if (isEmpty()) {
            first.next = newNode;
        } 
        else {
            PullRequest aux = first;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = newNode;
        }
    }

    /**
     * Devuelve el tamaño de la lista
     * @return número de elementos que contiene la lista
     */
    public int getSize() {
        int i = 0;
        PullRequest aux = first;
        while (aux.next != null) {
            aux = aux.next;
            i++;
        }
        return i;
    }

    /**
     * Comprueba si la lista está vacía
     * @return true si está vacía y false en caso contrario
     */
    public boolean isEmpty() {
        if (first.next == null) {
            return true;
        }
        return false;
    }

    /**
     * Devuelve el primer nodo (o PR) de la lista
     * @return primer elemento de la lista
     */
    public PullRequest getFirst() {
        return first.next;
    }

    /**
     * Imprime por pantalla los titulos de los elementos
     */
    public void listPRs() {
        PullRequest aux = first;
        while (aux.next != null) {
            aux = aux.next;
            System.out.println(aux.titulo);
        }
    }

    /**
     * Busca un nodo por su titulo y lo elimina de la lista
     * @param title titulo a buscar
     */
    public void deletePR(String title) {
    	if(isEmpty()) {
    		System.out.println("La lista está vacía.");
    		return;
    	}
		PullRequest aux = first;
		PullRequest prev = null;
		while(aux.next != null) {
			if(aux.titulo.equals(title) && prev != null) {
				prev.next = aux.next;
				System.out.println("Se ha eliminado el PR " + title +".");
				return;
			}
			else if(aux.titulo.equals(title) && prev == null) {
				first = aux.next;
				System.out.println("Se ha eliminado el PR " + title +".");
				return;
			}
			prev = aux;
			aux = aux.next;
		}
		System.out.println("El PR " + title + " no existe.");
    }

    /**
     * Busca un pull request por el título y lo devuelve.
     * @param title título del pull request
     * @return nodo que contiene el pull request
     */
    public PullRequest searchPR(String title) {
        PullRequest aux = first;
        while(aux.next != null) {
            if(aux.titulo.equals(title)) {
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }

}

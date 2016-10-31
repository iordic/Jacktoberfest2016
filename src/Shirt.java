
public class Shirt {

    private int talla;

    public Shirt(int t) {
        this.talla = t;
    }

    /**
     * Devuelve el número de talla de la camiseta pedida por el usuario
     * @return número de talla de la camiseta
     */
    public int getTalla() {
        return talla;
    }

    /**
     * Modifica la talla de la camiseta
     * @param t nueva talla de la camisa
     */
    public void setTalla(int t) {
        this.talla = t;
    }

}

package Obligatorio.entity;

/**
 *
 * @author Gaston Marichal
 */
public class Direccion {
    
    private String ciudad;
    private String calle;
    private int numero;
    private boolean bis;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isBis() {
        return bis;
    }

    public void setBis(boolean bis) {
        this.bis = bis;
    }

    public Direccion() {
    }

    public Direccion(String ciudad, String calle, int numero, boolean bis) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.bis = bis;
    }

    @Override
    public String toString() {
        return "Direccion:" + this.getCalle() + " " + this.getNumero() + " " + this.bisToString() + ", " + this.getCiudad().toUpperCase();
    }
    
    private String bisToString() {
        String ret = "";
        if (this.isBis()) {
            ret = "Bis";
        }
        return ret;
    }
    
}

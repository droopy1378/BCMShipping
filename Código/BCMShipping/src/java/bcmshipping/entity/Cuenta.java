package bcmshipping.entity;

import java.util.Date;

/**
 *
 * @author Juan Casalderrey, Ignacio Benedetoo & Gastón Marichal
*/
public class Cuenta {
    
    /*Attrs*/
    private String alias;
    private String contraseña;
    private Date fechaAlta;
    private boolean estado;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cuenta() {
        this.setEstado(true);
        this.setFechaAlta(new Date());
    }

    public Cuenta(String alias, String contraseña) {
        this.alias = alias;
        this.contraseña = contraseña;
        this.setEstado(true);
        this.setFechaAlta(new Date());
    }

    @Override
    public String toString() {
        return "Cuenta: " + alias;
    }
    
}

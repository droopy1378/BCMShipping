package bcmshipping.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Juan Casalderrey, Ignacio Benedetoo & Gastón Marichal 
 */
public class Usuario {
    
    //Attrs
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fechaNacimiento;
    private String telefono;
    private Direccion direccion;
    private Cuenta cuenta;
    private ArrayList<Pedido> listaPedidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    public Usuario() {
        this.listaPedidos = new ArrayList<Pedido>();
    }

    public Usuario(int id, String nom, String ape, String mail, Date feNac, String tel, Direccion dir, Cuenta cta) {
        this.id = id;
        this.nombre = nom;
        this.apellido = ape;
        this.correo = mail;
        this.fechaNacimiento = feNac;
        this.telefono = tel;
        this.direccion = dir;
        this.cuenta = cta;
        this.listaPedidos = new ArrayList<Pedido>();
    }

}

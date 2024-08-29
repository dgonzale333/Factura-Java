package generate;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    //Private class ultimo codigo
    private static int ultimoCodigo = 0;

    //Constructor
    public Producto() {
        ultimoCodigo++;
        this.codigo = "P" + String.format("%05d", ultimoCodigo);
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters and setters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Retorna la informacion

    @Override
    public String toString() {
        return codigo + "\n" + nombre + "\n" + precio;
    }
}

package generate;

public class ItemFactura {
    private Producto Producto;
    private int cantidad;

    //Constructor

    public ItemFactura(Producto Producto, int cantidad) {
        this.Producto = Producto;
        this.cantidad = cantidad;
    }

    // Getters and Setters

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        this.Producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /*Método para calcular el importe de un producto.
      La operación es cantidad * precio que tiene el objeto producto.*/


    public float calcularImporte() {
        return (float) (cantidad * Producto.getPrecio());
    }


    //Retorna la informacion

    @Override
    public String toString() {
        return Producto.getNombre() + "\t" + cantidad + "\t" + calcularImporte();
    }
}


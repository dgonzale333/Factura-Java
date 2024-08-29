package generate;

public class ItemFactura {
    private producto producto;
    private int cantidad;

    //Constructor

    public itemFactura(producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters and Setters

    public producto getProducto() {
        return producto;
    }

    public void setProducto(producto producto) {
        this.producto = producto;
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
        return (float) (cantidad * producto.getPrecio());
    }


    //Retorna la informacion

    @Override
    public String toString() {
        return producto.getNombre() + "\t" + cantidad + "\t" + calcularImporte();
    }
}


package generate;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private cliente cliente;
    private itemFactura[] items;

    //Creacion del indice de items

    private int indiceItems = 0;
    private static final int MAX_ITEMS = 10;
    private static int ultimoFolio = 0;

    // Constructor
    public Factura(String descripcion, cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.fecha = new Date();
        this.items = new itemFactura[MAX_ITEMS];

        // Asigna un folio único incrementando el último folio

        ultimoFolio++;
        this.folio = ultimoFolio;
    }

    // Método para añadir ítems a la factura

    public void addItemFactura(itemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            items[indiceItems] = item;
            indiceItems++;
        } else {
            System.out.println("No se pueden agregar más ítems. Se alcanzó el máximo permitido.");
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (itemFactura item : items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    // Método para generar el detalle de la factura

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emisión: ")
                .append(dateFormat.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++) {
            itemFactura item = items[i];
            if (item != null) {
                sb.append(i + 1) // Número del ítem
                        .append("\t")
                        .append(item)
                        .append("\n");
            }
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());
        return sb.toString();
    }

    //Retorna la informacion

    @Override
    public String toString() {
        return generarDetalle();
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import generate.Producto;
import generate.ItemFactura;
import generate.Factura;
import generate.Cliente;

import java.util.Scanner;

public class Main {
    //Creacion del nuevo cliente
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        //Informacion del cliente

        System.out.print("Ingrese el Nombre del Cliente: ");
        cliente.setNombre(scanner.nextLine());

        System.out.print("Ingrese el Nif del Cliente: ");
        cliente.setNif(scanner.nextLine());

        //Genrecacion de factura automatica

        System.out.print("Ingrese una descripción de la factura (o presione Enter para usar la predeterminada): ");
        String descripcion = scanner.nextLine();

        descripcion = (descripcion.length() == 0)
                ? "La factura electrónica es un documento digital que certifica la venta de bienes o servicios,\ncumpliendo con requisitos legales y fiscales. Contiene información clave como los datos del vendedor y comprador,\nnúmero de factura, fecha, descripción de productos o servicios, precios, impuestos y el total a pagar."
                : descripcion;

        Factura factura = new Factura(descripcion, cliente);

        System.out.println();

        //Bucle para generar la cantidad de productos a ingresar

        for (int i = 0; i < 5; i++) {
            Producto producto = new Producto();

            //Informacion del producto

            // Código del producto asignado automáticamente en el constructor de Producto

            System.out.print("Ingrese el nombre del producto nº " + (i + 1) + ": ");
            producto.setNombre(scanner.nextLine());

            //Imprime el precio del producto

            System.out.print("Ingrese el precio del producto: ");
            producto.setPrecio(scanner.nextFloat());

            //Imprime La cantidad del producto

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();


            // Se pasa el producto y la cantidad en el orden correcto al constructor de ItemFactura

            factura.addItemFactura(new ItemFactura(Producto, Cantidad));

            System.out.println();
            scanner.nextLine();
        }

        System.out.println(factura);
    }
}
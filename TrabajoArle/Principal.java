package TrabajoArle;

import CarroCompras.Producto;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //instancias
        Productos cajero = new Productos();
        Scanner scan = new Scanner(System.in);
        List<Double> facturas = new ArrayList<Double>();
        double totalFactura = 0;

        //lista de productos
        List<Productos> pro1 = new ArrayList<>();
        pro1.add(new Productos("0001", "Placa madre", 250000 ));
        List<Productos> pro2 = new ArrayList<>();
        pro2.add(new Productos("0002", "chasis", 450000));
        List<Productos> pro3 = new ArrayList<>();
        pro3.add(new Productos("0003", "Pantalla", 1250000));



        //abrir caja
        System.out.println("Ingrese su nombre:");
        cajero.setNombre(scan.next());
        System.out.println("Ingrese la Base:");
        cajero.setBaseInicial(scan.nextDouble());


        //Carrito de compras
        String teclaCerrar = "n";
        int i = 0;
        //do while para el cerrar caja
        do {
            //Carrito

            String teclaCompra = "y";
            int j = 0;
            //while para acumular
            while (teclaCompra.equalsIgnoreCase("y")) {

                System.out.print("Ingrese el Codigo: ");
                String codigo = scan.next();
                scan.nextLine();

                if (codigo.equals(pro1.get(0).getIdProducto())){
                    int precio = pro1.get(0).getPrecio();
                    double iva = 1.19;
                    double total = precio * iva;
                    facturas.add(total);


                }else if (codigo.equals(pro2.get(0).getIdProducto())){
                    int precio = pro2.get(0).getPrecio();
                    double iva = 1.19;
                    double total = precio * iva;
                    facturas.add(total);

                }else if (codigo.equals(pro3.get(0).getIdProducto())) {
                    int precio = pro3.get(0).getPrecio();
                    double iva = 1.19;
                    double total = precio * iva;
                    facturas.add(total);

                }else{
                    System.out.println("El producto no se encuentra en nuestra empresa");
                }
                System.out.print("Desea continuar comprando (y/n)? ");
                teclaCompra = scan.nextLine();
                j++;
            }
            //for para calcular el total de la factura
            for (int p = 0; p < facturas.size(); p++){
                totalFactura += facturas.get(p);
            }
            //mensaje de final de factura
                System.out.println(totalFactura);

            System.out.print("Desea cerrar caja (y/n)? ");
            teclaCerrar = scan.nextLine();
            i++;

        }while(teclaCerrar.equalsIgnoreCase("n"));



        //for para calcular el total vendido
        for (int p = 0; p < facturas.size(); p++){
            cajero.setBaseFinal(facturas.get(p) + cajero.getBaseInicial() );
        }
        //total de ventas
        double inicio = cajero.getBaseInicial();
        double finals = cajero.getBaseFinal();
        double total = finals - inicio;
        System.out.println("Ganancias del dia: " + total);
        // faltan los mensajes tanto de factura (linea 79) como de ganacia la resta de la base incial y la final (96)
    }
}

package TrabajoArle;



import java.util.*;

public class Principal {
    public static  void main(String[] args) {
        //instancias
        Productos cajero = new Productos();
        Scanner scan = new Scanner(System.in);
        List<Compra> facturas = new ArrayList<>();
        int totalFactura = 0;


        //lista de productos
        List<Productos> pro1 = new ArrayList<>();
        //Prodcuto 1
        pro1.add(new Productos("0001", "Placa madre", 250000));
        List<Productos> pro2 = new ArrayList<>();
        //Prodcuto 2
        pro2.add(new Productos("0002", "chasis", 450000));
        List<Productos> pro3 = new ArrayList<>();
        //Prodcuto 1
        pro3.add(new Productos("0003", "Pantalla", 1250000));

        System.out.println("..........Bienvenido Cajero........");
        //abrir caja
        System.out.println("Ingrese Por favor su nombre:");
        cajero.setNombre(scan.next());
        System.out.println("Ingrese la Base con la que cuenta la caja:");
        cajero.setBaseInicial(scan.nextDouble());

        System.out.println("\n ------Compra---------");
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
                System.out.print("\n Ingrese el Codigo del Producto (0001,0002,0003): ");
                String codigo = scan.next();
                scan.nextLine();

                if (codigo.equals(pro1.get(0).getIdProducto())) {

                    cajero.setNombreProduc(pro1.get(0).getNombreProducto());
                    String nom = cajero.getNombreProduc();

                    System.out.println("\n Cuantos "+ pro1.get(0).getNombreProducto() + " desea llevar?:");
                    cajero.setCantidad(scan.nextInt());
                    int canti = cajero.getCantidad();

                    Double precio = pro1.get(0).getPrecio();
                    double iva = 1.19;
                    double totalC = (precio * iva) * cajero.getCantidad() ;
                    cajero.setvTotal(totalC);


                    facturas.add(new Compra(cajero.getvTotal(), nom, canti));
                    scan.nextLine();



                }else if (codigo.equals(pro2.get(0).getIdProducto())) {
                    cajero.setNombreProduc(pro2.get(0).getNombreProducto());
                    String nom = cajero.getNombreProduc();

                    System.out.println("\n Cuantos " + pro2.get(0).getNombreProducto() + " desea llevar?:");
                    cajero.setCantidad(scan.nextInt());
                    int canti = cajero.getCantidad();

                    Double precio = pro2.get(0).getPrecio();
                    double iva = 1.19;
                    double totalC = (precio * iva) * cajero.getCantidad();

                    cajero.setvTotal(totalC);
                    

                    facturas.add(new Compra(cajero.getvTotal(), nom, canti));
                    scan.nextLine();




                }

                else if (codigo.equals(pro3.get(0).getIdProducto())) {

                        cajero.setNombreProduc(pro3.get(0).getNombreProducto());
                        String nom = cajero.getNombreProduc();

                        System.out.println("\n Cuantos "+ pro3.get(0).getNombreProducto() + " desea llevar?:");
                        cajero.setCantidad(scan.nextInt());
                        int canti = cajero.getCantidad();

                        Double precio = pro3.get(0).getPrecio();
                        double iva = 1.19;
                        double totalC = (precio * iva) * cajero.getCantidad() ;

                        cajero.setvTotal(totalC);

                        facturas.add(new Compra(cajero.getvTotal(), nom, canti));
                        scan.nextLine();


                }
                else {
                    System.out.println("El producto no se encuentra en nuestra empresa");
                }


                System.out.print("\n Desea Comprar otro producto (y/n)? ");
                teclaCompra = scan.nextLine();
                j++;
            }

            //for para calcular el total de la factura
            for (int p = 0; p < facturas.size(); p++){
                totalFactura += facturas.get(p).getvTotal();
            }
            System.out.println("\n \t------Factura------");
            System.out.println("Cajero: " + cajero.getNombre() );

                for(int f = 0; f < facturas.size(); f++) {
                    System.out.println("\t\t* "+facturas.get(f).getNombreProduc()+ "\t| "+facturas.get(f).getCantidad()+"\t\t| "+ facturas.get(f).getvTotal() +"\t\t\t|");
                }
            System.out.println("\t\t Total factura: " + "\t| " + totalFactura  );
                System.out.println("\n Enter para continuar.........");
            scan.nextLine();


            System.out.println("\n -----Cierre de caja-----");

                System.out.print("\n Desea cerrar caja (y/n)? ");
                teclaCerrar = scan.nextLine();
                i++;

            } while (teclaCerrar.equalsIgnoreCase("n"));

        
       // calcular el total vendido

            cajero.setBaseFinal(totalFactura + cajero.getBaseInicial() );

        System.out.println("\n -----Total en ventas-----");
        //total de ventas
        double inicio = cajero.getBaseInicial();
        double finals = cajero.getBaseFinal();System.out.println(finals);
        double total = finals - inicio;
        System.out.println("\nLas Ganancias del dia fueron : " + total);



    }
}

package TrabajoArle;

import CarroCompras.Producto;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //instancias
        Productos cajero = new Productos();
        Scanner scan = new Scanner(System.in);

        //lista de productos
        List<Productos> pro1 = new ArrayList<>();
        pro1.add(new Productos("0001", "Placa madre", 250000, 1.19));
        List<Productos> pro2 = new ArrayList<Productos>();
        pro2.add(new Productos("0002", "chasis", 450000, 1.19));
        List<Productos> pro3 = new ArrayList<Productos>();
        pro3.add(new Productos("0003", "Pantalla", 1250000, 1.19));





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
            ArrayList compra = new ArrayList();
            String teclaCompra = "y";
            int j = 0;
            //while para acumular
            while (teclaCompra.equalsIgnoreCase("y")) {

                System.out.print("Ingrese el Codigo: ");
                String codigo = scan.next();
                scan.nextLine();
                if (codigo.equals(pro1.get(0).getIdProducto())){
                    
                }else{
                    System.out.println("Error");
                }

                System.out.print("Desea continuar comprando (y/n)? ");
                teclaCompra = scan.nextLine();
                j++;
            }
            System.out.print("Desea cerrar caja (y/n)? ");
            teclaCerrar = scan.nextLine();
            i++;

        }while(teclaCerrar.equalsIgnoreCase("n"));

    }
}

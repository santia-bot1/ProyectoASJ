package TrabajoArle;


public class Cajero {
    private String nombre;
    private Double baseInicial;
    private Double baseFinal;


    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getBaseFinal() { return baseFinal; }

    public void setBaseFinal(Double baseFinal) { this.baseFinal = baseFinal; }

    public Double getBaseInicial() { return baseInicial; }

    public void setBaseInicial(Double baseInicial) { this.baseInicial = baseInicial; }
}
class Compra extends Cajero{

    private String nombreProduc;
    private double vTotal;
    private int cantidad;

    Compra(double total, String nom , int canti ) {

        this.nombreProduc = nom;
        this.vTotal = total ;
        this.cantidad = canti;
    }

    public Compra() {

    }


    public void setvTotal(double vTotal) {
        this.vTotal = vTotal;
    }

    public double getvTotal() {
        return vTotal;
    }



    public void setNombreProduc(String nombreProduc) { this.nombreProduc = nombreProduc; }

    public String getNombreProduc() { return nombreProduc; }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}
class Productos extends Compra {
    private String idProducto;
    private String nombreProducto;
    private Double precio;




    Productos(String id,String nom, double prec ) {
        idProducto = id;
        nombreProducto = nom;
        precio = prec;



    }

    public Productos() {

    }

    public void setIdProducto(String idProducto) { this.idProducto = idProducto; }

    public String getIdProducto() { return idProducto; }

    public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }

    public String getNombreProducto() { return nombreProducto; }

    public void setPrecio(double precio) { this.precio = precio; }

    public double getPrecio() { return precio; }



}



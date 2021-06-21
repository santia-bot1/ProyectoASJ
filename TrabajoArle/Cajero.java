package TrabajoArle;


import java.text.NumberFormat;

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
class Productos extends Cajero {
    private String idProducto;
    private String nombreProducto;
    private int precio;



    Productos(String id,String nom, int prec ) {
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

    public void setPrecio(int precio) { this.precio = precio; }

    public int getPrecio() { return precio; }


}



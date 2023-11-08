public class Producto {
    private String nombre;
    private int tipo;
    private int cantidadact;
    private int cantidadmin;
    private double preciounidad;



    public Producto(String nombre, int tipo, int cantidadact, int cantidadmin, double preciounidad){
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadact = cantidadact;
        this.cantidadmin = cantidadmin;
        this.preciounidad = preciounidad;

    }
    public String darNombre(){return nombre;}
    public void establecerNombre(String nombre){this.nombre = nombre;}
    public int darCantidadact(){return cantidadact;}
    public void establecerCantidadact(int cantidadact){this.cantidadact = cantidadact;}
    public void establecerTipo(int tipo){this.tipo = tipo;}
    public int darTipo(){return tipo;}
    public int darCantidadmin(){return cantidadmin;}
    public void establecerCantidadmin(int cantidadmin){this.cantidadmin = cantidadmin;}

    public double darPreciounidad() {
        return preciounidad;
    }

    public void establecerPreciounidad(double preciounidad) {
        this.preciounidad = preciounidad;
    }

    public double precioFinal(){
        switch (this.tipo){
            case 0:
                return preciounidad * 1.16;
            case 1:
                return preciounidad * 1.04;
            case 2:
                return preciounidad * 1.12;
            default:
                return -1;
        }
    }


}

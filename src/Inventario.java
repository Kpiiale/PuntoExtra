public class Inventario {
    private Producto[] p;
    private static int[] cantidadVentas;
    private static double[] dineroVentas;

    public Inventario(){
        this.p = new Producto[4];
        p[0] = new Producto("Lapiz", 0, 30, 5, 0.25);
        p[1] = new Producto("Galletas", 1, 14, 10, 1.25);
        p[2] = new Producto("Shampoo", 2, 30, 8, 2.25);
        p[3] = new Producto("Huevos", 1, 15, 5, 0.15);
        this.cantidadVentas = new int[4];
        this.dineroVentas = new double[4];
    }
    public void reabastecerProducto(int id, int cantidad) {
        p[id].establecerCantidadact(p[id].darCantidadact()+cantidad);
    }

    public Producto[] darP() {
        return p;
    }

    public void modificarProducto(int producto, String nombre, int tipo, int cantidadact, int cantidadmin, double preciounidad){
        p[producto].establecerNombre(nombre);
        p[producto].establecerTipo(tipo);
        p[producto].establecerCantidadact(cantidadact);
        p[producto].establecerCantidadmin(cantidadmin);
        p[producto].establecerPreciounidad(preciounidad);
    }
    public static void realizarVenta(int p, int cantidad, double precio){
        cantidadVentas[p] += cantidad;
        dineroVentas[p] += (cantidad*precio);
    }

    public static int ventasProducto(int p){
        return cantidadVentas[p];
    }

    public static double dineroVentasProducto(int p){
        return dineroVentas[p];
    }

    public static int productoMasVendido(){
        int indice = 0, maximo = cantidadVentas[0];
        for(int i = 0; i < cantidadVentas.length; i++){
            if (cantidadVentas[i] > maximo){
                maximo = cantidadVentas[i];
                indice = i;
            }
        }
        return indice;
    }

    public static int productoMenosVendido(){
        int indice = 0, minimo = cantidadVentas[0];
        for(int i = 0; i < cantidadVentas.length; i++){
            if (cantidadVentas[i] < minimo){
                minimo = cantidadVentas[i];
                indice = i;
            }
        }
        return indice;
    }

    public static String ventasTotales(){
        double total = 0;
        for (int i = 0; i < dineroVentas.length; i++){total = total + dineroVentas[i];}
        return "El total de dinero recaudado de ventas es: " + total;
    }

}

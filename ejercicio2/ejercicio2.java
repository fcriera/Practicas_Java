package ejercicio2;
public class ejercicio2 {
    
    public static void main (String[] args) {
        Producto jabon = new Producto ("Jabón",20.5);
        System.out.println(jabon.getPrecioUnitario());
        Producto leche = new Producto ("Leche",0.5);
        System.out.println(leche.getPrecioUnitario());

        CuentaSupermercado productosDeJuan = new CuentaSupermercado();
        
        productosDeJuan.agregarProducto(leche);
        productosDeJuan.agregarProducto(jabon);
        productosDeJuan.agregarProducto(leche);
        productosDeJuan.agregarProducto(leche);
    
        System.out.println(productosDeJuan.mostrarCuenta());

        CuentaSupermercado productosDePepe = new CuentaSupermercado();
        productosDePepe.agregarProducto(jabon);
        productosDePepe.agregarProducto(leche);
        productosDePepe.agregarProducto(jabon);
        productosDePepe.agregarProducto(leche);
        productosDePepe.agregarProducto(jabon);

        System.out.println(productosDePepe.mostrarCuenta());
    }
}

package ejercicio2;
public class ejercicio2 {
    
    public static void main (String[] args) {
        Producto jabon = new Producto ("Jabón",1.4) ;
        System.out.println(jabon.getPrecioUnitario());
        Producto leche = new Producto ("Leche",0.7) ;
        System.out.println(leche.getPrecioUnitario());

        CuentaSupermercado productos = new CuentaSupermercado();
        
        System.out.println(productos);
    
    
    
    
    
    
    
    }
}

public class Mi_Producto {

    public static void main (String [] args){
        Producto p = new Producto();
        Inventario inv = new Inventario();
        inv.vender();
        p.registro("Frituras");
        p.registro(1375);

    }
}

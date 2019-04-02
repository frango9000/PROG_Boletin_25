package prog_boletin_25;
/**
 * @author fsancheztemprano
 */
public class Main {
    static NuevoUsuario v;
    static Devoluciones d;
    public static void main(String[] args) {
        v = new NuevoUsuario();  
        d = new Devoluciones();
        v.setVisible(true);      
    }
    
    public static void control(int i){
        if(i == 0){
            v.setVisible(false);
            d.setVisible(true);
        }else{
            v.setVisible(true);
            d.setVisible(false);
        }
    }
}
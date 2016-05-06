package exemplo;
public class Contador {
    
    private static int quantidade;
        
    public static synchronized int getQuantidade(){
            quantidade++;
            return quantidade;
        }
    
}

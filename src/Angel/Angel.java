package Angel;

public class Angel {
    private String nombre;

    public static void decirNombre() {
    	System.out.println("Hola soy Ángel");
    }
    
    public static void main(String[] args) {
    	
    	Angel persona=new Angel();
    	Angel.decirNombre();
    	
    	
    }
}
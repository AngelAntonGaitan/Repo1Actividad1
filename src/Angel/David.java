package Angel;

public class David {
    private String nombre;

    public David(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        David david = new David("David");
        david.saludar();
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + ".");
    }
}
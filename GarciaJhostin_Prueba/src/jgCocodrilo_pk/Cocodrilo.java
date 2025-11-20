package jgCocodrilo_pk;

public class Cocodrilo extends Amiota {
    private String color;

    public Cocodrilo(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
        System.out.println("1 | ------------------------ Cocodrilo");
    }

    @Override
    public String saludar() {
        return "Hola, soy un Cocodrilo llamado " + this.nombre;
    }

    // Sobrecarga
    public String saludar(String momento) {
        return "Hola, soy " + this.nombre + " y te saludo por la " + momento;
    }

    public boolean comer() {
        // Lógica simple para el ejemplo
        return true;
    }

    // Getters y Setters
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}

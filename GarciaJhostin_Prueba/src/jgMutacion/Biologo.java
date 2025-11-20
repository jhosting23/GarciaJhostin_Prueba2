package jgMutacion;

public class Biologo extends Persona {
    private String rol;

    public Biologo(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    public void solicitarMutacion() {
        System.out.println("Biologo solicitando mutacion...");
    }

    public void registrarAnimal() {
        System.out.println("Biologo registrando animal...");
    }

    public void mostrarResultado() {
        System.out.println("Mostrando resultado...");
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}

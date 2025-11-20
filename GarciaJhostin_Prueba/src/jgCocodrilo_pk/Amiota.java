package jgCocodrilo_pk;

import jgFanerozoico.Tetrapoda;

public abstract class Amiota extends Tetrapoda {
    protected String nombre;
    protected int edad;

    public Amiota(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("1 | -------------------- Amiota");
    }

    public abstract String saludar();

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}

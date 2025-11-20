package jgMutacion;

import java.util.Random;
import jgCocodrilo_pk.Cocodrilo;
import jgCocodrilo_pk.CocodriloGarcia;

public class IA {
    private String rol;
    private int capacidad;

    public IA(String rol, int capacidad) {
        this.rol = rol;
        this.capacidad = capacidad;
    }

    public CocodriloGarcia mutar(Cocodrilo original) {
        Random random = new Random();
        int radiacion = random.nextInt(901) + 100; // 100 a 1000

        System.out.println("Mutación en proceso: " + radiacion + " mSv");

        // Asumimos que siempre es factible para el ejercicio, o podríamos poner una condición
        // Si la mutación es factible genera... Al mutar se debe crear...
        
        // Retornar la nueva especie
        return new CocodriloGarcia(original.getNombre(), original.getEdad(), original.getColor());
    }

    public void evaluarMutacion() {
        System.out.println("IA evaluando mutacion...");
    }

    public void generarRadiacion() {
        System.out.println("IA generando radiacion...");
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }
}

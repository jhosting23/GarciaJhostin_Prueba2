package jgMutacion;

import jgCocodrilo_pk.Cocodrilo;
import jgCocodrilo_pk.CocodriloGarcia;
import java.util.Scanner;

public class TanqueMutacion {
    
    public void activarTanque(IA ia, Cocodrilo especimen) {
        System.out.println("\n");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║      MÓDULO DE MUTACIÓN ACTIVADO       ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("\n");
        System.out.println("========================================");
        System.out.println("TANQUE DE MUTACIÓN - SISTEMA ACTIVADO");
        System.out.println("========================================");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea mutar al espécimen? (si/no): ");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            CocodriloGarcia mutado = ia.mutar(especimen);
            if (mutado != null) {
                System.out.println("\n--- NUEVA ESPECIE CREADA ---");
                System.out.println("Nombre: " + mutado.getNombre());
                System.out.println("Especie: CocodriloGarcia");
                System.out.println("Saludo: " + mutado.saludar());
            } else {
                System.out.println("Mutación fallida.");
            }
        } else {
            System.out.println("Mutación cancelada.");
        }
        // No cerramos el scanner aquí para no cerrar System.in si se usa en otro lado
    }
}

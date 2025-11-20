import jgCocodrilo_pk.Cocodrilo;
import jgMutacion.Biologo;
import jgMutacion.IA;
import jgMutacion.TanqueMutacion;

public class jgControlador {
    
    public static void main(String[] args) {
        // Refactor: Se extrajo la lógica de carga a un método independiente para limpiar el main
        cargarSistema();

        System.out.println("\n");
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║    SISTEMA BIOLÓGICO - ÁRBOL FILOGENÉTICO        ║");
        System.out.println("║            Análisis de Vertebrados               ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println("\n");

        System.out.println("Creando espécimen de Cocodrilo...");
        System.out.println("");

        // Inicializamos los actores del sistema (Biólogo e IA)
        // Refactor: Uso de prefijo jg para variables locales según convención del estudiante
        Biologo jgBiologo = new Biologo("Juan", 30, "Investigador");
        IA jgIa = new IA("Supervisor", 100);
        
        // Creamos el animal base (Cocodrilo)
        // Nota: Al instanciar, el constructor imprimirá la jerarquía del árbol filogenético automáticamente
        Cocodrilo jgCocodrilo = new Cocodrilo("Bombardino", 5, "Verde");
        
        // Mostramos la ficha técnica del espécimen creado
        System.out.println("\n--- INFORMACIÓN DEL ESPÉCIMEN ---");
        System.out.println("===== Ficha del Espécimen =====");
        System.out.println("Nombre: " + jgCocodrilo.getNombre());
        System.out.println("Edad: " + jgCocodrilo.getEdad() + " años");
        System.out.println("Especie: Crocodylus acutus"); 
        System.out.println("Tipo: Reptil");
        System.out.println("Color: " + jgCocodrilo.getColor());
        System.out.println("ID: JG-001");
        System.out.println("===============================");

        // Probamos el comportamiento polimórfico y la sobrecarga de métodos
        System.out.println(jgCocodrilo.saludar()); 
        
        // --- INICIO DEL PROCESO DE MUTACIÓN ---
        // Refactor: Implementación del patrón de diseño para el Tanque de Mutación
        TanqueMutacion jgTanque = new TanqueMutacion();
        jgTanque.activarTanque(jgIa, jgCocodrilo);
    }

    // Método refactorizado para simular la carga del sistema
    public static void cargarSistema() {
        System.out.println("Iniciando sistema biológico de BIOTECH-2K25...");
        try {
            for (int i = 0; i <= 100; i += 10) {
                // Barra de carga visual
                System.out.print("\r| " + i + "%");
                Thread.sleep(150); 
            }
            System.out.println("\nCarga completa.");
        } catch (InterruptedException e) {
            System.out.println("Error en la carga.");
        }
    }
}

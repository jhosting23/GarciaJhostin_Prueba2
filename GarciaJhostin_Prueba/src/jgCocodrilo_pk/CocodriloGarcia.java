package jgCocodrilo_pk;

public class CocodriloGarcia extends Cocodrilo {
    
    public CocodriloGarcia(String nombre, int edad, String color) {
        super(nombre, edad, color);
        System.out.println("1 | ---------------------------- CocodriloGarcia");
    }

    @Override
    public String saludar() {
        return "Grrr... Soy un CocodriloGarcia mutado llamado " + this.nombre;
    }
}

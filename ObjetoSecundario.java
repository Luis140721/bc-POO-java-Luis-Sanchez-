// Archivo: ObjetoSecundario.java

public class ObjetoSecundario { 
    
    // Atributos (Mínimo 4)
    public String nombreCabina;      
    public int capacidadPersonas;     
    public String equipoPrincipal;    
    public boolean estaDisponible;    
    
    // 🛠️ Constructor
    public ObjetoSecundario(String nombre, int capacidad, String equipo) {
        this.nombreCabina = nombre;
        this.capacidadPersonas = capacidad;
        this.equipoPrincipal = equipo;
        this.estaDisponible = true; 
    }

    // Método 1: Imprime la información (void)
    public void mostrarEstado() {
        System.out.println("--- RECURSO SECUNDARIO: CABINA " + nombreCabina + " ---");
        System.out.println("Disponibilidad: " + (estaDisponible ? "DISPONIBLE" : "OCUPADA"));
    }

    // Método 2: Modifica el estado de disponibilidad (Setter)
    public void cambiarDisponibilidad(boolean disponible) {
        this.estaDisponible = disponible;
    }

    // Método 3: Retorna el nombre (Getter)
    public String getNombre() {
        return nombreCabina;
    }
}
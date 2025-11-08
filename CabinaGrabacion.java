// Archivo: CabinaGrabacion.java

public class CabinaGrabacion {
    
    // Atributos (Mínimo 4)
    public String nombreCabina;      
    public int capacidadPersonas;     
    public String equipoPrincipal;    
    public boolean estaDisponible;    
    
    // Constructor
    public CabinaGrabacion(String nombre, int capacidad, String equipo) {
        this.nombreCabina = nombre;
        this.capacidadPersonas = capacidad;
        this.equipoPrincipal = equipo;
        this.estaDisponible = true; // Estado inicial: DISPONIBLE
    }

    // Método 1: Imprime la información (void)
    public void mostrarEstado() {
        System.out.println("--- CABINA " + nombreCabina + " ---");
        System.out.println("Capacidad Máxima: " + capacidadPersonas + " personas");
        System.out.println("Equipo Principal: " + equipoPrincipal);
        System.out.println("Disponibilidad: " + (estaDisponible ? "DISPONIBLE" : "OCUPADA"));
    }

    // Método 2: Modifica el estado de disponibilidad (Setter)
    public void cambiarDisponibilidad(boolean disponible) {
        this.estaDisponible = disponible;
        System.out.println("\n[ACTUALIZACIÓN]: El estado de " + nombreCabina + " ha sido cambiado.");
    }

    // Método 3: Retorna el nombre (Getter)
    public String getNombre() {
        return nombreCabina;
    }
    
    // 🚀 MÉTODO PRINCIPAL DE EJECUCIÓN (main) - Añadido para que puedas ejecutar el archivo
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("TESTING: EJERCICIO 2 - CABINA GRABACION");
        System.out.println("======================================");
        
        // 1. Crear el objeto Cabina
        CabinaGrabacion cabinaA = new CabinaGrabacion("Cabina A", 5, "Consola Neve");
        
        // 2. Mostrar estado inicial
        System.out.println("--- ESTADO INICIAL ---");
        cabinaA.mostrarEstado();
        
        // 3. Usar el Setter (Cambiar a NO disponible/false)
        cabinaA.cambiarDisponibilidad(false); 
        
        // 4. Mostrar estado después del cambio
        System.out.println("--- ESTADO ACTUALIZADO ---");
        cabinaA.mostrarEstado();
        
        // 5. Usar el Getter
        System.out.println("\nGetter usado -> Nombre de la Cabina: " + cabinaA.getNombre());
    }
}






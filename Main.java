// Archivo: PruebaDominio.java

public class PruebaDominio {
    
    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println("🚀 PRUEBA DEL DOMINIO: SOUNDPRO ESTUDIO DE GRABACIÓN");
        System.out.println("==================================================");

        // =================================================================
        // 1. CREACIÓN Y USO DE OBJETOS SESIONGRABACION (Clase Principal)
        // =================================================================
        System.out.println("\n--- 🎤 1. SESIONES DE GRABACIÓN CREADAS (Mínimo 2) ---");
        
        // Objeto 1
        SesionGrabacion sesionPop = new SesionGrabacion("SP-POP-01", "Banda Acústica", "Grabación Musical", 5, 45000.0);
        // Objeto 2
        SesionGrabacion sesionPodcast = new SesionGrabacion("SP-POD-02", "Empresa XYZ", "Producción de Podcast", 2, 60000.0);

        // --- DEMOSTRACIÓN DEL OBJETO 1 (sesionPop) ---
        System.out.println("\n--- Sesión 1: " + sesionPop.getCodigoReserva() + " (Uso de Getter) ---");
        
        // Llama al método void para imprimir información
        sesionPop.imprimirResumen();
        
        // Llama al método que retorna valor calculado
        double costoTotalPop = sesionPop.calcularCostoTotal();
        System.out.println("Costo Final Calculado: $" + costoTotalPop);
        
        // Llama al método setter
        sesionPop.setCabinaAsignada(false); // Cambiamos la asignación a 'false'
        
        // Llama nuevamente al método void para mostrar el cambio
        System.out.println("\n--- Sesión 1 Actualizada ---");
        sesionPop.imprimirResumen();

        // --- DEMOSTRACIÓN DEL OBJETO 2 (sesionPodcast) ---
        System.out.println("\n--- Sesión 2: " + sesionPodcast.getCodigoReserva() + " ---");
        
        // Llama al método void
        sesionPodcast.imprimirResumen();
        
        // Llama al método que retorna valor calculado
        System.out.println("Costo Final Calculado: $" + sesionPodcast.calcularCostoTotal());

        // =================================================================
        // 2. CREACIÓN Y USO DE OBJETOS CABINAGRABACION (Clase Secundaria)
        // =================================================================
        System.out.println("\n--- 🎧 2. CABINAS DISPONIBLES (Mínimo 2) ---");
        
        // Objeto 1
        CabinaGrabacion cabinaA = new CabinaGrabacion("Cabina A (Grande)", 6, "Pro Tools/Consola");
        // Objeto 2
        CabinaGrabacion cabinaB = new CabinaGrabacion("Cabina B (Voz)", 1, "Ableton/Micrófono");
        
        // --- DEMOSTRACIÓN DEL OBJETO 1 (cabinaA) ---
        String nombreCabinaA = cabinaA.getNombre(); // Llama al método Getter
        System.out.println("\n--- Cabina: " + nombreCabinaA + " ---");
        
        // Llama al método void para mostrar el estado inicial
        System.out.println("Estado Inicial:");
        cabinaA.mostrarEstado();
        
        // Llama al método Setter (cambiar disponibilidad)
        cabinaA.cambiarDisponibilidad(false); // La Cabina A es ocupada
        
        // Llama al método void para mostrar el estado actualizado
        System.out.println("Estado Final:");
        cabinaA.mostrarEstado();
        
        // --- DEMOSTRACIÓN DEL OBJETO 2 (cabinaB) ---
        String nombreCabinaB = cabinaB.getNombre(); // Llama al método Getter
        System.out.println("\n--- Cabina: " + nombreCabinaB + " ---");
        
        // Llama al método void para mostrar el estado inicial
        System.out.println("Estado Inicial:");
        cabinaB.mostrarEstado();

        // Llama al método Setter (cambiar disponibilidad)
        cabinaB.cambiarDisponibilidad(true); // La Cabina B es liberada
        
        // Llama al método void para mostrar el estado actualizado
        System.out.println("Estado Final:");
        cabinaB.mostrarEstado();
        
        System.out.println("\n==================================================");
        System.out.println("✅ PRUEBA DE DEMOSTRACIÓN FINALIZADA.");
        System.out.println("==================================================");
    }
}


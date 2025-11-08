// Archivo: PruebaDominio.java

public class PruebaDominio { 
    
    public static void main(String[] args) {
        
        System.out.println("==================================================");
        System.out.println("🚀 PRUEBA DEL DOMINIO: SOUNDPRO ESTUDIO DE GRABACIÓN");
        System.out.println("==================================================");

        // --- 1. CREACIÓN Y USO DE OBJETOS ObjetoPrincipal ---
        System.out.println("\n--- 🎤 1. SESIONES DE GRABACIÓN ---");
        
        // Uso del Constructor ObjetoPrincipal (CORREGIDO: Solo valores, sin etiquetas)
        ObjetoPrincipal sesionPop = new ObjetoPrincipal("SP-POP-01", "Banda Acústica", "Grabación Musical", 5, 45000.0);
        
        // Llamada a todos los métodos
        System.out.println("Código: " + sesionPop.getCodigoReserva()); // Getter
        sesionPop.imprimirResumen(); // Método void
        System.out.println("Costo Final Calculado: $" + sesionPop.calcularCostoTotal()); // Valor Calculado
        sesionPop.setCabinaAsignada(false); // Setter (CORREGIDO)

        // --- 2. CREACIÓN Y USO DE OBJETOS ObjetoSecundario ---
        System.out.println("\n--- 🎧 2. CABINAS ---");
        
        // Uso del Constructor ObjetoSecundario (CORREGIDO: 3 parámetros)
        ObjetoSecundario cabinaA = new ObjetoSecundario("Cabina A (Grande)", 6, "Pro Tools/Consola");
        ObjetoSecundario cabinaB = new ObjetoSecundario("Cabina B (Voz)", 1, "Ableton/Micrófono");
        
        // Llamada a todos los métodos
        System.out.println("Cabina: " + cabinaA.getNombre()); // Getter
        cabinaA.mostrarEstado(); // Método void
        cabinaA.cambiarDisponibilidad(false); // Setter
        cabinaA.mostrarEstado(); 

        System.out.println("\n==================================================");
        System.out.println("✅ PRUEBA FINALIZADA.");
        System.out.println("==================================================");
    }
}


// Archivo: SesionGrabacion.java

public class SesionGrabacion {
    
    // 🎼 Atributos (Mínimo 5, con tipos variados)
    // Usamos 'public' temporalmente para simplificar, pero en POO se recomienda 'private'
    
    public String codigoReserva;       // String: Identificador de la sesión
    public String nombreArtista;      // String: Nombre del artista/cliente
    public String tipoServicio;       // String: Grabación, Masterización, etc.
    public int duracionHoras;         // int: Duración de la sesión en horas
    public double costoBase;          // double: Costo base por hora
    public boolean cabinaAsignada;     // boolean: Indica si ya tiene cabina

    // 🛠️ Constructor
    // Se usa para inicializar el objeto al crearlo (new SesionGrabacion(...))
    public SesionGrabacion(String codigo, String artista, String servicio, int horas, double costo) {
        this.codigoReserva = codigo;
        this.nombreArtista = artista;
        this.tipoServicio = servicio;
        this.duracionHoras = horas;
        this.costoBase = costo;
        this.cabinaAsignada = true; // Por defecto, la cabina está asignada
    }

    // ➡️ Método void (Imprime información)
    // No retorna nada, solo realiza una acción (imprimir)
    public void imprimirResumen() {
        System.out.println("=== RESUMEN DE SESIÓN SOUNDPRO ===");
        System.out.println("Código: " + codigoReserva);
        System.out.println("Artista: " + nombreArtista);
        System.out.println("Duración: " + duracionHoras + " horas");
        System.out.println("Cabina Asignada: " + (cabinaAsignada ? "Sí" : "No"));
    }

    // ➡️ Método que retorna valor calculado
    // Calcula el costo total simple: Horas * Costo Base
    public double calcularCostoTotal() {
        return duracionHoras * costoBase;
    }

    // ➡️ Método Getter (Obtener)
    // Devuelve el valor del atributo sin modificarlo
    public String getCodigoReserva() {
        return codigoReserva;
    }

    // ➡️ Método Setter (Establecer/Modificar)
    // Permite cambiar el estado de la asignación de la cabina
    public void setCabinaAsignada(boolean estado) {
        this.cabinaAsignada = estado;
        System.out.println("El estado de la cabina asignada se ha actualizado a: " + estado);
    }

    // 🚀 Método main para prueba (opcional)
    public static void main(String[] args) {
        // Crear un nuevo objeto (instanciar la clase)
        SesionGrabacion sesionPop = new SesionGrabacion("SP-001", "Solista Laura", "Grabación Musical", 4, 30000.0);
        
        // Usar el método void
        sesionPop.imprimirResumen();
        
        // Usar el método de valor calculado
        double total = sesionPop.calcularCostoTotal();
        System.out.println("Costo total de la sesión: $" + total);
        
        // Usar el método setter
        sesionPop.setCabinaAsignada(false); // Cambiamos el estado
        
        // Usar el método getter
        System.out.println("Código de reserva obtenido: " + sesionPop.getCodigoReserva());
    }
}
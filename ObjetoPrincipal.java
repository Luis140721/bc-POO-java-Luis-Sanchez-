// Archivo: ObjetoPrincipal.java
public class ObjetoPrincipal {
    
    // Atributos (Mínimo 5)
    public String codigoReserva;       
    public String nombreArtista;      
    public String tipoServicio;       
    public int duracionHoras;         
    public double costoBase;          
    public boolean cabinaAsignada;     

    // 🛠️ Constructor
    public ObjetoPrincipal(String codigo, String artista, String servicio, int horas, double costo) {
        this.codigoReserva = codigo;
        this.nombreArtista = artista;
        this.tipoServicio = servicio;
        this.duracionHoras = horas;
        this.costoBase = costo;
        this.cabinaAsignada = true; 
    }

    // Método void
    public void imprimirResumen() {
        System.out.println("=== RESUMEN DE SESIÓN SOUNDPRO ===");
        System.out.println("Código: " + codigoReserva);
        System.out.println("Artista: " + nombreArtista);
        System.out.println("Duración: " + duracionHoras + " horas");
    }

    // Método que retorna valor calculado
    public double calcularCostoTotal() {
        return duracionHoras * costoBase;
    }

    // Getter
    public String getCodigoReserva() {
        return codigoReserva;
    }

    // Setter
    public void setCabinaAsignada(boolean estado) {
        this.cabinaAsignada = estado;
    }
}

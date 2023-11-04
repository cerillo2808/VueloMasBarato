public class Vuelo{
    private double precio;
    private String ciudadSalida;
    private String ciudadLlegada;
    private String horaSalida;
    private String horaLlegada;
    private String fechaSalida;
    private String fechaLlegada;
    private String codigoVuelo;
    private int asientos;
    
    public Vuelo (double precio, String ciudadSalida, String ciudadLlegada, String horaSalida, String horaLlegada, String fechaSalida, String fechaLlegada, String codigoVuelo, int asientos) {
        this.precio = precio;
        ciudadSalida = ciudadSalida.trim().toUpperCase();
        this.ciudadSalida = ciudadSalida;
        ciudadLlegada = ciudadLlegada.trim().toUpperCase();
        this.ciudadLlegada = ciudadLlegada;
        this.horaSalida = horaSalida;
        this.fechaSalida = fechaSalida;
        this.codigoVuelo = codigoVuelo;
        this.asientos = asientos;
    }
    
    public String getCiudadSalida (){
        return this.ciudadSalida;
    }
    
    public String getCiudadLlegada (){
        return this.ciudadLlegada;
    }
    
    public double getPrecio (){
        return this.precio;
    }
}
package parcial1;

public class DDJJFertilizanteIngresoDetalle {
    
    private String codigo;
    private String nombre;
    private String tipoEnvase;
    private double capacidadEnvase;
    private int cantidad;
    private double subtotal;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public double getCapacidadEnvase() {
        return capacidadEnvase;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public void setCapacidadEnvase(double capacidadEnvase) {
        this.capacidadEnvase = capacidadEnvase;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}

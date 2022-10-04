package parcial1;

import java.util.ArrayList;

public class DDJJIngresoFertilizante {
    
    private int anioDeclaracion;
    private int mesDeclaracion;
    private double montoXIngreso;
    private String empresa;
    private long cuitEmpresa;
    private ArrayList<DDJJFertilizanteIngresoDetalle> detallesFertilizantes;

    public int getAnioDeclaracion() {
        return anioDeclaracion;
    }

    public int getMesDeclaracion() {
        return mesDeclaracion;
    }

    public double getMontoXIngreso() {
        return montoXIngreso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public long getCuitEmpresa() {
        return cuitEmpresa;
    }

    public void setAnioDeclaracion(int anioDeclaracion) {
        this.anioDeclaracion = anioDeclaracion;
    }

    public void setMesDeclaracion(int mesDeclaracion) {
        this.mesDeclaracion = mesDeclaracion;
    }

    public void setMontoXIngreso(double montoXIngreso) {
        this.montoXIngreso = montoXIngreso;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setCuitEmpresa(long cuitEmpresa) {
        this.cuitEmpresa = cuitEmpresa;
    }

    public void setDetallesFertilizantes(ArrayList<DDJJFertilizanteIngresoDetalle> detallesFertilizantes) {
        this.detallesFertilizantes = detallesFertilizantes;
    }

    public ArrayList<DDJJFertilizanteIngresoDetalle> getDetallesFertilizantes() {
        return detallesFertilizantes;
    }
    
    public void addFertilizante(DDJJFertilizanteIngresoDetalle detallesFert) {
        if(this.detallesFertilizantes == null)
            this.detallesFertilizantes = new ArrayList<>();
        this.detallesFertilizantes.add(detallesFert);
    }

}

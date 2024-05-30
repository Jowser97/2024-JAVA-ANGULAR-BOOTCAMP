package ud22ej3.modelo;

public class AsignadoA {
	
    private String cientifico;
    private String idProyecto;

    // Constructor
    public AsignadoA(String cientifico, String idProyecto) {
        this.cientifico = cientifico;
        this.idProyecto = idProyecto;
    }

    // Getters and Setters
    public String getCientifico() {
        return cientifico;
    }

    public void setCientifico(String cientifico) {
        this.cientifico = cientifico;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }
}

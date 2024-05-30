package ud22ej3.modelo;

public class Proyecto {
    private String idProyecto;
    private String nombre;
    private int horas;

    // Constructor
    public Proyecto(String idProyecto, String nombre, int horas) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.horas = horas;
    }

    // Getters and Setters
    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}

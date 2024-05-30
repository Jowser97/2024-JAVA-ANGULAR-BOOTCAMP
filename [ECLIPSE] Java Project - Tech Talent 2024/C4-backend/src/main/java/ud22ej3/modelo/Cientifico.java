package ud22ej3.modelo;

public class Cientifico {
    private String dni;
    private String nomApels;

    // Constructor
    public Cientifico(String dni, String nomApels) {
        this.dni = dni;
        this.nomApels = nomApels;
    }

    // Getters and Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomApels() {
        return nomApels;
    }

    public void setNomApels(String nomApels) {
        this.nomApels = nomApels;
    }
}

package generate;

public class Cliente {
    private String Nombre;
    private String nif;//Numero de identificacion fiscal.


    //Getter and setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}


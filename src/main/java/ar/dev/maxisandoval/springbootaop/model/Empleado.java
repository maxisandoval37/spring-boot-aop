package ar.dev.maxisandoval.springbootaop.model;

public class Empleado {

    private String id;
    private String nombre;

    public Empleado () {}

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
}

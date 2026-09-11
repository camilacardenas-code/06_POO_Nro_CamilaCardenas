package vallegrande.edu.pe.miperfil.model;

public class Perfil {
    private String nombre;
    private String carrera;
    private String semestre;
    private String pasatiempo;
    private String meta;
    public Perfil(String nombre, String carrera, String semestre, String pasatiempo, String meta){
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.pasatiempo = pasatiempo;
        this.meta = meta;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getSemestre(){
        return semestre;
    }
    public String getPasatiempo(){
        return pasatiempo;
    }
    public String getMeta(){
        return meta;
    }
    public String obtenerPresentacion(){
        return "Hola, soy" + nombre + "\nCarrera:" + carrera + "\nSemestre:" + semestre + "\nPasatiempo:" + pasatiempo + "\nMeta:" + meta;
    }
}
import java.util.*;

class Persona{
    private String nombre;
    private String curp;
    private String telefono;
    private String fecha;

    public Persona(String nombre,String curp,String telefono,String fecha){
        setNombre(nombre);
        setCurp(curp);
        setTelefono(telefono);
        setFecha(fecha);
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public String toString(){
        return nombre + curp + telefono + fecha;
    }


}

class Main{
    public static void main(String[] args){
        
    }
}

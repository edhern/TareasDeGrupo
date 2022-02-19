package Registro_Datos;


public class Persona {
    
    String nombre="";
    String Apellido="";
    String DPI="";
    String FechaNacimiento="";
    String Direccion="";
    String Telefono="";
    String Genero="";
    
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    public void SetApellido(String Apellido){
        this.Apellido=Apellido;
    }
    public void SetDpi(String DPI){
        this.DPI=DPI;
    }
    public void SetNacimiento(String FechaNacimiento){
        this.FechaNacimiento=FechaNacimiento;
    }
    public void SetDireccion(String Direccion){
        this.Direccion=Direccion;
    }
    public void SetTelefono(String Telefono){
        this.Telefono=Telefono;
    }
    public void SetGenero(String Genero){
        this.Genero=Genero;
    }
    
    public String GetNombre(){
        return this.nombre;
    }
    public String GetApellido(){
        return this.Apellido;
    }
    public String GetDpi(){
        return this.DPI;
    }
    public String GetNacimiento(){
        return this.FechaNacimiento;
    }
    public String GetDireccion(){
        return this.Direccion;
    }
    public String GetTelefono(){
        return this.Telefono;
    }
    public String GetGenero(){
        return this.Genero;
    }
    

}


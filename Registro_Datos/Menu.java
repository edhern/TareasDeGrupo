package Registro_Datos;
import java.util.*;

public class Menu {
    static Scanner Opcion = new Scanner(System.in);
    static Persona RegistroPersona[] = new Persona[10];
    public static void main(String[] args)
    {
        
        boolean activo = true;
        do{
            Options();
        String InData = Opcion.nextLine(); 
            if(Integer.parseInt(InData)==1){
                Store();
            }else if(Integer.parseInt(InData)==2){
                All();
            }else if(Integer.parseInt(InData)==3){
                One();
            }else if(Integer.parseInt(InData)==4){
                Update();
            }else if(Integer.parseInt(InData)==5){
                Destroy();
            }else if(Integer.parseInt(InData)==6){
                activo = false;
                System.out.println("Vuelva pronto");
            }else{
                System.out.println("la opcion no existe");
            }
        }while(activo);
        
    }
    
    public static void Options(){
        System.out.println("""
        -------------------------------------------------
        |        REGISTRO Y GESTION DE USUARIOS          |
        -------------------------------------------------

        Selecciones una opcion
        1: Registrar Nuevo Usuario
        2: Ver Lista de Usuarios 
        3: Buscar Detalle de un Usuario
        4: Actualizar Datos de Usuario
        5: Eliminar un Usuario
        6: Salir

        --Wilson Peñate--Eddison Rafael--Matias Posada--
        """);
    }
    public static void Store(){
        System.out.println("Ingrese Nombre");
            String nombre=Opcion.nextLine();
        System.out.println("Ingrese Apellido");
            String apellido=Opcion.nextLine();
        System.out.println("Ingrese Numero DPI");
            String DPI=Opcion.nextLine();
        System.out.println("Ingrese Fecha de Nacimiento del usuario");
            String FechaNacimiento= Opcion.nextLine();
        System.out.println("Ingrese la direccion del usuario");
            String Direccion=Opcion.nextLine();
        System.out.println("Ingrese telefono del usuario");
            String Telefono=Opcion.nextLine();
        System.out.println("Ingrese genero del usuario");
            String Genero= Opcion.nextLine();

        Persona NuevoRegistro = new Persona();
        NuevoRegistro.SetNombre(nombre);
        NuevoRegistro.SetApellido(apellido);
        NuevoRegistro.SetDpi(DPI);
        NuevoRegistro.SetNacimiento(FechaNacimiento);
        NuevoRegistro.SetDireccion(Direccion);
        NuevoRegistro.SetTelefono(Telefono);
        NuevoRegistro.SetGenero(Genero);
        if(RegistroPersona[0]==null){
            RegistroPersona[0]=NuevoRegistro;
        }else{
            for ( int i=1;i < RegistroPersona.length - 1; i++){
            if(RegistroPersona[i]==null){
                RegistroPersona[i]=NuevoRegistro;
                break;
            }
            }
        }
        
    }
    public static void All(){
        for (Persona Registro:RegistroPersona ){
            if(Registro != null){
                System.out.println("-------------------------------------------------");
                System.out.println(
                    "Nombre: "+Registro.GetNombre()+" Apellido:"+
                    Registro.GetApellido()+" Dpi:"+
                    Registro.GetDpi()+" Fecha de nacimiento :"+
                    Registro.GetNacimiento());
                System.out.println(
                    "Ubicacion:"+Registro.GetDireccion()+" Telefono:"+
                    Registro.GetTelefono()+" Genero: "+
                    Registro.GetGenero());
                System.out.println("-------------------------------------------------");
            }
        }
    }
    public static void One(){
        System.out.println("Ingrese DPI para ver el detalle de un usuario");
        String DPI=Opcion.nextLine();
        for (Persona Registro:RegistroPersona ){
            if(Registro != null){
                if(Registro.GetDpi().equals(DPI)){
                    System.out.println("-------------------------------------------------");
                    System.out.println(
                        "Nombre: "+Registro.GetNombre()+" Apellido:"+
                        Registro.GetApellido()+" Dpi:"+
                        Registro.GetDpi()+" Fecha de nacimiento :"+
                        Registro.GetNacimiento());
                    System.out.println(
                        "Ubicacion:"+Registro.GetDireccion()+" Telefono:"+
                        Registro.GetTelefono()+" Genero: "+
                        Registro.GetGenero());
                    System.out.println("-------------------------------------------------");
                }
            }
        }
    }
    public static void Update(){
        System.out.println("Ingrese DPI del Usuario que desea Actualizar");
        String ValidacionDPI=Opcion.nextLine();
        for (Persona Registro:RegistroPersona ){
            if(Registro != null){
                
                if(Registro.GetDpi().equals(ValidacionDPI)){
                System.out.println("Ingrese Nombre");
                    String nombre=Opcion.nextLine();
                System.out.println("Ingrese Apellido");
                    String apellido=Opcion.nextLine();
                System.out.println("Ingrese Numero DPI");
                    String DPI=Opcion.nextLine();
                System.out.println("Ingrese Fecha de Nacimiento del usuario");
                    String FechaNacimiento= Opcion.nextLine();
                System.out.println("Ingrese la direccion del usuario");
                    String Direccion=Opcion.nextLine();
                System.out.println("Ingrese telefono del usuario");
                    String Telefono=Opcion.nextLine();
                System.out.println("Ingrese genero del usuario");
                    String Genero= Opcion.nextLine();
                    Registro.SetApellido(apellido);
                    Registro.SetDpi(DPI);
                    Registro.SetNacimiento(FechaNacimiento);
                    Registro.SetDireccion(Direccion);
                    Registro.SetTelefono(Telefono);
                    Registro.SetGenero(Genero);
                    Registro.SetNombre(nombre);
                break;
                }
            }
        }
}
    public static void Destroy(){
    System.out.println("Ingrese DPI para eliminar un registro");
    String DPI=Opcion.nextLine();
        for ( int i=0;i < RegistroPersona.length - 1; i++){
            if(RegistroPersona[i]!=null){
                if(RegistroPersona[i].GetDpi().equals(DPI)){
                    RegistroPersona[i]=null;
                    break;
                }
            }
        }
    }
}

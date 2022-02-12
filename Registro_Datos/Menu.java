package Registro_Datos;
import java.util.*;

public class Menu {
    public static void main(String[] args)
    {
        ArrayList<Persona> RegistroPersona = new ArrayList<Persona>();
        boolean activo = true;
        try (Scanner Opcion = new Scanner(System.in)) {
            do{System.out.println("""
                -------------------------------------------------
                |             REGISTRO Y GESTION DE USUARIOS              |
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
            String InData = Opcion.nextLine(); 
                if(Integer.parseInt(InData)==1){

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
                    RegistroPersona.add(NuevoRegistro);

                }else if(Integer.parseInt(InData)==2){

                    for (Persona Registro:RegistroPersona ){
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

                }else if(Integer.parseInt(InData)==3){
                    System.out.println("Ingrese DPI para ver el detalle de un usuario");
                    String DPI=Opcion.nextLine();
                    Iterator<Persona> Registros =RegistroPersona.iterator();
                    while(Registros.hasNext()){
                        Persona NuevoRegistro = Registros.next();
                        if(NuevoRegistro.GetDpi().equals(DPI)){
                            System.out.println("-------------------------------------------------");
                            System.out.println(
                                "Nombre: "+NuevoRegistro.GetNombre()+" Apellido:"+
                                NuevoRegistro.GetApellido()+" Dpi:"+
                                NuevoRegistro.GetDpi()+" Fecha de nacimiento :"+
                                NuevoRegistro.GetNacimiento());
                            System.out.println(
                            "Ubicacion:"+NuevoRegistro.GetDireccion()+" Telefono:"+
                            NuevoRegistro.GetTelefono()+" Genero"+
                            NuevoRegistro.GetGenero());
                            System.out.println("-------------------------------------------------");
                        }
                        }
                    
                    
                }else if(Integer.parseInt(InData)==4){
                    System.out.println("Ingrese DPI del Usuario que desea Actualizar");
                        String ValidacionDPI=Opcion.nextLine();

                    Iterator<Persona> Registros =RegistroPersona.iterator();
                    while(Registros.hasNext()){
                        Persona NuevoRegistro = Registros.next();
                        if(NuevoRegistro.GetDpi().equals(ValidacionDPI)){
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
                                NuevoRegistro.SetNombre(nombre);
                                NuevoRegistro.SetApellido(apellido);
                                NuevoRegistro.SetDpi(DPI);
                                NuevoRegistro.SetNacimiento(FechaNacimiento);
                                NuevoRegistro.SetDireccion(Direccion);
                                NuevoRegistro.SetTelefono(Telefono);
                                NuevoRegistro.SetGenero(Genero);
                        }
                    }
                    
                }else if(Integer.parseInt(InData)==5){

                    System.out.println("Ingrese DPI para eliminar un registro");
                    String DPI=Opcion.nextLine();
                    Iterator<Persona> Registros =RegistroPersona.iterator();
                    while(Registros.hasNext()){
                        Persona NuevoRegistro = Registros.next();
                        if(NuevoRegistro.GetDpi().equals(DPI)){
                            Registros.remove();
                            System.out.println("Registro eliminado con exito");
                        }
                    }

                    for (Persona Registro:RegistroPersona ){
                        System.out.println(
                        Registro.GetNombre()+" "+
                        Registro.GetApellido()+" "+
                        Registro.GetDpi()+" "+
                        Registro.GetNacimiento()+" "+
                        Registro.GetDireccion()+" "+
                        Registro.GetTelefono()+" "+
                        Registro.GetGenero());
                        }
                }else if(Integer.parseInt(InData)==6){
                    activo = false;
                    System.out.println("Vuelva pronto");
                }else{
                    System.out.println("la opcion no existe");
                }
            }while(activo);
        }
    }
}



public class tarea4 {
    public static void main(String[] args) {
        
        Persona persona = new Persona(); 
        persona.setedad(24);
        persona.setnombre("Pablo");
        persona.settelefono(80302055);

        System.out.println(persona.getedad());
        System.out.println(persona.getnombre());
        System.out.println(persona.gettelefono());

        Cliente cliente = new Cliente();
        cliente.setedad(30);
        cliente.setnombre("Lucia");
        cliente.settelefono(70204599);
        cliente.setCredito(2000);

        System.out.println(cliente.getedad());
        System.out.println(cliente.getnombre());
        System.out.println(cliente.gettelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setedad(50);
        trabajador.setnombre("Pedro");
        trabajador.settelefono(86274832);
        trabajador.setSalario(500);

        System.out.println(trabajador.getedad());
        System.out.println(trabajador.getnombre());
        System.out.println(trabajador.gettelefono());
        System.out.println(trabajador.getSalario());




        
    }



    
}
// comienza Clase persona
class Persona {

    private int edad;
    private String nombre;
    private int telefono;



    

    public void setedad ( int edad ){

        this.edad=edad;
    }

    public int getedad(){

        return edad;
    }

    public void setnombre ( String nombre ){

        this.nombre=nombre;
    }

    public String getnombre(){

        return nombre;
    }
    public void settelefono ( int telefono ){

        this.telefono=telefono;
    }

    public int gettelefono(){

        return telefono;
    }

}

/// comienza clase cliente
class Cliente extends Persona{
    int Credito;
   
  public Cliente() {

    System.out.println ("estoy en la clase cliente");
  }
    public void setCredito ( int Credito ){

        this.Credito=Credito;
    }

    public int getCredito(){

        return Credito;
    }        
}
//// comienza clase trabajador
class Trabajador extends Persona{
    int Salario;
   
  public Trabajador() {

    System.out.println ("estoy en la clase Trabajador");
  }
    public void setSalario ( int Salario ){

        this.Salario=Salario;
    }

    public int getSalario(){

        return Salario;
    }        
}
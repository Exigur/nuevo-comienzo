public class tarea3 {

     public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setedad(24);
        persona.setnombre("Pablo");
        persona.settelefono(80302055);

        System.out.println(persona.getedad());
        System.out.println(persona.getnombre());
        System.out.println(persona.gettelefono());




        
    }



    
}

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

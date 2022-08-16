public class tarea1 {
    public static void main(String[] args) throws Exception {
        int resultado;
        resultado = suma(1,2,3);
     
        System.out.println(resultado);

        coche nuevocoche= new coche();
        nuevocoche.AnadirPuerta();
        nuevocoche.AnadirPuerta();
        nuevocoche.AnadirPuerta();


        System.out.println(nuevocoche.puertas);
    }
    public static int suma (int numero1, int numero2,int  numero3) {

        return numero1 + numero2 + numero3;
    }
    
       
    }

    class coche {

        public int puertas = 4;
 
        public void AnadirPuerta (){
 
                  this.puertas++;
        }

    
}

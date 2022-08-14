public class App {
    public static void main(String[] args) throws Exception {

        

        ////// declaracion de las variables

         int numuerolf = 0;

         int numerowhile = -4;

         int numerodowhile = -4;

         int numerofor=0;

         String estacion = "verano";


         //////// comienza el codigo para if
   
         if (numuerolf <0){
         
         
   
          System.out.println( "el numero es negativo");
          
         }
         
             else 
             
             if (numuerolf>0) {
   
                 System.out.println( "el numero es positivo");
                 
                              }
   
                    else {
   
                                System.out.println( "el numero es cero");
                                
   
                         }
   
                         System.out.println(" ");

      ////////////comienza el codigo para while                   
      
          
    
         while (numerowhile<3){

            
         numerowhile++;
         System.out.println(numerowhile);               
         }

         System.out.println(" ");
//////////// comienza el codigo para do while

         

         do {
            System.out.println(numerodowhile);
            numerodowhile++; } while(numerodowhile<3);

            System.out.println(" ");
///////////////comienza el codigo para for 
            

            for(;numerofor<=3;numerofor++){

               System.out.println(numerofor);


            }

            System.out.println(" ");

            //////// comienza el codigo de swicht y case

            switch (estacion) {

                case "verano":
                System.out.println("es verano");
                break;

                case "invierno":
                System.out.println("es invierno");
                break;

                case "primavera":
                System.out.println("es primavera");
                break;

                case "otoño":
                System.out.println("es otoño");
                break;

                default: System.out.println("lo que coloco no es ninguna estacion ");
                
                
            }





    }
   }

   


   

    

    
    


    

    


    
    


    


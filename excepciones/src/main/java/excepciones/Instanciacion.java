package excepciones;
//Juan Diego ramírez Muñoz  Samuel Fernando Quiroga Tovar

//El error en este código es quer no se está tratando la excepción el el método
// y para esto se debe propagar la excepción ya que en el método siguiente se está atrpando y tratando
//pero si no se propaga desde el otro método, no es posible tratarla
public class Instanciacion {
        public Object crearObjeto() throws InstantiationException, IllegalAccessException {
         Class<?> clase = this.getClass();
         return clase.newInstance();

         
        }
        
         public static void main(java.lang.String[] args) throws Exception {

         Instanciacion creador = new Instanciacion();
         try {
         Object creado = creador.crearObjeto();
         System.out.println(creado);
         }
         catch (InstantiationException | IllegalAccessException errorCrea){
        System.out.println("No se pudo crear el objeto");
         }
         
         CalcularIva calculo = new CalcularIva();
         calculo.verificarUrl("https://raw.githubusercontent.com/annexare/Countries/master/scripts/utils.ts");

         }
         
        }
        //2. El método debería lanzar una excepción que le de a conocer al usuario que exedió 
        //el límite de boletas permitido, y es una excepción comprobada, ya que es ineherente al
        //método, y viene desde el usuario
        //No debería retornar un 0, ya que este es un valor y podría confundir al usuario

        //3.En ese caso sí sería una buena práctica lanzar una excepción que diga que 
        // el estudiante no tiene ninguna clase, para que no devuelva un nulo ya que esto
        // se vería feo

        //4. 

public class Main {
    public static void main(String[] args) {

        // Tipos de datos
        //Primitivos
        /*
        Tipo integer(enteros)
            byte( -128 and 127 )
            Short( -32768 to 32767 )
            Int( -2147483648 to 2147483647 ) //Tipo de dato preferido para integers
            long(  -9223372036854775808 to 9223372036854775807 )
        Tipo floating(flotante)
            *Se usa float y double para declarar los números flotantes, se tiene que terminar el valor con
             una f de float o una d de double*
             float puede tener hasta 7 decimales y double hasta 15, en general es más util usar double
        Tipo boolean (booleanos)
            Toman el valor de True o False
            Mas que nada usados para testeo de condicionales
        Tipo char (caracter)
            Para un solo caracter
            Tambien se pueden usar ciertos simbolos ascci
        Tipo String (cadena)
            Para guardar una serie de carácteres
            Es en realidad un tipo no-primitivo porque se refiere a un objeto
        */
        //No-Primitivos
        /*
        Se le llama de referencia porque hacen referencia a objetos
        Se diferencian de los primitivos en que:
            Estan predefinidos (ya definidos) en Java, los primitivos lo crea el programador y no estan predefinidos
                (Excepto Strings)
            No se puede usar para hacer operaciones a+b
            Siempre tienen un valor (No pueden ser null)
            Empiezan con una letra mayúscula (String, Arrays, Classes, Interface) los no primitivo
                empiezan con minúscula
        */

        //Casting
        /*Casting es cuando queres pasar un tipo de dato de un tipo a otro
        Hay dos tipo
            Widening(Agrandamiento) que es automatico
                byte -> short -> char -> int -> long -> float -> double
                    int myInt = 9;
                    double myDouble = myInt;
            Narrowing(Empequeñecimiento) que es manual
                double -> float -> long -> int -> char -> short -> byte
                    double myDouble = 9.78d;
                    int myInt = (int) myDouble;
        */
        //Concatenacion
            /*Para concatenar tambien se puede usar el metodo contat()
            cadena1.concat(cadena2)
            */
        //Carácteres especiales
            /*
            Insertan carácteres especiales en un string
                \´ = ´
                \" = "
                \\ = \
                \n = Nueva linea
                \r = Vuelve al principio de la linea, se puede usar junto a \n. Estan al en desuso debido a que algunos
                    buscadores ya los los soportan o tienen que ir juntos con \n
                \t = Tab
                \b = Hace un espacio hacia atras, en desuso en varios buscadores
        //Java Math
            /* Algunos operadores matemáticos
                Math.max(x,y): Encuentra al más grande
                Math.min(x,y): Encuentra al más pequeño
                Math.sqrt(x): Devuelve la Raiz Cuadrada
                Math.abs(x): Devuelve el valor absoluto
                Math.random(): numero aleatorio entre 0 y 1
                               para cambiar parámetro es Math.random() * numeroQueQueremos +1
             */
        //If corto
            /*
            variable = (condition) ? expressionTrue :  expressionFalse;

            int time = 20;
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);
             */
        //Loop For-Each
             /*
             Este loop se usa exclusivamente para loopear a traves de los elementos in un arreglo
                    for (type variableName : arrayName) {
                         // code block to be executed
                         }
                    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                    for (String i : cars) {
                    System.out.println(i);
                                           }
              */
    }
}
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
             *
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
        //ArrayList<Tipo De Dato> nombre arreglo=new ArrayList<Mismo tipo de dato>();
            /*
            nombrearreglo.add(elemento a agregar)

            Se puede hacer un array list de array list
                ArrayList<ArrayList<Tipo De dato>>Nombre Array=new ArrayList();
            */

        //Metodos
            /*<Modificador de Acceso> <tipo de retorno> <Nombre Metodo>{}

                *metodos Sobrecargados: Son cuando dos o más métodos tiene el mismo nombre, la manera de diferenciarlo
                                        es mediante el número de parametros
            */
        //Final
            /*
            Es usa como Modificador de Acceso la variable se con final no se puede alterar en la etapa post compilado
            */

        //Objetos
            /*
            Tienen sus atributos que se declara pero no necesariamente se inicializan y sus metodos
             */

        //Instanciar
            /*
            Es la acción de crear un objeto de una clase

            <Nombre Clase> nombre= new <Nombre Clase();>

             */

        //Constructores
            /*
            Se utilizan cuando necesitamos crear varios objetos de una misma clase.
            Desde el lado de la clase, se define un método constructor:

            public class Humano {
                // Atributos de la clase
                String name;
                int age;
                double weight;

                // Constructor
                public Humano(String name, int age, double weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                }
            }

            // Desde el main se instancia un objeto usando el constructor

                public static void main(String[] args) {
                  // Instanciación de un objeto de la clase Humano
                    Humano humano = new Humano("Nombre", 25, 65.5);
                }
            * Constructos sobrecargados: se puede tener contructos con el mismo nombre y se diferencian en la cantidad
                                         de parametros que recibe
            */

        //toString
            /*
            Es utilizado para proporcionar una representación de cadena de un objeto. Este método está presente
            en la clase base Object y puede ser sobrescrito en clases personalizadas para ofrecer información legible
            sobre el estado del objeto.

            *Sobre el ejemplo anterior*
            En la clase Humano:

            public String toString() {
                return "Humano{name='" + name + "', age=" + age + ", weight=" + weight + '}';

            En main:

            sout(humano.toString)
             */

        //object passing
        /*
            Se usa cuando queremos enviar un objeto como parametro

            public class Main {

            public static void main(String[] args) {
            *Se instancia el garage*
            Garage garage = new Garage();
            *Se instanca el/los auto/s*
            Car car1 = new Car("BMW");
            Car car2 = new Car("Tesla");

            *Se llama a los metodos para aparcar se le les manda los autos*
            garage.park(car1);
            garage.park(car2);
                }
            }

            *Se crea la clase Garage con el metodo para aparcar este recibe el auto de la clase Car
            mas un nombre que nosotros queramos*

            public class Garage {
            void park(Car car) {
            System.out.println("The "+car.name+" is parked in the garage");
                }
            }

            *Se crea la clase Car la cual tiene su nombre*

            public class Car {
            String name;

            Car(String name){
                this.name = name;
	    }
         */
        //Static
            /*
            Se utiliza para declarar miembros de una clase que pertenecen a la clase en lugar de pertenecer a
                instancias individuales de esa clase
            Se comparte entre todas las intancias de una clase
            Se puede acceder a una variable estatica sin necesidad de una instancia
            Se usa para contar la cantidad total de instancias de una clase o para almacenar información que es
                compartida por todas las instancias.
             */

        //Herencia
            /*
            En un proceso en el cual una clase adquiere los atributos y metodos y otros

            <Modificar de Acceso> class Nombre EXTEND <Nombre de la clase de la cual se quiere heredar>{}
            un beneficio es que las clases que heredan pueden tener sus propios metodos/atributos aparte de los heredados
             */
        //Overriding
            /*
            Se usa cuando queremos que una subclase tenga un mismo metodo que la clase padre pero tenga sus cambios
            que solo aplican a la subclase. Se le agrega @Overriding como buena práctica
             */
        //Super
            /*
             Se utiliza para referenciar y llamar a miembros de la clase padre en el contexto de la herencia

                public class Main {
                    public static void main(String[] args) {

		                // super = 	keyword refers to the superclass (parent) of an object
		                //			very similar to the "this" keyword
		            *Se instancian los heroes*
		                Hero hero1 = new Hero("Batman",42,"$$$");
		                Hero hero2 = new Hero("Superman",43,"everything");

		            System.out.println(hero2.toString());

	                }
                }
                public class Person {
                *Atributos de la clase persona*
                    String name;
	                int age;

	            Person(String name,int age){
	                *Constructo*
		            this.name = name;
                    this.age = age;
                }

	            public String toString() {
	                *metodo toString*
		            return this.name + "\n" + this.age + "\n";
	               }
               }
                public class Hero extends Person{

                    String power;

                    Hero(String name,int age,String power){
                    *con la clase super se heredean los atributos de la clase persona*
                        super(name,age);
                        this.power = power;
                    }
                    public String toString() {
                        return super.toString()+this.power;
                    }
             */
        //Abstract
            /*
            Las clases/metodos abstract no puede ser instanciada pero si puede tener subclases
            Metodos abstractos son declarados sin una implementacion
             */
        //Encapsualamiento
            /*
            Se usa para obtener y cambiar el valor de atributos privados se hace un getter y un sette para cada atributo

            private String make

            public String getMake(){
            return make
            }
            public void setMake(String make){
                this.make=make
                *Al hacer esto se puede mofidicar el constructor
                con this.setMake(); (los parametros se debe inicializar de igual manera)*
            }
             */
        //copy
                /*
                Para copiar un bojeto se puede hacer de la siguiente manera
                public void copy(Nombre objeto nombre que le damos){
                    this.set<atributos>(<Nobmre del objeto>.get<Atributo>());

                Main:
                <Nombre de mi objeto>.copy(objeto a copiar);
                }
                */

        //Interface
            /*
                Una plantilla que se aplica a una clase, similar a herencia pero especifica que una class debe hacer
                se puede tener mas de un interface

                Como herencia usa extend interface usar implements
            */
        //Polimorfismo
            /*
            Se usa cuando un objeto se identifica como mas de un tipo

                public class Main {

                    public static void main(String[] args) {

                        // polymorphism = 	greek word for poly-"many", morph-"form"
                        //					The ability of an object to identify as more than one type

                        Car car = new Car();
                        Bicycle bicycle = new Bicycle();
                        Boat boat = new Boat();
                        *Como todos los vehiculos tiene en comun que son vehicles entonces se puede agrupar usando
                        Vehicle*
                        Vehicle[] racers = {car,bicycle,boat};
                        *Array de vehiculos para que impriman el metodo go*
                        *Debe haber un go para todos las subclases y vehicle*
                        for(Vehicle x : racers) {
                            x.go();
                        }
                    }
                }
                public class Vehicle {
                    public void go() {
                        //

                    }
                }
                public class Car extends Vehicle{

                    @Override
                    public void go() {
                        System.out.println("*The car begins moving*");
                    }
                }
                public class Bicycle extends Vehicle{

                    @Override
                    public void go() {
                        System.out.println("*The bicycle begins moving*");
                    }
                }
                public class Boat extends Vehicle{

                    @Override
                    public void go() {
                        System.out.println("*The boat begins moving*");
                    }
                }

             */
        //Polimorfismo dinámico
            /*
            Polimorfismo pero despues de la etapa de compilado


            import java.util.Scanner;
            public class Main {

             public static void main(String[] args) {

              //Dynamic Polymorphism

              Scanner scanner = new Scanner(System.in);
              *Se declara un objeto pero no estamos seguros cual, lo veremos despues*
              Animal animal;

              System.out.println("What animal do you want?");
              System.out.print("(1=dog) or (2=cat): ");
              int choice = scanner.nextInt();
                *Despues de elegir una opcion se instancia y llama al metodo*
              if(choice==1) {
               animal = new Dog();
               animal.speak();
              }
              else if(choice==2) {
               animal = new Cat();
               animal.speak();
              }
              else {
               animal = new Animal();
               System.out.println("That choice was invalid");
               animal.speak();
              }
             }
            }

            public class Animal {

             public void speak() {
              System.out.println("animal goes *brrrr*");
             }
            }

            public class Dog extends Animal{

             @Override
             public void speak() {
              System.out.println("dog goes *bark*");
             }
            }

            public class Cat extends Animal{

             @Override
             public void speak() {
              System.out.println("cat goes *meow*");
             }
            }
             */
        //Exceptions
            /*
            Eventos que ocurren en un programa que detienen el programa

            try{
            }catch(<Tipo de excepción> <nombre de la excepción>){
                sout("Posible mensaje")
            }

            - ArithmeticException: operacion aritmetica ilegar
            - NullPointerException: se quiere acceder a un valor null
            - ArrayIndexOutOfBoundsException: índice fuera del rango válido en un arreglo
            - FileNotFoundException: se intenta abrir o acceder a un archivo que no existe
            - IOException: para manejar errores de entrada/salida, como problemas al leer o escribir archivos.
            - NumberFormatException: se intenta convertir una cadena a un número, pero la cadena no tiene el formato
                    correcto.
            - RuntimeException: se utiliza cuando se quiere capturar cualquier excepción no revisada.

            se puede agregar un finally para agregar un mensaje que siempre se ejecutara sin importar que pase
              */
    }
}
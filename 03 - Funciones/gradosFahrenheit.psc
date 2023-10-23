//Desarrolla un programa que convierta la temperatura ingresada por el usuario en grados Celsius a grados Fahrenheit. 
//La fórmula para la conversión es: Fahrenheit = (Celsius * 9/5) + 32.
Algoritmo gradosFahrenheit
	Definir temp Como Real;
	Imprimir "Ingrese un temperatura para pasarla a Fahrenheit";
	Leer temp;
	pasaje(temp);
FinAlgoritmo
Funcion pasaje(celsius)
	Imprimir "La temperatura ", celsius, " en Fahrenheit es " (celsius * 9/5) + 32.;
FinFuncion
	
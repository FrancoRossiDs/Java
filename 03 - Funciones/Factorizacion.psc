//Crea un algoritmo que solicite al usuario ingresar un n�mero entero no negativo y calcule su factorial. 
//El factorial de un n�mero es el producto de todos los enteros positivos desde 1 hasta ese n�mero.
Algoritmo Factorizacion
	Definir num como real;
	Imprimir "Ingrese un numero para saber su factorial";
	Leer num;
	Mientras num<1 Hacer
		Imprimir "El numero ingresado deber ser entero positivo";
		Leer num;
	FinMientras
	factorial(num);
FinAlgoritmo
Funcion factorial(valor_)
	Definir f,i Como Real;
	f=1;
	Para i=1 Hasta valor_ Hacer
		f=f*i;
		Imprimir f;
	FinPara
FinFuncion
	
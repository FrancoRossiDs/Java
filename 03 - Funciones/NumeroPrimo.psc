//Escribe un programa que pida al usuario ingresar un número entero positivo y 
//determine si el número es primo o no. Un número primo es aquel que solo es divisible por 1 y por sí mismo.
Algoritmo NumeroPrimo
	Definir num Como Real;
	Imprimir "Ingrese un numero para saber si es primo o no";
	Leer num;
	primo(num);
FinAlgoritmo
Funcion primo(prim)
	Definir i, c Como Real;
	c=0;
	Para i=1 Hasta prim Hacer
		Si prim mod i == 0 Entonces
			c=c+1;
		FinSi
	FinPara
	Si c==2 Entonces
		Imprimir "El numero es primo";
	SiNo
		Imprimir "El numero no es primo";
	FinSi
FinFuncion
	
//Escribe un programa que verifique si una palabra ingresada por el usuario es un palíndromo, 
//es decir, si se lee igual de izquierda a derecha y de derecha a izquierda 
//(ignorando espacios y mayúsculas/minúsculas). Por ejemplo, "reconocer" es un palíndromo.
Algoritmo palindromo
	Definir palabra Como Caracter;
	Definir long,c,longi,i,longi2 Como Real;
	Imprimir "Ingrese una palabra para saber si es palindromo o no";
	Leer palabra;
	c=0;
	longi=Longitud(palabra);
	longi2=longi-1;
	Si Longitud(palabra) mod 2 == 0 Entonces
		long=Longitud(palabra)/2;
	SiNo
		long=(Longitud(palabra)-1)/2;
	FinSi
	para i=0 Hasta long-1 Hacer
		Si Subcadena(palabra,i,i) == Subcadena(palabra,longi2,longi2) Entonces
			c=c+1;
		FinSi
		longi2=longi2-1;
	FinPara
	Si c==long Entonces
		Imprimir "Es palindromo";
	SiNo
		Imprimir "No es palindromo";
	FinSi
FinAlgoritmo

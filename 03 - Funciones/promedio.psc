//Desarrolla una calculadora que permita al usuario ingresar una serie de números y 
//luego calcule y muestre la suma y el promedio de esos números.
Algoritmo promedio
	Definir n,pro,sumar Como Real;
	Imprimir "Cuantos números quiere ingresar";
	leer n;
	promedio_(n,pro,sumar);
	Imprimir "suma antes de promediar " sumar;
	Imprimir "promedio de los numeros " pro;
FinAlgoritmo
Funcion promedio_(n Por Valor, pro Por Referencia, sumar Por Referencia)
	Definir s,num,i Como real;
	s=0;
	para i = 0 Hasta  n-1 Hacer
		Imprimir "Ingrese el " i+1 "° valor";
		Leer num;
		s=s+num;
	FinPara
	sumar=s;
	pro=s/n;
FinFuncion
	
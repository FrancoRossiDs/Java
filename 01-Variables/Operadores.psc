//pequeña calculadora
Proceso java
	Definir num1,num2,e,r Como Entero;
	Imprimir "Que tipo de cuenta quiere hacer 1(suma),2(resta),3(multiplicacion),4(división)";
	leer e;
	Imprimir "ingrese los dos numeros";
	Leer num1,num2;
	Si e==3 Entonces
		Si num1==0 o num2==0 Entonces
			Imprimir "Resultado de ", num1 " X " num2 " = 0";
		SiNo
			Imprimir "Resultado de ", num1 " X " num2 " = " num1*num2;
		FinSi
		SiNo
			si e==4 Entonces
				Si num2==0 Entonces
					Imprimir "No se puede dividir entre 0";
				SiNo
					Imprimir "Resultado de ", num1 " / " num2 " = " num1/num2;
				FinSi
			SiNo
				Si e==1 Entonces
					Imprimir "Resultado de ", num1 " + " num2 " = " num1+num2;
				SiNo
					Imprimir "Resultado de ", num1 " - " num2 " = " num1-num2;
				FinSi
			FinSi
		FinSi
FinProceso

Algoritmo colectivo
	Definir h,m Como Entero;
	Para h = 0 Hasta 23 Hacer
		Para m = 0 Hasta 59 Hacer
			Si h<10 Entonces
				Si m <10 Entonces
					Imprimir "0",h ":0", m;
				SiNo
					Imprimir "0",h ":", m;
				FinSi
			SiNo
				Si m<10 Entonces
					Imprimir h ":0", m;
				SiNo
					Imprimir h ":", m;
				FinSi
			FinSi
			Si h>=6 y h<21 Entonces
				Si (m+5) mod 15 ==0 Entonces
					Imprimir "El micro pasará en 5 minutos";
				FinSi
				Si m mod 15==0 Entonces
					Imprimir "La pasó el micro";
				FinSi
			FinSi
		FinPara
	FinPara
FinAlgoritmo

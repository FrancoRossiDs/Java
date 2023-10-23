//Crea un programa en PSeInt que solicite al usuario ingresar el precio de un artículo y un porcentaje de descuento. 
//Luego, calcula y muestra el precio final después de aplicar el descuento.
Algoritmo calculadoraDescuentos
	Definir precio, descuento Como Real;
	Imprimir "Ingrese un precio de producto y el descuento aplicado";
	Leer precio, descuento;
	ganga(precio,descuento);
FinAlgoritmo
Funcion ganga (valor_, rebaja)
	Definir retorno Como Real;
	Imprimir "El valor con descuento del precio ingresado es " valor_-(valor_*(rebaja/100));
FinFuncion

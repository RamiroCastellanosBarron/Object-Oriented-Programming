import java.io.*;

class Main {

}





/*

Recursividad

Tecnica de programacion donde una funcion se llama a ella misma.

Es una forma alternativa de construir un programa sin utilizar ciclos.

Debe utilizarse cuando no exista una solucion iterativa simple.

Funcion recursiva

Las funciones recursivas se componen de:

	Caso base: una solucion simple para un caso particular (puede haber mas de un caso base). Siendo este una condicion para terminar y ya no realizar la recursividad.

Solucion - Factorial

Aqui podemos ver la secuencia que toma el factorial

N! = 
		1				si N = 0 (base)
		N * (N - 1)!	si N > 0 (recursion)	

	Un razonamiento recursivo tiene dos partes: la base y la regla recursiva de construccion. La base no es recursiva y es el punto tanto de partida como de terminacion de la definicion.


Solucion recursiva

	Dado un entero no negativo x, regresar el factorial de x fact:

		Entrada: n entero no negativo,

		Salida: entero.

	public int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return fact(n - 1)*n;
		}
	}

	--> Es importante determinar un caso base, es decir, un punto en el cual existe una condicion por la cual no se requiera volver a llamar a la misma funcion.

Como funciona la recursividad?

	Llamadas recursivas

	Resultados de las llamadas recursivas

Otro ejemplo: Elevar un numero a una potencia

static int potencia(int x, int n) {
	if (n == 0) {		--> Caso base
		return 1;
	} else {			--> Caso general
		return x * potencia(x, n-1);
	}
}

*/
package br.edu.fateczl.Fila;

public class Fila<T> {

	No<T> inicio;
	No<T> fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}

		return false;
	}

	public void insert(T valor) {
		No elemento = new No<>();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) {
			fim = elemento;
			inicio = elemento;
		} else {
			fim.proximo = elemento;
			fim = elemento;
		}
	}

	public T remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}

		T valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		} else {
			inicio = inicio.proximo;
		}

		return valor;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No<T> auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}

		return cont;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia");
		}

		No<T> auxiliar = inicio;

		while (auxiliar != null) {
			System.out.print(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}

	}

}

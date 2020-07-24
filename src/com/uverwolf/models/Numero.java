package com.uverwolf.models;

import java.util.Random;

public class Numero {
	
	private int valor =2;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public int  aleatorio() {
		Random r = new Random();
		int randomInt = r.nextInt(100) + 1;
		return randomInt;
	}
	
}

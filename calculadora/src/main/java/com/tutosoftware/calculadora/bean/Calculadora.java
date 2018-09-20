package com.tutosoftware.calculadora.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Calculadora implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double parametro1;
	private double parametro2;
	private double resultado;
	public double getParametro1() {
		return parametro1;
	}
	public void setParametro1(double parametro1) {
		this.parametro1 = parametro1;
	}
	public double getParametro2() {
		return parametro2;
	}
	public void setParametro2(double parametro2) {
		this.parametro2 = parametro2;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public String suma(){
		resultado = parametro1+parametro2;
		return "";
	}
	
	public String resta(){
		resultado = parametro1-parametro2;
		return "";
	}
	
	public String multiplicacion(){
		resultado = parametro1*parametro2;
		return "";
	}
	public String division(){
		resultado = parametro1/parametro2;
		return "";
	}

}

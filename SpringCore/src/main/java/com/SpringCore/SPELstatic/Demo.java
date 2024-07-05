package com.SpringCore.SPELstatic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Demo {

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int a;
	@Value("#{T(java.lang.Math).PI}")
	private double b;
	@Value("#{T(java.lang.Math).E}")
	private double c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}

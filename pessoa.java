package classes;

public class pessoa {
	// Atributos
	private float peso;
	private float altura;
	
	public pessoa() {
		System.out.println("Executado método construtor");
	}
	
	// Métodos
	public float calcularIMC() {
		float imc = peso/(altura*altura);
		return imc;
	}
	
	public void setPeso(float peso) { 
		this.peso = peso;
	}
	public float getPeso() {
		return peso;
	}
	public void setAltura(float altura) { 
		this.altura = altura;
	}
	public float getAltura() {
		return altura;
	}	

}

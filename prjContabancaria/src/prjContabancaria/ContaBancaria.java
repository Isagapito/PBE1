package prjContabancaria;

public class ContaBancaria { 
	//Atributos 
	private String nomeConta;
	private int numeroConta; 
	private double Saldo; 
	private double Sacar; 
	private double depositar; 
	
	//Construtores 
	public ContaBancaria() { 
		
	}
	public ContaBancaria(String nomeConta, int numeroConta, double saldo) {
		this.nomeConta = nomeConta ;
		this.numeroConta = numeroConta ;
		this.Saldo = Saldo;		
	} 
	//Getters Setters
		public String getnomeConta() {
			return nomeConta;
		} 
		
		public void setnomeConta(String nomeConta) {
			this.nomeConta = nomeConta;
		}
		public int getnumeroConta() {
			return numeroConta;
		}
		public void setSaldo(double Saldo) {
			this.Saldo = Saldo;
		} 
		public double getSaldo() { 
			return Saldo;
		} 
		


}

package funcionario;

public class funcionario {
	//Atributos	
			private int salarioBruto ;
			private String nome ; 
			private double imposto ; 
			 //Construtores 
			public funcionario () {
				
			}
	     public funcionario(int salarioBruto, String nome, double imposto) {
	     this.salarioBruto = salarioBruto;
	     this.nome = nome;
	     this.imposto = imposto; 
	     }
	     
	      public funcionario (int salarioBruto, String nome ) {
	    	  this.salarioBruto = salarioBruto;
	    	  this.nome = nome ;
	      }
	     public funcionario (String nome, int salarioBruto) {
	    	 this.salarioBruto = salarioBruto;
	    	 this.nome = nome ;
	    	 this.imposto = 0 ;
	     }
		public int getSalarioBruto() {
			return salarioBruto;
		}
		public void setSalarioBruto(int salarioBruto) {
			this.salarioBruto = salarioBruto;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getImposto() {
			return imposto;
		}
		public void setImposto(double imposto) {
			this.imposto = imposto;
		}
			
			
}

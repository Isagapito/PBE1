package prjZoo;

public class ClasseAnimal {
	//Atributos
		private String atributoNome;
		private String atributoRaca;
		private String atributoSexo;
		private double atributoPeso;
		
		//Construtores
		public ClasseAnimal() {
			 	
		}
		
		public ClasseAnimal(String parametroNome, String parametroRaca, String parametroSexo, double parametroPeso) {
			this.atributoNome = parametroNome;
			this.atributoRaca = parametroRaca;
			this.atributoSexo = parametroSexo;
			this.atributoPeso = parametroPeso;
		
		} 
		//Metodos Setters
		public String getAtributoNome() {
			return atributoNome;
		}

		public void setAtributoNome(String parametroNome) {
			this.atributoNome = parametroNome;
		}

		public String getAtributoRaca() {
			return atributoRaca;
		}

		public void setAtributoRaca(String parametroRaca) {
			this.atributoRaca = parametroRaca;
		}

		public String getAtributoSexo() {
			return atributoSexo;
		}

		public void setAtributoSexo(String parametroSexo) {
			this.atributoSexo = parametroSexo;
		}

		public double getAtributoPeso() {
			return atributoPeso;
		}

		public void setAtributoPeso(double parametroPeso) {
			this.atributoPeso = parametroPeso;
		}
		
		//Metodos
		public void metodoComer() { 
			if (this.atributoPeso >= 170) {
				System.out.println(this.atributoNome + "está obeso, vamos exercitar");
			} 
			else {
				this.atributoPeso += 10;
				
			}
				
		} 
		public void metodoComer(int parametroRacao) { 
			if (this.atributoPeso >= 170) {
				System.out.println(this.atributoNome + "está obeso, vamos exercitar");
			} 
			else {
				this.atributoPeso += parametroRacao;
				
			}
				
		}
		public void metodoExercitar () {
			if(this.atributoPeso <= 50) {
				System.out.println(this.atributoNome + " , que tal se alimentar?");
			}
			else {
				this.atributoPeso -= 10;	
			} 
		} 
		public void exibirInfo() {
			System.out.println("Nome: " + this.atributoNome);
			System.out.println("Peso: " + this.atributoPeso);
		} 
		
		public void metodoEmitirSom() {
			System.out.println("Barulho do bicinho");
		}

		
}

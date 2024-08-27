package prjPokemon;

public class ClassePokemon {
	//Atributos 
	String Nome;
	String Tipo;
	int Nivel;
	int hp ;
	
	//Construtores
		public ClassePokemon() {
			 	
		}
		
		public ClassePokemon(String parametroNome, String parametroTipo, int parametroNivel, int parametrohp) {
			this.Nome = parametroNome;
			this.Tipo = parametroTipo;
			this.Nivel = parametroNivel;
		
		} 
		
		//Metodo 
		public void Atacar() {
			System.out.println(this.Nome + "Atacou");
		} 
		public void Evoluir() {
			System.out.println(this.Nome + "esá evoluindo");
		}
		public void exibirInfo() {
			System.out.println("Nome: " + this.Nome);
			System.out.println("Tipo: " + this.Tipo);
			System.out.println("Nivel: " + this.Nivel);
			System.out.println("hp: " + this.hp);
		}
			
		}
		


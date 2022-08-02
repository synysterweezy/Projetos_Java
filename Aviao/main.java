class Main{
	public static void main(String[] args) {

		Aviao baraoVermelho;

		Motor motorzao;
		//Motor motorDireito; 
		//Motor motorEsquerdo; 



		/*motorDireito = new Motor ("Teste", 0.0f);
		//motorEsquerdo = new Motor ("Teste 2", 0.0f);
		motorDireito.ligar();
		motorDireito.desligar();
		motorEsquerdo.ligar();
		motorEsquerdo.desligar();

		motorDireito.setModelo("DIREIITO");
		motorDireito.setPotencia(50.0);
		motorEsquerdo.setModelo("ESQUERRDOO");
		motorEsquerdo.setPotencia(50.0);*/
		




		motorzao = new Motor (" ", 0.0f);
		baraoVermelho = new Aviao("Fokker DR1", "Freiher");
		baraoVermelho.imprimaOk();

		motorzao.setModelo("ferrari");
		motorzao.setPotencia(50.0f);
		baraoVermelho.ligarMotor();
		baraoVermelho.imprimeEstadoMotor();
		baraoVermelho.desligarMotor();
		baraoVermelho.imprimeEstadoMotor();

	    baraoVermelho.setModelo("14 bis");
		baraoVermelho.setIdentificador("Santos Dumont");
		baraoVermelho.setMotor(true);
		baraoVermelho.setAltura(0.0f);

		System.out.println("Modelo: "+baraoVermelho.getModelo()+ 
			"\nId: "+baraoVermelho.getIdentificador()+
			"\nStatus Motor: "+baraoVermelho.getMotor()+
			"\nAltura: "+baraoVermelho.getAltura());
		
	}
} 

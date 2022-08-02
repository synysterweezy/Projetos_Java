class Motor {
	private String modelo;
	private Float potencia;
	private boolean ativo;

	Motor(String novoM) {
		this.setModelo(novoM);
		this.setPotencia(0.0f);
		this.setAtivo(false);
	}



	public String getModelo(){
		return this.modelo();
    }

    public void setModelo(String novoValor){
    	this.modelo = novoValor;
    }

    public Float getPotencia(){
    	return this.potencia();
    
    }
	public boolean getAtivo(){
		return this.ativo();
	}

	public void ligar(){
		this.setAtivo(true);
		System.out.println("...VRUUUM");
	}

	public void desligar(){
		this.setAtivo(false);
		System.out.println("mmmmm....");
	}

	}








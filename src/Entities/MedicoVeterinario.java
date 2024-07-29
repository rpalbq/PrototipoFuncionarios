package Entities;

public class MedicoVeterinario extends Funcionario {
	private String registroCRMV;

	public MedicoVeterinario(Integer id, String nome, String cpf, Integer idade, Double salario,
			String registroCRMV) {
		super(id, nome, cpf, idade, salario);
		this.registroCRMV = registroCRMV;
    }

	public String getRegistroCRMV() {
		return registroCRMV;
	}

	public void setRegistroCRMV(String registroCRMV) {
		this.registroCRMV = registroCRMV;
	}

	 @Override
	    public String toString() {
	        return super.toString() + ", registro='" + registroCRMV + '\'';
	    }
	
}

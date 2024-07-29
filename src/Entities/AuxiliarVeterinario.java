package Entities;

public class AuxiliarVeterinario extends Funcionario {
	
	//declaro como classe medicoveterinario ou declaro como int mesmo?
    private Funcionario medicoVeterinario;

    public AuxiliarVeterinario(Integer id, String nome, String cpf, Integer idade, Double salario, Funcionario medicoVeterinario) {
        super(id, nome, cpf, idade, salario);
        this.medicoVeterinario = medicoVeterinario;
    }
    
    public Funcionario getMedicoVeterinario() {
        return medicoVeterinario;
    }
    
    public void setMedicoVeterinario(Funcionario medicoVeterinario) {
        this.medicoVeterinario = medicoVeterinario;
    }

    @Override
    public String toString() {
        return super.toString() + ", medicoVeterinarioId=" +medicoVeterinario.getId() + ", medicoVeterinarioNome=" + medicoVeterinario.getNome();
    }
}

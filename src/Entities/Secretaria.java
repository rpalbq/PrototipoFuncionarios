package Entities;

public class Secretaria extends Funcionario {
	
    // Construtor
    public Secretaria(Integer id, String nome, String cpf, Integer idade, Double salario) {
        super(id, nome, cpf, idade, salario);
    }


    // toString
    @Override
    public String toString() {
        return super.toString(); // Sem atributos adicionais
    }
}


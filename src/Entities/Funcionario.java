package Entities;
public abstract class Funcionario {

	// atributos
	private Integer id;
	private String nome;
	private String cpf;
	private Integer idade;
	private Double salario;

	// construtor
	public Funcionario(Integer id, String nome, String cpf, Integer idade, Double salario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
     	this.idade = idade;
		this.salario = salario;
	}

	// getters e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// exibir infos do funcionario
	@Override
	public String toString() {
		return "Funcionario{" + "id='" + id + '\'' + ", nome='" + nome + '\'' + ", salario=" + salario + ", cpf='" + cpf
				+ '\'' + '}';
	}

}

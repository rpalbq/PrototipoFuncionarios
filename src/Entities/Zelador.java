package Entities;

public class Zelador extends Funcionario {
    private String areaResponsabilidade; // Área de responsabilidade do zelador

    // Construtor
    public Zelador(Integer id, String nome, String cpf, Integer idade, Double salario, String areaResponsabilidade) {
        super(id, nome, cpf, idade, salario);
        this.areaResponsabilidade = areaResponsabilidade;
    }

    // Getter
    public String getAreaResponsabilidade() {
        return areaResponsabilidade;
    }

    // Setter
    public void setAreaResponsabilidade(String areaResponsabilidade) {
        this.areaResponsabilidade = areaResponsabilidade;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", areaResponsabilidade='" + areaResponsabilidade + "'";
    }
}

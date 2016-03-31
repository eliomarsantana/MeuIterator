package meuiterator;

/**
 *
 * @author Eliomar Santana
 */
public class Aluno {
    public Aluno(String nome, char sexo, Integer idade, Integer anoIngresso) {
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
        setAnoIngresso(anoIngresso);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(Integer anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
    private String nome;
    private char sexo;
    private Integer idade;
    private Integer anoIngresso;
}

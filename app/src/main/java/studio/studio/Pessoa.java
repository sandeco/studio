package studio.studio;

import java.io.Serializable;

/**
 * Created by sanderson on 16/04/2015.
 */
public class Pessoa implements Serializable{

    private String nome;
    private int idade;


    public Pessoa(){}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

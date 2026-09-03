package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// transforma uma classe em entidade do banco de dados
@Entity
@Table(name = "tb.cadastro")
public class NinjaModel {

    //atributo abaixo vai ser o ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}

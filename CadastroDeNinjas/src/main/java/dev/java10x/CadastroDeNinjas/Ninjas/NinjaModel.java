package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// transforma uma classe em entidade do banco de dados
@Entity
@Table(name = "tb.cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    //atributo abaixo vai ser o ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne: um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira (foreign key)
    private MissoesModel missoes;

    }
package br.com.estudante.produtoapi.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "produto")
public class Produto {
    // region Atributos

    @Id
    @Column(name = "id",unique = true)
    private String id;
    @Column(name="nome")
    private String nome;
    @Column(name="descricao")
    private String descricao;
    @Column(name="preco")
    private double preco;
    // endregion

    //region
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    //endregion

    //region ToString
    @Override
    public String toString() {
        return "🛍️ Produto {" +
                "🆔 id='" + id + '\'' +
                ", 🏷️ nome='" + nome + '\'' +
                ", 📝 descricao='" + descricao + '\'' +
                ", 💰 preco=" + preco +
                '}';
    }
    //endregion

}

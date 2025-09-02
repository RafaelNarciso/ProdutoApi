package br.com.estudante.produtoapi.repository;

import br.com.estudante.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);//metodo para buscar produtos pelo nome

}

package br.com.estudante.produtoapi.controller;

import br.com.estudante.produtoapi.model.Produto;
import br.com.estudante.produtoapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {

        System.out.println("Produto recebido: " + produto); //ira imprimir o produto no console
        var id = UUID.randomUUID().toString();//criar um rest para salvar o produto com id unico
        produto.setId(id); //setar o id no produto

        produtoRepository.save(produto); //salvar o produto no banco de dados
        return produto; //retornar o produto salvo com o id
    }

    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id){
        //Optional<Produto> produto = produtoRepository.findById(id);
        //return produto.isPresent() ? produto.get() : null;
        return produtoRepository.findById(id).orElse(null);
    }
    @GetMapping
    public List<Produto> obterTodos(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }

    @DeleteMapping("{id}")
    public void delete (@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }
    @PutMapping("{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }







}

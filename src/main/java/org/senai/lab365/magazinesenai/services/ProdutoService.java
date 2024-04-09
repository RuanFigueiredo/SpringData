package org.senai.lab365.magazinesenai.services;


import org.senai.lab365.magazinesenai.models.Produto;
import org.senai.lab365.magazinesenai.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private ProdutoRepository repository;

    //recebendo o produtoRepository pronto sem precisar instancia-lo.
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    //invocando o save do repository
    public void salvar(Produto produto){
        repository.save(produto);
    }

    public void excluir(Produto produto){
        repository.delete(produto);
    }

    public List<Produto> buscaTodos(){
        return (List<Produto>) repository.findAll();
    }

    public Produto buscaPorId(Long id){
        return repository.findById(id).get();
    }
}

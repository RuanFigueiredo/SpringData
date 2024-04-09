package org.senai.lab365.magazinesenai.services;


import org.senai.lab365.magazinesenai.models.Produto;
import org.senai.lab365.magazinesenai.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

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
}

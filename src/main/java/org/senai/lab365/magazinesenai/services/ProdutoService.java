package org.senai.lab365.magazinesenai.services;


import org.senai.lab365.magazinesenai.models.Produto;
import org.senai.lab365.magazinesenai.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }
}

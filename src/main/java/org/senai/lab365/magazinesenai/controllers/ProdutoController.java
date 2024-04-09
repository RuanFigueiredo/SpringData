package org.senai.lab365.magazinesenai.controllers;

import org.senai.lab365.magazinesenai.models.Produto;
import org.senai.lab365.magazinesenai.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    //injetar a dependencia do service

    @Autowired
    ProdutoService service;

    @PostMapping
    public void cadastrar (@RequestBody Produto produto){
        service.salvar(produto);
    }
}

package org.senai.lab365.magazinesenai.controllers;

import org.senai.lab365.magazinesenai.models.Produto;
import org.senai.lab365.magazinesenai.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping
    public void atualizar(@RequestBody Produto produto){
        service.salvar(produto);
    }

    @DeleteMapping
    public void excluir(@RequestBody Produto produto){
        service.excluir(produto);
    }

    @GetMapping("/lista")
    public List<Produto> listaTodos(){
        return service.buscaTodos();
    }

    @GetMapping("{id}")
    public Produto buscaPorId(@PathVariable Long id){
        service.buscaPorId(id);
    }
}

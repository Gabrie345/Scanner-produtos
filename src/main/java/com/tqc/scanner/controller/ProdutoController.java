package com.tqc.scanner.controller;

import com.tqc.scanner.exception.ProdutoNotFoundException;
import com.tqc.scanner.service.ProdutoService;
import com.tqc.scanner.service.viewModel.ProdutoViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/produtos")
public class  ProdutoController{

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("{codigo}")
    public ProdutoViewModel consultaPrdutoPorCodigo(@PathVariable String codigo) {
        try {
            return produtoService.consultaItemPorCodigoGTIN(codigo);
        } catch (ProdutoNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }

    }
}

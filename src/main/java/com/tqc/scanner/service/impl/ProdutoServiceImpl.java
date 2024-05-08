package com.tqc.scanner.service.impl;

import com.tqc.scanner.exception.ProdutoNotFoundException;
import com.tqc.scanner.service.ProdutoService;
import com.tqc.scanner.service.entity.ProdutoEntity;
import com.tqc.scanner.service.repository.ProdutoRepository;
import com.tqc.scanner.service.viewModel.ProdutoViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Override
    public ProdutoViewModel consultaItemPorCodigoGTIN(String codigo) throws ProdutoNotFoundException{
        ProdutoEntity produto = produtoRepository.findBycodigGTIN(codigo)
                .orElseThrow(()-> new ProdutoNotFoundException("Produto não encontrado"));
        return new ProdutoViewModel(produto);
    }
}

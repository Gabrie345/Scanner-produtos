package com.tqc.scanner.service;

import com.tqc.scanner.service.viewModel.ProdutoViewModel;

public interface  ProdutoService {
    ProdutoViewModel consultaItemPorCodigoGTIN(String codigo);

}

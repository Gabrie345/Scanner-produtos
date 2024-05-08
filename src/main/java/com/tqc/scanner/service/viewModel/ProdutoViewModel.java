package com.tqc.scanner.service.viewModel;

import com.tqc.scanner.service.entity.ProdutoEntity;

import java.io.Serializable;

public class ProdutoViewModel implements Serializable {

    private String codigGTIN;
    private String descricao;
    private String tipoLixo;
    private String tipoMaterial;
    private String LinkImagem;

    public ProdutoViewModel(ProdutoEntity produto) {
        this.codigGTIN = produto.getCodigGTIN();
        this.descricao = produto.getDescricao();
        this.tipoLixo = produto.getTipoLixo();
        this.tipoMaterial = produto.getTipoMaterial();
        this.LinkImagem = "https://cdn-cosmos.bluesoft.com.br/products/" + produto.getCodigGTIN();
    }

    public String getCodigGTIN() {
        return codigGTIN;
    }

    public void setCodigGTIN(String codigGTIN) {
        this.codigGTIN = codigGTIN;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoLixo() {
        return tipoLixo;
    }

    public void setTipoLixo(String tipoLixo) {
        this.tipoLixo = tipoLixo;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getLinkImagem() {
        return LinkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        LinkImagem = linkImagem;
    }
}

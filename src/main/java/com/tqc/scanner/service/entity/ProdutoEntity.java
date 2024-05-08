package com.tqc.scanner.service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "codigGTIN")
    private String codigGTIN;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tipoLixo")
    private String tipoLixo;
    @Column(name = "tipoMaterial")
    private String tipoMaterial;
    public ProdutoEntity(Long id, String codigGTIN, String descricao, String tipoLixo, String tipoMaterial) {
        this.id = id;
        this.codigGTIN = codigGTIN;
        this.descricao = descricao;
        this.tipoLixo = tipoLixo;
        this.tipoMaterial = tipoMaterial;
    }
    public ProdutoEntity() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

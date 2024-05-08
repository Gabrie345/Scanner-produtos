package com.tqc.scanner.service.repository;

import com.tqc.scanner.service.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    Optional<ProdutoEntity> findBycodigGTIN(String codigo);

}

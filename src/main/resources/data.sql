CREATE TABLE PRODUTO (
                         ID INT PRIMARY KEY,
                         CODIGGTIN VARCHAR(255),
                         DESCRICAO VARCHAR(255),
                         TIPO_LIXO VARCHAR(255),
                         TIPO_MATERIAL VARCHAR(255)
);
INSERT INTO PRODUTO (ID, CODIGGTIN, DESCRICAO, TIPO_LIXO, TIPO_MATERIAL) VALUES
                                                                             (1, '7890123456789', 'Produto A', 'Plástico', 'PET'),
                                                                             (2, '7891234567890', 'Produto B', 'Papel', 'Papel'),
                                                                             (3, '7892345678901', 'Produto C', 'Metal', 'Alumínio'),
                                                                             (4, '7893456789012', 'Produto D', 'Plástico', 'PET');


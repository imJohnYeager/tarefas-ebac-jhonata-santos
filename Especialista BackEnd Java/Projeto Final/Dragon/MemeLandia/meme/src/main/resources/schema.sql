CREATE TABLE meme (
  id BIGINT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   descricao VARCHAR(255) NOT NULL,
   data_cadastro date NOT NULL,
   categoria_meme_id BIGINT,
   usuario_id BIGINT,
   CONSTRAINT pk_meme PRIMARY KEY (id)
);

ALTER TABLE meme ADD CONSTRAINT FK_MEME_ON_CATEGORIA_MEME FOREIGN KEY (categoria_meme_id) REFERENCES categoria_meme (id);

ALTER TABLE meme ADD CONSTRAINT FK_MEME_ON_USUARIO FOREIGN KEY (usuario_id) REFERENCES usuario (id);
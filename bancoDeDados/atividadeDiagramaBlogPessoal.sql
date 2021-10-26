create database db_blog_pessoal;
use db_blog_pessoal;

CREATE TABLE tb_temas(
id_tema bigint not null auto_increment,
descricao VARCHAR (255),
PRIMARY KEY (id_tema)
);

CREATE TABLE tb_usuarios(
id_usuario bigint not null auto_increment,
nome VARCHAR (255),
usuario VARCHAR (255),
senha VARCHAR (255),
primary key (id_usuario)
);

create table postagens(
id_postagem BIGINT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(255),
texto VARCHAR (1000),
data_postagem timestamp,
fk_tema bigint ,
fk_usuario bigint,
primary key(id_postagem),
foreign key (fk_tema) references tb_temas(id_tema),
foreign key (fk_usuario) references tb_usuarios(id_usuario)
);


CREATE TABLE tb_Funcionario(
    id text primary key unique not null,
    nome text,
    email text,
    telefone text,
    competencia_tecnica text,
    certicicao text,
    tempo_experiencia int,
    linkedin text
);
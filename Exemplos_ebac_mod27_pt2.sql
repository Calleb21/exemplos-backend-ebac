 select * from tb_pessoa1

insert into tb_pessoa1 (id, nome, idade, sexo)
values (2, 'Rayane Lopes', 18, 'F');

update tb_pessoa1 set nome = 'Rayane Lopes' where id = 2;
update tb_pessoa1 set nome = 'Calleb Camargo', idade = 19 where id = 1;

delete from tb_pessoa1 where id = 2;

ALTER TABLE tb_pessoa1
ADD CONSTRAINT check_idade
CHECK (
	idade > 0
	and idade < 100
);

insert into tb_pessoa1 (id, nome, idade, sexo)
values (3,'Joana',32,'F');
insert into tb_pessoa1 (id, nome, idade, sexo)
values (4,'João',43,'M');
insert into tb_pessoa1 (id, nome, idade, sexo)
values (5,'Junior',13,'M');

select * from tb_pessoa

create table tb_pessoa (
	id bigint not null,
	nome varchar(50) not null,
	idade integer constraint check_idade CHECK (idade > 0 and idade < 120),
	SEXO VARCHAR(1) not null
);

insert into tb_pessoa (id, nome, idade, sexo)
values (3,'Joana',32,'F');
insert into tb_pessoa (id, nome, idade, sexo)
values (13,'Joana',32,'F');
insert into tb_pessoa (id, nome, idade, sexo)
values (4,'João',43,'M');
insert into tb_pessoa (id, nome, idade, sexo)
values (5,'Junior',4,'M');
insert into tb_pessoa (id, nome, idade, sexo)
values (6, 'Rafael', 22, 'M');

select * from tb_pessoa where nome like('Joana');
select * from tb_pessoa where nome like('J%');
select * from tb_pessoa where nome like('%a');
select * from tb_pessoa where nome like('%na%');
select * from tb_pessoa where nome like('_a%');
select * from tb_pessoa where nome not like('J%');
select nome from tb_pessoa;
select upper(nome) from tb_pessoa;
select * from tb_pessoa where idade >= 10 and idade < 30;
select * from tb_pessoa where idade >= 10 or nome like('Joana');

select * from tb_pessoa order by nome;
select * from tb_pessoa order by idade asc;
select * from tb_pessoa order by idade desc;

select distinct(nome) from tb_pessoa;
select * from tb_pessoa where nome in ('Joana', 'Rafael');

select * from tb_pessoa where idade between 10 and 40;
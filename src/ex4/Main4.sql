
create database teste_target_sistemas;
use teste_target_sistemas;

create table tipo_de_telefone(
	id int not null auto_increment,
    descricao varchar(20) not null,
    primary key(id)

);

insert into tipo_de_telefone values (1,'Residencial');
insert into tipo_de_telefone values (2,'Comercial');
insert into tipo_de_telefone values (3,'Celular');


create table estado (

	id int not null auto_increment,
    nome varchar(50) not null,
    primary key (id)


);
insert into estado values (1,'Rio de Janeiro');
insert into estado values (2,'São Paulo');
insert into estado values (3,'Minas Gerais');
insert into estado values (4,'Espírito Santo');
insert into estado values (5,'Rondônia');


create table cliente (
	id int not null auto_increment,
    nome varchar (50),
    sobrenome varchar (200),
   estado_id int not null ,
   foreign key (estado_id) references estado(id),
    primary key(id)



);
create table telefone (
	 
     id int not null auto_increment,
     cliente_id int not null,
     tipo_telefone_id int not null ,
      -- no formato  ** *****-****
     numero varchar(12),
     foreign key (cliente_id) references cliente (id),
     foreign key ( tipo_telefone_id) references tipo_de_telefone(id),
     primary key (id)


);


insert into Cliente values (1,'Ana Souza','Ribeiro dos Santos', 1); 
insert into Cliente  values (2,'Carlos Lima','De Souza Faria', 2);
insert into Cliente  values (3,'Fernanda Oliveira','Pinheiro dos Santos',3); 
insert into Cliente  values (4,'João Silva','Santos Silva',3);
insert into Cliente  values (5,'Maria Santos','De Souza Ivan',3); 


INSERT INTO Telefone  VALUES (1,1, 1, '21 1234-5678'); 
INSERT INTO Telefone  VALUES (2,1, 3, '11 9876-5432'); 
INSERT INTO Telefone  VALUES (3,2, 2, '31 2345-6789'); 
INSERT INTO Telefone  VALUES (4,3, 3, '27 3456-7890');
INSERT INTO Telefone  VALUES (5,4, 1, '69 4567-8901'); 




-- não compreendendo o termo razão social por não ter sido bem explicado, tomei a iniciativa de considerar o nome
select c.id as id,c.nome as nome ,t.numero as numero from Cliente c join Telefone t on c.id=t.cliente_id;
create database robot;
use robot;

create table Endereco (
	ID_Endereco integer not null auto_increment,
    Logradouro varchar(100),
    Bairro varchar(100),
    Cidade varchar(100),
    Numero varchar(100),
    Pais varchar(100),
    UF varchar(100),
    CEP varchar(100) not null,
    constraint PK_Endereco primary key (ID_Endereco)
) Engine = InnoDB;

create table Agencia (
	ID_Agencia integer not null auto_increment,
    RazaoSocial varchar(100),
    Email varchar(100),
    Contato varchar(100),
    CNPJ varchar(100),
    TipoServico varchar(100),
    ID_Endereco integer not null,
    constraint PK_Agencia primary key (ID_Agencia),
    constraint FK_Agencia_Endereco foreign key (ID_Endereco)
		references Endereco (ID_Endereco)
) Engine = InnoDB;

create table Questionario (
	ID_Questionario integer not null auto_increment,
    Perguntas varchar(100),
    Respostas integer,
    constraint PK_Questionario primary key (ID_Questionario)
) Engine = InnoDB;

create table Perfil (
	ID_Perfil integer not null auto_increment,
    TipoPerfil varchar(100),
    ID_Questionario integer not null,
    constraint PK_Perfil primary key (ID_Perfil),
    constraint FK_Perfil_Questionario foreign key (ID_Questionario)
		references Questionario (ID_Questionario)
) Engine = InnoDB;

create table Investimento (
	ID_Investimento integer not null auto_increment,
    TipoInvestimento varchar(100),
    Dicas varchar(100),
    Valores float,
    Opcoes varchar(100),
    Informacoes varchar(100),
    ID_Perfil integer not null,
    ID_Agencia integer not null,
    constraint PK_Investimento primary key (ID_Investimento),
    constraint FK_Investimento_Perfil foreign key (ID_Perfil)
		references Perfil (ID_Perfil),
	constraint FK_Investimento_Agencia foreign key (ID_Agencia)
		references Agencia (ID_Agencia)
) Engine = InnoDB;

create table Usuario (
	ID_Usuario integer not null auto_increment,
    Nome varchar(100),
    CPF varchar(100),
    RG varchar(100),
    DataNascimento date,
    Sexo varchar(100),
    Email varchar(100),
    Login varchar(100) not null,
    Senha varchar(100) not null,
    Saldo float,
    Administrador bool not null,
    ID_Endereco integer not null,
    ID_Perfil integer not null,
    constraint PK_Usuario primary key (ID_Usuario),
    constraint FK_Usuario_Endereco foreign key (ID_Endereco)
		references Endereco (ID_Endereco),
	constraint FK_Usuario_Perfil foreign key (ID_Perfil)
		references Perfil (ID_Perfil)
) Engine = InnoDB;

select * from usuario;
select * from endereco;
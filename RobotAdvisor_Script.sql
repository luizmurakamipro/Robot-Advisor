create database robot;
use robot;

create table Endereco (
	ID_Endereco integer not null auto_increment,
    Logradoura varchar(45) not null,
    Numero varchar(45) not null,
    Pais varchar(45) not null,
    UF varchar(45) not null,
    CEP varchar(45) not null,
    constraint PK_Endereco primary key (ID_Endereco)
) Engine = InnoDB;

create table Agencia (
	ID_Agencia integer not null auto_increment,
    RazaoSocial varchar(45) not null,
    Email varchar(45),
    Contato varchar(45) not null,
    CNPJ varchar(45) not null,
    TipoServico varchar(45) not null,
    ID_Endereco integer not null,
    constraint PK_Agencia primary key (ID_Agencia),
    constraint FK_Agencia_Endereco foreign key (ID_Endereco)
		references Endereco (ID_Endereco)
) Engine = InnoDB;

create table Questionario (
	ID_Questionario integer not null auto_increment,
    Perguntas varchar(45) not null,
    Respostas integer not null,
    constraint PK_Questionario primary key (ID_Questionario)
) Engine = InnoDB;

create table Perfil (
	ID_Perfil integer not null auto_increment,
    TipoPerfil varchar(45),
    ID_Questionario integer not null,
    constraint PK_Perfil primary key (ID_Perfil),
    constraint FK_Perfil_Questionario foreign key (ID_Questionario)
		references Questionario (ID_Questionario)
) Engine = InnoDB;

create table Investimento (
	ID_Investimento integer not null auto_increment,
    TipoInvestimento varchar(45) not null,
    Dicas varchar(45),
    Valores float,
    Opcoes varchar(45),
    Informacoes varchar(45),
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
    Nome varchar(45) not null,
    CPF varchar(45) not null,
    RG varchar(45) not null,
    DataNascimento date not null,
    Sexo varchar(45) not null,
    Email varchar(45),
    ID_Endereco integer not null,
    ID_Perfil integer not null,
    constraint PK_Usuario primary key (ID_Usuario),
    constraint FK_Usuario_Endereco foreign key (ID_Endereco)
		references Endereco (ID_Endereco),
	constraint FK_Usuario_Perfil foreign key (ID_Perfil)
		references Perfil (ID_Perfil)
) Engine = InnoDB;

select * from usuario;
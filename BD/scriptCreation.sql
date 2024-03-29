
drop table orderLine; 
drop table command;
drop table action;
drop table product; 
drop table traduction;
drop table category;
drop table language;
drop table promotion;
drop table user;

create table user (
	username varchar(45) primary key not null,
    lastName varchar(45) not null,
    firstName varchar(45) not null,
    phone int not null,
    mail varchar(45) not null,
    adressPrivate varchar(45) not null,
    adressDelivery varchar(45) not null,
    password varchar(80) not null,
    authorities varchar(45) not null,
    non_expired boolean not null,
    non_locked boolean not null,
    credentials_non_expired boolean not null,
    enabled boolean not null)
    engine = InnoDB;

create table promotion (
	id int primary key not null,
    percentage int not null,
    quantityMin int,
    description varchar(45) not null,
    startDate date not null,
    endDate date not null)
    engine = InnoDB;

create table language (
	id int primary key not null,
    label varchar (45) not null)
    engine = InnoDB;

create table category (
	id int primary key not null)
    engine = InnoDB;

create table traduction (
	label varchar(45) primary key not null,
    language int not null,
    category int not null,
    constraint language_FK foreign key (language) references language (id),
    constraint categoryTrad_FK foreign key (category) references category (id))
    engine = InnoDB;

create table product (
	id int primary key not null,
    name varchar(45) not null,
    scientName varchar(45) not null,
    family varchar(45) not null,
    variety varchar(45),
    catalogPrice double not null,
    description varchar(1000) not null,
    lifespan int not null,
	dateArrival date not null,
    seasonStart date not null,
    seasonEnd date not null,
    photoLink varchar(200) not null,
    quantity int,
    category int not null,
    constraint categoryProduct_FK foreign key (category) references category (id))
    engine = InnoDB;

create table action (
	label varchar(45) primary key not null,
    promotion int not null,
    product int not null,
    constraint promotion_FK foreign key (promotion) references promotion (id),
    constraint productAction_FK foreign key (product) references product (id))
    engine = InnoDB;

create table command (
	id int primary key not null,
    dateCommand date not null,
    user varchar(45) not null,
    constraint user_FK foreign key (user) references user (username))
    engine = InnoDB;

create table orderLine (
	id int primary key not null,
    price int not null,
    lineNumber int not null,
    orderQuantity int not null,
    product int not null,
    command int not null,
    constraint productOrder_FK foreign key (product) references product (id),
    constraint command_FK foreign key (command) references command (id))
    engine = InnoDB;


    
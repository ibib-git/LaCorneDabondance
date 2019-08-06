
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
	login varchar(45) primary key not null,
    lastName varchar(45) not null,
    firstName varchar(45) not null,
    phone int not null,
    mail varchar(45) not null,
    adressPrivate varchar(45) not null,
    adressDelivery varchar(45) not null,
    birthday date not null,
    password varchar(45) not null,
    enabled boolean not null);

create table promotion (
	id int primary key not null,
    percentage int not null,
    quantityMin int,
    description varchar(45) not null,
    startDate date not null,
    endDate date not null);

create table language (
	id int primary key not null,
    label varchar (45) not null);

create table category (
	id int primary key not null);

create table traduction (
	label varchar(45) primary key not null,
    language int not null,
    category int not null,
    constraint language_FK foreign key (language) references language (id),
    constraint categoryTrad_FK foreign key (category) references category (id));

create table product (
	id int primary key not null,
    name varchar(45) not null,
    scientName varchar(45) not null,
    family varchar(45) not null,
    variety varchar(45),
    catalogPrice int not null,
    description varchar(45) not null,
    lifespan int not null,
	dateArrival date not null,
    seasonStart date not null,
    seasonEnd date not null,
    photoLink varchar(45) not null,
    category int not null,
    constraint categoryProduct_FK foreign key (category) references category (id));

create table action (
	label varchar(45) primary key not null,
    promotion int not null,
    product int not null,
    constraint promotion_FK foreign key (promotion) references promotion (id),
    constraint productAction_FK foreign key (product) references product (id));

create table command (
	id int primary key not null,
    dateCommand date not null,
    user varchar(45) not null,
    constraint user_FK foreign key (user) references user (login));

create table orderLine (
	id int primary key not null,
    price int not null,
    lineNumber int not null,
    orderQuantity int not null,
    product int not null,
    command int not null,
    constraint productOrder_FK foreign key (product) references product (id),
    constraint command_FK foreign key (command) references command (id));


    
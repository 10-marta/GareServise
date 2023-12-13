drop table if exists atleta cascade
drop table if exists gara cascade
 drop table if exists utente cascade
 drop sequence if exists atleta_seq
 drop sequence if exists gara_seq
 drop sequence if exists utente_seq
 create sequence atleta_seq start with 1 increment by 50
 create sequence gara_seq start with 1 increment by 50
 create sequence utente_seq start with 1 increment by 50
 create table atleta (id bigint auto_increment not null, categoria varchar(255), cognome varchar(255), nome varchar(255), primary key (id))
 create table gara (id bigint auto_increment not null, nome varchar(255), primary key (id))
 create table utente (id bigint auto_increment not null, cognome varchar(255), email varchar(255), nome varchar(255), password varchar(255), username varchar(255), primary key (id))

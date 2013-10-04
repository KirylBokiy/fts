/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     04.10.2013 13:30:04                          */
/*==============================================================*/


drop table if exists ABSTRACT_USER cascade;

/*==============================================================*/
/* Table: ABSTRACT_USER                                         */
/*==============================================================*/
create table ABSTRACT_USER (
   ID                   NUMERIC(18)          not null,
   NAME                 VARCHAR(255)         not null,
   AUTHNAME             VARCHAR(255)         not null,
   constraint PK_ABSTRACT_USER primary key (ID)
);


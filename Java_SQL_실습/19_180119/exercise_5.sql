create table visitor
(name varchar(18),
writedate date,
memo varchar(180)
);

insert into visitor (writedate) values (sysdate);
insert into visitor (writedate) values ('2016-12-25');
insert into visitor (writedate) values ('1999-08-11');

update visitor
set name ='°ûÁöÈÆ'

update visitor
set name = 'À¯È£Áø', memo = '¾È°æ¾¸'
where writedate = '2016-12-25';

update visitor
set name = 'Á¤´ÙÇı', memo = 'µµ¿ÍÁÜ'
where writedate = '1999-08-11';

update visitor
set memo = 'º»ÀÎ'
where NAME= '°ûÁöÈÆ';

select * from visitor;

create table member
(memId varchar(12),
memPwd varchar(12) not null,
memName varchar(18) not null,
memPic blob,
joindate date,
primary key (memId)
);

create table news
(id number(5),
writer varchar(18),
title varchar(120),
content varchar(900),
writedate date,
cnt number(8),
primary key (id)
);

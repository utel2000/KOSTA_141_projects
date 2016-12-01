--- spring MVC & jdbcTemplate 사용 예제 테이블
create table tboard(
num number(10) primary key,
sub varchar2(50),
writer varchar2(30),
content varchar2(400),
pwd varchar2(10),
mfile varchar2(50),
tdate date);
create sequence tboard_seq
increment by 1
start with 1;
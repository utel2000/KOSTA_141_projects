create table memberdemo(
num number CONSTRAINT memberdemo_num_pk primary key,
id varchar2(20) CONSTRAINT memberdemo_id_nn not null,
pwd varchar2(10),
name varchar2(34),
email varchar2(45),
birth varchar2(12),
tel varchar2(30),
mdate date,
reip varchar2(35),
CONSTRAINT memberdemo_id_uq unique(id)
);

create sequence seq_memberdemo
increment by 1
start with 1;

commit;
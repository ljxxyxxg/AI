create table card(
    cardNumber number(10) not null primary key,
    accountNumber number(12) not null ,
    cardKind varchar2(8),
    orderDate date,
    limitAmount number(15),
    paymentDate date

);

insert into card values(
    1001, 556677, '비자', sysdate, 5000,'2024/01/10'
);
insert into card values(
    1002, 5556677, '비자', sysdate, 5000,'2024/01/10'
);
insert into card values(
    1003, 5556679, 'master', sysdate, 10000,'2024/01/20'
);
insert into card values(
    1004, 5556687, 'check', sysdate, null, null
);

select * from card;

--고객테이블, 구매테이블 구현 - 부모 주, 구매테이블 - 자식 종 구현
create table userTbl(
    userName varchar2(10) not null primary key,
    birthyear date not null,
    addr varchar2(20) not null,
    mobile VARCHAR2(15)
    
);

--drop table userTbl; --테이블 삭제하기
--drop table buyTbl;

create table buyTbl(
    userName varchar2(10) not null primary key,
    prodName varchar2(20) not null,
    price number(10) not null,
    amount number(5) not null,
    constraint userName_fk foreign key (userName) references userTbl( userName)
);

insert into userTbl values ('이승기','87/12/10','서울','010-1111-2233');
insert into userTbl values ('김경호','71/12/10','전남','010-1111-2233');

insert into buyTbl values ('이승기','운동화',1000,1);
insert into buyTbl values ('김경호','노트북',1000,2);
insert into buyTbl values ('홍길동','노트북',1000,2); --userTbl에 없는 다른 사람

--은행부모,master, 주
create table bank (
    bankName varchar2(20) not null primary key,
    jijum varchar2(20) not null);

insert into bank values ('국민', '강동');
insert into bank values ('신한', '강남');
insert into bank values ('우리', '송파');

--예금계좌 테이블 자식, sub, 종
create table deAcc(
    bankName varchar2(20) not null primary key, --부모키와 동일한 자료형과 name을 가져야 한다.
    accKind varchar2(20),
    constraint bankName_fk foreign key (bankName) references bank(bankName)
    -- 형식 constraint 외래키명 foregin key(외래키대상 컬럼명) references 부모테이블명( 외래키대상 컬럼명)
);

insert into deAcc values('우리', '일반계좌');
insert into deAcc values('신한', '대출계좌');
insert into deAcc values('국민', '증권계좌');
--insert into deAcc values('카뱅', '일반계좌');에러발생 부모 테이블 안에 '카뱅'이 없어서 안된다
--무결성

--고객테이블 -부모, 주, master
create table custom(
    cardNumber number(10) not null primary key,
    cName varchar2(20)
);
drop table custom;

--카드테이블 -자식,sub,종
create table cardTbl (
    cardNumber number(10) not null primary key,
    limitPrice number(10),
    CONSTRAINT cardN_fk foreign key(cardNumber) references custom( cardNumber)
    );

insert into custom values( 1234,'홍길동');
insert into custom values( 1235,'이순신');
insert into custom values( 1236,'김명자');

select * from custom;

insert into cardTbl values(1236, 9000)
insert into cardTbl values(1234, 3000);
//insert into custom values( 1234,'홍길동');

2+3
2^3
10%%3
log(10)
log(10, base = 2)
sqrt(4)
max(10,5,9)
factorial(5)
pi= 3.14 #변수선언 방법1
sin(pi/2)

pi <- 3.14 #변수선언 방법2

name <- '홍길동' #

25+99
456-123
2*(3+4)
(3+5*6)/7
(7-3)*3
210+35
1256%%7
184%%5
1976/24
16*25+186*5-67
16*25+186*5-67*22
#
pi <- 3.14
10^2*pi
12^2*pi
15^2*pi
log(sqrt(8), base = 2)
log(sqrt(12), base = 2)
log(sqrt(16), base = 2)

#벡터 1차원 배열 형식 벡터명 <- c(요소1, 요소2...)
x <- c('a','b','c')
x
y <-c(1,2,3)
y
z <- c(TRUE, TRUE, FALSE, FALSE)
z
x <- c(1,3,'a','b')
x #모두 문자형으로 변형
y <- c('a',TRUE)
y # 모두 문자형으로 변형됨
z <- c(1,2,TRUE, FALSE)
z #TRUE가 1로 바뀐다. FALSE 0으로 바뀐다.


# 1~10까지 벡터로 만들기
num <- c(1,2,3,4,5,6,7,8,9,10)
num
# 1~100까지 벡터(연속숫자)
num <- 1:100
num
# 200 ~ 500까지 벡터 만들기
num2 <- 200:500
num2

# 100~300, 400~500 벡터만들기
num3 <- c(100 : 300, 400 : 500)
num3

# 1 3 4 5 9 .. 99까지 벡터만들기 1~100까지 증가치 2인벡터만들기
# 도움말 help(함수명)
help(seq)
seq(from=1, to=100, by=2) #정식적인 형식
seq( 1, 100, 2) #약식

#99, 97 .. -1
seq(from=99, to=1, by= -2)
seq(99, 1, -2)

#rep함수
help(rep)
rep(1:4, 2)
rep(1:4, each=2)
rep(1:4, c(1,2,3,4)) #각각의 요소를 증가
rep(1:4, each=2, length.out = 4) #전체중에 4개만 나타내라

# 100 ~ 200 사이의 짝수로 된 vc.2
vc.2 <- seq( from=100, to=200, by=2)
vc.2

# TRUE가 20개인 vc.3
vc.3 <- rep(TRUE, 20)
vc.3


# 벡터에 이름 지정하기
score <- c(90, 85, 70)
score
names(score) #벡터의 이름 출력하기
#벡터의 이름 넣기
names(score) <- c('김수진','이영미','최진수')


#벡터의 값을 부분적으로 출력
score[1] #인덱스로 검색
score['이영미'] #이름을 
score[3]
score['최진수']
score[4]
score[2:3]
score[c('이영미','최진수')]

v1 <- c(1,5,7,8,9)
v1
v1[2] <- 3
# 1,5번 인덱스값 바꾸기
v1[c(1,5)] <- c(10,20)
v1


x <- 10:15
y <- 20:25
x
y
x+y
x*y


x1 <- 10:14
y1 <- 20:26
x1+y1


d <- 1:10
sum(d)
sum(2*d)
length(d)
mean(d)
min(d)
max(d)
sort(d)
sort(d,decreasing = T)
help(sort)
help(mean)

d <- 1:9
d[ d > 5]
d[ d!= 5]
# 5 ~ 8

# 100 ~ 200 구성된 벡터
d <- 100:200
d

d[10]

d <- rep(190:200, length.out= 10)
d

d <- seq(100,200, by=3)/3
d

d <- 100:200
d <- rep(100:200, ^3)

d <- rep(100:200, length.out = 20)
d.20 <- d
d.20

d.20[ d.20 != 5 ]


#풀이
# 1)
d <- 100:200
d

# 2)
d[10]

# 3)
d[1:90]

# 4)
d[ d%%2==1 ]

# 5)
d[ d%%3==0 ]

# 6)
d.20 <- d[1:20]
d.20

# 7)
d.20[ -5 ] # -는 제외하다

# 8)
d.20[ -c(5, 7, 9) ]

# ex
absent <- c(10, 8, 14, 15, 9, 10, 15, 12, 9, 7, 8, 7)
absent
month <- 

names(absent)
names(absent) <- c('JAN','FEB','MAR','APR','MAY','JUN','JUL','AUG','SEP','OCT','NOV','DEC')
names(absent)
absent
absent[5]

#-----------------------------------------------------

d1 <- 1:50
d1
d2 <- 51:100
d2

d1
d2

length(d2)

d1+d2
d2-d1
d1*d2
d2/d1

sum(d1)
sum(d2)

sum(d1)+sum(d2)
sum(c(d1,d2))

max(d2)
min(d2)

mean(d1)
mean(d2) - mean(d1)

d <- sort(d1,decreasing = T)

d4 <- sort(d1,decreasing = F)
d4

d5 <- sort(d2,decreasing = F)
d5

d3 <-c(d4[1:10],d5[1:10])
d3


#-------------------------------------------
v1 <- 51:90
v1

v1[ v1 < 60]

v1[ v1 < 70]
length(v1[ v1 <70])

sum(v1[ v1 > 65])

v1[ v1 > 60 & v1 < 73]

v1[ v1 < 65 | v1 > 80 ]

v1[ v1%%7==3 ]

v1[ v1%%7 == 0 ] <- 0
v1

sum(v1[ v1%%2==0])

v1[ v1%%2==1 | v1 > 80]

v1[ v1%%15==0 ]

v1[ v1%%2==0] * 2

v1[ v1%%7 != 0]


#------------------------------------------
#list
ds <- c(90,85,70,84)
my.info <- list( name="Tom", age=60, status=TRUE, score=ds)
my.info
my.info[1]

#값만 찍으려면
my.info[[1]]
my.info$score
my.info$status

# factor 범주형 자료( 예. 동서남북) 저장 사용한다
bt <- c('A','B','B','O','AB') #verctor
bt.new <- factor(bt) #factor 만들기
bt.new
bt.new[1,3]
bt.new[ -2] #두번째 인덱스값 제외
levels(bt.new) #변수에 저장된 값 보기
as.integer((bt.new))
bt.new[6] <- 'A'
bt.new[7] <- "C"

nn <- c('동','서','남','북','북')
nn.new <-- factor((nn)
levels.(nn.new)
as.integer(nn.new)

#--------------------------------------------------
day <- c('Mon', 'Wen')
people<- list( name="Bill", age=20, gender='M', student="TRUE" , day=day)
people
                 
a <- c('Korea', 'Japan', 'China', 'India', 'China', 'Korea')
f <- factor(a)

levels( f )                 
as.integer(f)

#추가문제
a <- 4
b <- 5
c <- a+b
c

x1 <- 6
x2 <- 8
x3 <- 10
y = 2*2 + 5*x3 + 10
y

val.a <- 10
val.b <- 20
sum.ab <- val.a + val.b

vc.1 <- c(95, 86, 47, 55 ,08)
vc.1


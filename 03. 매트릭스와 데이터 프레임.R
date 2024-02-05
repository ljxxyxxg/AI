# 매트릭스와 데이터 프레임

z <- matrix( 1:30, nrow = 5, ncol = 6, byrow = T)
z
z <- matrix( 101 : 200, nrow = 10, ncol = 10)
z

x <- 1:5 #1차원 벡터
y <- 8:12 #1차원 벡터
x
y
#2차원 매트릭스
# 칸으로 합치기
sum.xy <- cbind( x, y)
sum.xy

# 줄(row) 합치기
sum.xy1 <- rbind(x,y)
sum.xy1

# 1~5
# 101 ~ 105
# 201 ~ 205
a <- 1:5
b <- 101:105
c <- 201:205
bind.abc <- rbind(a,b,c)
bind.abc

#row: 행의 이름
z <- matrix(12:1, nrow = 3, ncol = 4, byrow = T)
z
row.names(z) <- c('v1', 'v2', 'v3')
names(z)
z

# 1행씩 만들어서 합치기
v1 <- 12:9
v2 <- 8:5
v3 <- 4:1
z <- rbind( v1,v2,v3)
z

z[2,4]
z[3,2]

z[,2]
z[1,]

#1행 3행 다 꺼내고 싶다
z[(c(1,3)),]

# 2열, 4열
z[,c(2,4)]

# 2열 ~ 4열
z[,c(2,3,4)]
z[, 2:4]

# 행이름 주기
# 열이름 주기
score <- matrix( c(90,85,69,78, 85,96,49,95 ,90,80,70,60), nrow=4, ncol=3)
score
rownames(score) <- c('Jhon', 'Tom', 'Mark', 'Jenny')
#열이름 추가
colnames(score) <- c('English', 'Math', 'Science')
score[2,2]
score[4,3]
score['Jenny', 'Science'] #score[4,3]
score['Jenny', 'English']

#Tom의 점수를 검색
score['Tom',]

#수학 점수를 검색
score[,'Math']

#수학점수의 평균
mean(c(85, 96, 49 ,95))

mean(score[ ,'Math'])

#행의 이름은?
rownames(score)

#과목명의 이름?
colnames(score)

#2번째 학생명은?
rownames( score)[2]

#3번째 과목명은?
colnames(score)[3]

# 1) 문제
v1 <- 12:9
v2 <- 8:5
v3 <- 4:1
z <- rbind( v1,v2,v3)
z

# 2)
colnames(z) <- c('a1','a2','a3','a4')
z

# 3)
v4 <- c( 7,5,3,1)
v4
z <- rbind(z, v4)
z

# 4)


# 문제풀이
# 1)
z <- matrix(12:1, nrow =3, ncol=4, byrow =T)

# 2)
rownames(z) <- c('v1','v2','v3')

# 3)
colnames(z) <- c('a1','a2','a3','a4')

# 4)
v4 <- c(1,3,5,7)
z <- rbind(z, v4)
z

# 5)
z[4,]

# 6)
z[2:4, c('a1','a3')]

# 7)
rownames(z)[3]

# 8)
colnames(z)[3]

# 데이터프레임
city <- c("Seoul","Tokyo","Washington") 	# 문자로 이루어진 벡터 
rank <- c(1,3,2) 				# 숫자로 이루어진 벡터 
city.info <- data.frame(city, rank) 		# 데이터프레임 생성 
city.info

t(city.info)


iris
head( iris, n=10)
tail( iris)

head(iris[,c(1:2)])
head(iris[, 'Petal.width'])

dim(iris) #행의 갯수, 열의 갯수
str(iris) # 구조
iris[,5] 
unique( iris[,5]) #중복제거
table(iris[,'Species']) #품종별로 갯수세기

colSums(iris[,-5])
colMeans(iris[,-5])
rowSums(iris[,-5])
rowMeans(iris[,'-Species']) # 오류발생

# 문제
state.x77
head( state.x77)
dim( state.x77)
str( state.x77)

st <- state.x77
st <- data.frame((state.x77))
st

# 2)
st

# 3)
colnames(st)

# 4)
rownames(st)

# 5)
nrow(st)
ncol(st)

# 6)
dim( st)

# 7)
rowSums(st)
rowMeans(st)

# 8)
colSums(st)
rowMeans(st)

# 9)
st["Florida",]

# 10)
st[, 'Income']

# 11)
st['Texas', 'Area']

# 12)
st['Ohio', 'Income']

# 13)
subset(st, Population>= 5000 ) #형식, subset( 데이터셋, 조건)

# # 14)
z <- subset(st, Income >= 4500)
z[c(1,2,8)]

subset(st, Income >= 4500)[, c('Population', 'Income', 'Area')]

# (15) 수입이 4,500 이상인 주는 몇 개인지 출력하시오. 
z <- subset(st, Income >= 4500)
nrow(z)

nrow(subset(st, Income >= 4500))

# (16) 전체 면적(Area)이 100,000 이상이고, 결빙일수(Frost)가 120 이상인 주의 정보를 출력하시오. 
subset(st, Area >= 100000 & Frost >= 120)
 
# (17) 인구(Population)가 2,000 미만이고, 범죄율(Murder)이 12 미만인 주의 정보를 출력하시오. 
subset(st, Population < 2000 & Murder < 12)
 
# (18) 문맹률(Illiteracy)이 2.0 이상인 주의 평균 수입은 얼마인지 출력하시오. 
mean(subset(st, Illiteracy >= 2.0)[ , 'Income'])

# (19) 문맹률(Illiteracy)이 2.0 미만인 주와 2.0 이상인 주의 평균 수입의 차이를 출력하시오. 
a <- mean(subset(st, Illiteracy < 2.0) [, 'Income'])
a
b <- mean(subset(st, Illiteracy >= 2.0)[, 'Income'])
b
abs(a-b)
 
# (20) 기대수명(Life Exp)이 가장 높은 주는 어디인지 출력하시오. 
max (st[,'Life.Exp'])
rownames(subset( st, Life.Exp == max(st[, 'Life.Exp'])))


# (21) Pennsylvania 주보다 수입(Income)이 높은 주들을 출력하시오. 
st['Pennsylvania', 'Income']
z <- subset( st, Income > 4449)
rownames(z)


# 연산자 4행 5열
a <- matrix(1:20, 4, 5)
a
b <- matrix(21:40, 4, 5)
b

2*a
b-5
a+b
b/a
a*b

#class 데이터셋의 구조확인
class(iris)
class( state.x77)
class(islands)

is.matrix((iris))
is.data.frame(iris)

#매트릭스(자료형이 동일한 2차 배열) --> 데이터프레임셋(자료형이 다른 2차 배열)
st <- data.frame(state.x77)
class(st)
class( iris)

#매트릭스(자료형이 동일한 2차 배열) <-- 데이터프레임셋(자료형이 다른 2차 배열)
as.im <- as.matrix(iris[,-5])
class( as.im )

# 열 추출하기
class(iris)
class(state.x77)
iris[, 'Species'] #열 이름을 검색
head( state.x77)
state.x77[, 'Area'] # 열 이름을 검색
 
iris[,5] #인덱스로 검색 가능
state.x77[,8] #가능

iris['Species'] #열 이름으로 검색 가능 데이터 프레임만 가능
state.x77['Area'] #불가능

iris[5] #열에 대한 인덱스 검색 가능
state.x77[8] #검색 불가능

iris$Species #데이터 프레임 $ 열이름 
state.x77$Species #이거 안됨

# (1) 위와 같은 내용을 가지는 데이터프레임 human을 생성하시오.
name <- c('Tom','Jane','Nick')
age <- c(20,23,26)
gender <- c('M','F','M')
height <- c(180,160,175)
student <- c(TRUE,TRUE,FALSE)

# (2) human에 (“Mary”, 24, “F”, 155, TRUE)를 추가하시오(list함수 사용).
human <- data.frame(name, age, gender, height, student)

human.new <- list( name='Mary', age=24, gender='F', height=155, student=TRUE)
human = rbind( human, human.new)

# (3) 이 데이터셋 열들의 자료형을 보이시오. 
str(human)
#dim(human) 행렬의 갯수 
#class(human) 데이터프레임인지 매트릭스 인지 알기

# (4) 평균 나이(age)와 평균 키(height)를 구하시오.
human$age
human['age']
human[, 'age']
human[,2]

mean( human$age)

mean( human$height)
# (5) 4번째 열을 제외한 human의 열 이름을 출력하시오.
colnames(human[-4])

 
# (6) 성별(gender) 인원수를 보이시오.
table( human$gender)


#파일 불러오기
setwd("C:/Users/tj/Desktop/r_ppt") #파일 불러올 경로명
air2 <- read.csv('C:/Users/tj/Desktop/r_ppt/airquality.csv')
air2
class(air2)
head(air2)
air2['Ozone']

#대화 상자로 파일 불러오기
air3 <- read.csv( file.choose())
head(air3)

#저장하기
iris.setosa <- subset( iris, Species == 'setosa')
write.csv(iris.setosa, 'irisfilename.csv')
            #저장할 자료 | 파일명
# 첫째 열에는 열번호가 있다. 이부분을 저장할때 제외하고 싶다.
write.csv(iris.setosa, 'irisFile1.csv', row.names = F)



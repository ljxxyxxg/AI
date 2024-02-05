# 4반복문 조건문
job.type <- 'A'
if(job.type == 'B') {
	bonus <- 200 	#직무 유형이 B일 때 실행 
} else { 
	bonus <- 100 	#직무 유형이 B가 아닌 나머지 경우 실행  
}
print(bonus)

# else 생략문
job.type <- 'B'
bonus <- 100 
if(job.type == 'A') { 
	bonus <- 200 	# 직무 유형이 A일 때 실행 
} 
print(bonus)


#다중 if문
score <- 85 

if (score > 90) {
  grade <- 'A' 
} else if (score > 80) {
	grade <- 'B' 
} else if (score > 70) { 
  grade <- 'C' 
} else if (score > 60) { 
	grade <- 'D' 
} else { 
  grade <- 'F' 
} 
print(grade)

#조건문 속 연산 논리자
a <- 10
b <- 20
if(a>5 & b>5) { 		# and 사용
  print (a+b)
}
if(a>5 | b>30) { 		# or 사용
  print (a*b)
}

#ifelse문
a <- 10
b <- 20

if (a>b) {
  c <- a
} else {
  c <- b
}
print(c)

a <- 10
b <- 20

c <- ifelse(a>b, a, b)
print(c)

# job.type <- 'A'
# if (job.type == 'B') {
#   bonus <- 200
# }
# else { 		# 에러 발생, 윗줄로 옮겨야 한다.
#   bonus <- 100
# }

#반복문
for(i in 1:5) {
  print('*')
}

#반복문 변수값
for(i in 6:10) {
  print(i)
}

# 구구단 출력
for(i in 1:9) {
  cat('2 *', i,'=', 2*i,'\n')
}

#for문 안에 if문
for(i in 1:20) {
  if(i%%2==0) { 		# 짝수인지 확인
    print(i)
  }
}

#꽃잎의 길이에 따른 분류 작업
norow <- nrow(iris) 		# iris의 행의 수
mylabel <- c( ) 			# 비어 있는 벡터 선언
for(i in 1:norow) {
  if (iris$Petal.Length[i] <= 1.6) { # 꽃잎의 길이에 따라 레이블 결정
    mylabel[i] <- 'L'
 	} else if (iris$Petal.Length[i] >= 5.1) {
 		mylabel[i] <- 'H'
  } else {
    mylabel[i] <- 'M'
 	}
}
print(mylabel) 				# 레이블 출력
newds <- data.frame(iris$Petal.Length, mylabel) # 꽃잎의 길이와 레이블 결합
head(newds) 			# 새로운 데이터셋 내용 출력

#while문
sum <- 0
i <- 1
while(i <=100) {
  sum <- sum + i 	# sum에 i 값을 누적
  i <- i + 1 	# i 값을 1 증가시킴
}
print(sum)

#break
sum <- 0
for(i in 1:10) {
  sum <- sum + i
  if (i>=5) break
}
sum

#next 문
sum <- 0
for(i in 1:10) {
  if (i%%2==0) next
  sum <- sum + i
}
sum

#04 apply 함수
apply( iris[, 1:4], 1, mean)
head(iris)
dim(iris)

apply( iris[, 1:4], 2, mean)

#예제
# 7. R의 apply() 함수를 이용하여 다음 문제를 해결하는 R 코드를 작성하시오.
 
# (1) iris 데이터셋의 행별 합계를 출력하시오.
apply( iris[ , -5], 1, sum )

# (2) iris 데이터셋의 열별 최댓값을 출력하시오.
apply( iris[,-5], 2, max )

# 8. R의 apply() 함수를 이용하여 다음 문제를 해결하는 R 코드를 작성하시오.

# (1) mtcars 데이터셋의 열별 합계를 출력하시오.
apply( mtcars, 2, sum)
# (2) mtcars 데이터셋의 열별 최댓값을 출력하시오.
apply( mtcars, 2, max)
# (3) mtcars 데이터셋의 열별 표준편차를 출력하시오.
apply(mtcars, 2, sd)


# 사용자 정의 함수
mymax <- function(x,y) {
                            num.max <- x
                            if(y>x){
                              num.max <- y
                            }
                            return((num.max))
}


myfunc <- function(x,y) {
  sum <- x+y
  mul <- x*y
  div <- x/y
  mod <- x%%y
  return( list( rsum= sum, rmul=mul, rdiv=div, rmod=mod)) #key, value 값
  
}

result <- myfunc(20,10)
result$rsum
result$rmod

#외부 파일에 있는 사용자 함수를 호출하기
source('d:/a1/study/r_study/Myfunc.r')
a <- myfu(100,50)
a$rsum
a$rmul

score <- c( 76, 84, 69, 50, 95, 60, 82, 71, 88, 84, 69)
which( score == 100)
max(score)
min(score)
which.max(score) #최댓값의 인덱스 값
which.min(score) #최소값의 인덱스 값

idx <- which( score <= 60)
score[idx] <- 61
score

idx2 <- which( score >= 80)
idx2
score.high <- score[idx2]
score.high

idx3 <- which(iris$Petal.Length > 5.0)
idx3
iris.big <- iris[idx3,]
iris.big

idx4 <- which(iris[, 1:4] > 5.0, arr.ind = T)
idx4
head(iris)


#9. 다음과 같이 두 정수를 입력하면 두 수의 최대공약수를 찾아서 반환(return)하는 R 함수 lgm()을 만들고 테스트하시오.
lgm <- function(x,y ){
  result <- 0
  for( i in 1:max(x, y)){
    if( x %% i == 0 & y %% i==0){
      result = i
    }
    return( result)
    }
      
}
lgm(10,20)

#10
maxmin <- function( x ) {
  fmax <- max(x)
  fmin <-min(x)
  return( list( max==fmax, min=fmin))
  
  
}

v<-c(1,5,0,9,10,50,8)
rv -maxmin(v)
rv$max
rv$min

#11
weight <- c(69,50,55,71,89,64,59,70,71,80)
#(1) 몸무게가 가장 큰 값은 몇 번째에 있나? 
which.max(weight) 
 
#(2) 몸무게가 몸무게가 가장 작은 값은 몇 번째에 있나? 
which.min(weight)
  
#(3) 몸무게가 61에서 69 사이인 값들은 몇 번째에 있나? 
which( weight >= 61 & weight <= 69)
  
#(4) 몸무게가 60 이하인 값들만 추출하여 weight.2에 저장하고 내용을 보이시오. 
weight.2 <- which(weight <= 60)
# 
# 12. 다음의 문제를 해결하기 위한 R 코드를 작성하시오(which() 함수 사용).
# 
# (1) mtcars 데이터셋에서 연비(mpg)가 가장 좋은 관측값(행)의 내용을 보이시오.
idx <- which.max((mtcars$mpg))


# (2) mtcars 데이터셋에서 자동차 중량(wt)이 2~3 사이인 관측값(행)들의 내용을 보이시오.
idx <- which(mtcars$wt >= w & mtcars$wt <= 3)
mtcars[idx2,]
 
# (3) mtcars 데이터셋에서 gear의 수가 3인 자동차 모델의 연비(mpg) 평균값을 구하시오.
idx3 <- which(mtcars$gear == 3)
mean( mtcars[ idx3, 'mpg'])

# (4) mtcars 데이터셋에서 자동차 중량(wt)이 5 이상인 자동차 모델의 연비(mpg) 최댓값을 구하시오.
idx4 <- which(mtcars >= 5)
max(mtcars[idx4, 'mpg'])
mydata <- c(60, 62, 64, 65, 68, 69, 120 )
quantile(mydata, (0:10)/10)
summary( mydata) #최소 1사분위 중위 평균값 최대값 등

m <- c(2,3,5,6)
var( m )
sd( m )
range(m)
diff(range(m))
hist(m)
hist(mydata)     
hist( mydata, main="점수", xlab ="점수", ylab = '갯수', border - 'blue',
       col = 'green', las =3 ,breadk=2)

head(cars)
class(cars)
dim(cars)
str(cars)
hist(cars)
dist <- cars[,2]
hist(dist)

speed <- cars[,1]
speed
his( speed, main='자동차 속도')
#barpoint(speed) 결과는 나와도 의미 없음

boxplot( mydata)
boxplot( m )
boxplot(dist)
boxplot(speed)
boxplot.stats( dist )
#conf 중앙 값에 대한 신뢰구간
#out 이상치, 특이값 

head( iris )
unique(iris$Species)
#붓꽃의 종류(Species)별로 값(Petal.Length - 꽃잎길이)로 boxplot 그리기
#boxplot( 그리려는 열값-그룹화할 열이름, data= 데이터셋 명 )
boxplot( Petal.Length~Species, data=iris )
boxplot( Petal.Length~Species, data=iris, main='제목: 붓꽃의 품종별 꽃잎길이',
         xlab ='x축제목: 붓꽃 품종', ylab='y축제목: 붓꽃길이(cm)')

#한 화면의 그래프를 여러개 출력하기
par( mfrow=c(2,2))
hist( mydata, main="점수", xlab ="점수", ylab = '갯수', border='blue',
      col = 'green', las =3 ,breaks = 2)
boxplot(speed)
boxplot( Petal.Length~Species,data=iris)
boxplot(dist)


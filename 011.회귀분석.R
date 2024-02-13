#단순선형 회귀 분석
#문제 주행속도와 제동거리 사이의 회귀식
head(cars)
class(cars)
str(cars)
dim(cars)
plot(dist-speed, data=cars)

#형식 회귀모델 구하는 함수 lm( 종속 변수~독립변수, 데이터셋)
#회귀식은 y = wx+b
mod1 <- lm( dist~speed, cars) 
mod1
coef(mod1)[1] # b = intercept 값이 b이다.
coef(mod1)[2] # speed 3.932402 값이 w이다.
# 그래서 y = 3.9320402 * speed - 17.579095 회기식을 구할 수 있다.

# 속도가 30일때 제동거리는?
y <- 3.932402 * 30 -17.579095
y

# 속도가 50일때 제동거리는?
y <- 3.932402 * 50 -17.579095
y

# 속도가 70일때 제동거리는?
y <- 3.932402 * 70 -17.579095
y

#속도에 따른 제동거리 예측하기
# 1 회기식을 구하기 w, b 구하기

# 오차는 꼭 존재한다 인정하기
# 예상제동거리, 실제 제동거리, 오차 구하기
head(cars)
speed <- cars[,1]
speed
w <- coef(mod1)[2]
b <- coef(mod1)[1]
predict <- w*speed + b #예상제동거리(회귀식에 의한 제동거리)

#예상제동거리, 실제제동거리, 오차 구하기를 데이터 프레임으로 만들기
compare <- data.frame(predict, cars[,2], predict - cars[,2])
compare
colnames(compare) <- c('예상제동거리', '실제제동거리', '오차')
compare

# 1. Loblolly 데이터셋에서 age를 이용해 height를 예측하는 단순선형 회귀모델을 만드시오. 그리고 age가 10, 15, 20일 때 height를 예측하여 보시오.
head( Loblolly)
dim( Loblolly)
str( Loblolly)
#종속변수는(y값)? height, 독립변수(x)는? age
#회기식을 구하기y = wx + b
plot( height~age, data = Loblolly, col='blue')
# 1단계 산점도에 대한 결과분석 : 선형관계가 분명

# 2단계 회기식을 구하기
mod2 <- lm(height~age, Loblolly)
mod2

#결과 회기식 y= 2.591 * age + (-1.312)
w <- coef(mod2)[2]
b <- coef(mod2)[1]
w
b
#3단계 age가 10,15,20일 때 height를 예측하기
age <- 10
y <- w*age+b
y

age <- 15
y <- w*age+b
y

age <- 20
y <- w*age+b
y

#2. airquality 데이터셋에서 Wind로 Temp를 예측하는 단순선형 회귀모델을 만드시오. 그리고 Wind가 10, 15, 20일 때, Temp를 예측하여 보시오.
head(airquality)
plot(Temp~Wind, data = airquality)
wind1 <- lm(Temp~Wind, airquality)

w <- coef(wind1)[2]
b <- coef(wind1)[1]

Wind <- 10
y <- w*Wind + b
y

Wind <- 15
y <- w*Wind + b
y

Wind <- 20
y <- w*Wind + b
y


#3. pressure 데이터셋에서 온도(temperature)로 기압(pressure)을 예측하는 단순선형 회귀모델을 만드시오. 그리고 온도가 65, 95, 155일 때 기압을 예측하여 보시오.
head(pressure)
plot(pressure~temperature, data = pressure)
pre <- lm(pressure~temperature, pressure)

abline(pre)
w <- coef(pre)[2]
b <- coef(pre)[1]

temperature <- 65
y <- w*temperature + b
y

temperature <- 95
y <- w*temperature + b
y

temperature <- 155
y <- w*temperature + b
y

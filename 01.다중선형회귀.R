#다중선형 회귀
install.packages('car')
library(car)
head(Prestige)
dim(Prestige)
class(Prestige)
str(Prestige)

#데이터 셋은 1열~4열
newData <- Prestige[ ,1:4]
head(newData)

# 산점도로 변수간의 관계 확인
plot( newData, col="blue")

#연봉 예측하기(교육연수, 여성비율, 직군에 대한 평판도)
#연봉 종속변수||교육연수,비율,직군평한 독립변수

#산점도로 변수가의 관계 확인
plot(newData, col="blue")

#회귀식 구하기
mod1 <- lm(income~education+women+prestige, newData)
mod1

#회귀식 y=177.2 * education + (-50.9) * women + 141.4 * prestige + (-253.8)
#해당 회귀식의 요약을 보면
summary(mod1)

# 다중선형 회귀모델에서 변수 선택하기
install.packages('MASS')
library(MASS)
newData2 <- Prestige[, 1:4]
head( newData2 )
mod2 <- lm(income~women+prestige + education, newData2)
mod3 <- stepAIC(mod2) #독립변수 선택진행

#회귀식 다른모델 y=(-50.9) * women + 141.4 * prestige + (-253.8)
summary(mod3) #0.6327 독립변수 2개이용
summary(mod1) #0.6323 독립변수 3개이용

# 2개모델 만들었다. mod1 < mod3 중 mod3이 더 잘한 모델

# 예측하기
newData2

#mod1로 예측
education <- 12.26; 
women <- 4.02;
prestige <- 69.1
y1 = 177.2 * education + (-50.9) * women + 141.4 * prestige + (-253.8)
y1 # 예측 11484.79
#mod3로 예측
y3 =(-50.9) * women + 141.4 * prestige + (-253.8)
y3 # 예측 9312.322

#실제값은 25879

#4. state.x77 데이터셋에 대해 다음의 문제를 해결하는 R 코드를 작성하시오.
#(1) 문맹률(Illiteracy)과 고등학교 졸업률(HS.Grad))로 1인당 소득(Income)을 예측하는 다중선형 회귀모델을 만드시오.
#종속 변수 : Income # 독립 변수 : Illiteracy, HS.Grad
mod4 <- lm(Income~Illiteracy + HS.Grad, data=data.frame(state.x77))
mod4
# 회귀식 y = -52.64 * Illiteracy + 44.55 * HS.Grad + 2131.33
summary(mod4)
#독립변수중 기여도가 높은 변수? HS.Grad
#유의 수준? 1.057e-05
#모델의 설명력? 0.3597
#회귀식에서 독립변수를 HS.Grad만 구하기
mod5 <- lm(Income~HS.Grad, data=data.frame(state.x77))
summary(mod5)
#(2) 다중선형 회귀모델을 이용하여 state.x77 데이터셋의 문맹률(Illiteracy)과 인구수(Population)로 1인당 소득(Income)을 예측하시오.
mod6 <- lm(Income~Illiteracy + Population, data = data.frame(state.x77))
mod6
state.x77
summary(mod6)


#(3) (2)에서 예측한 1인당 소득과 실제 state.x77 데이터셋의 1인당 소득(Income)이 얼마나 차이가 나는지 보이시오. (예측값, 실제값, 예측값-실제값을 나타낸다.)
head( state.x77)
pred  =  -468.63466 * Illiteracy + 0.03555 * Population + 4833.16224 #예상값
state.x77['Alabama', 'Income']

ds.3 <- data.frame(pred, state.x77['Alabama', 'Income'], pred - state.x77['Alabama', 'Income'])
colnames(ds.3) <- c('예상값', '실제값', '차이값')
ds.3
# 5. mlbench 패키지의 BostonHousing 데이터셋은 보스턴 지역의 지역 정보 및 평균 주택가격(medv) 정보가 저장되어 있다. 다른 변수들을 이용하여 medv를 예측하는 모델을 만드시오.(단 chas 변수는 모델을 만들 때 제외한다.)
library(mlbench)
data(BostonHousing) # 데이터셋 불러오기

# (1) 전체 변수를 이용하여 평균 주택가격(medv)을 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
class(BostonHousing)
str(BostonHousing)
dim(BostonHousing)
#종속변수 예측값 : medv
#회귀식 구학
ds <- BostonHousing[, -4] #데이터셋 준비
head( ds )
mod1 <- lm( medv~., data=ds) #회귀식 y=wx + b
mod1 # y = -0.113139  crim    0.047052    zn  0.040311 indus   -17.366999 nox    3.850492    rm     0.002784   age   -1.485374  dis    0.328311   rad  -0.013756   tax   -0.990958   ptratio    0.009741   b   -0.534158    lstat  
summary(mod1)
 
#독립변수 : chas를 제외한 나머지
 
# (2) 평균 주택가격(medv)을 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
library(MASS)
mod2 <- stepAIC(mod1)
summary( mod2 )

#필요한 변수만 추출했다
#회귀식 y = -0.114056 * crim + ... + -0.528103 * lstat + 36.620311     

 
# (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교해 보시오.
summary(mod1) #0.7291
summary(mod2) #0.7299

# 6. mtcars 데이터셋에서 다른 변수들을 이용하여 연비(mpg)를 예측하는 다중 회귀모델을 만드시오.
# (1) 전체 변수를 이용하여 연비(mpg)를 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
head(mtcars)
class(mtcars)
str(mtcars)
mod3 <- lm(mpg~. , data=mtcars)
mod3
y = -0.11144 * cyl +  0.01334 * disp + ... + 12.30337


# (2) 연비(mpg)를 예측하는 데 도움이 되는 변수들만 사용하여 예측하는 회귀모델을 만들고 회귀식을 나타내시오.
mod4 <- stepAIC(mod3)
summary(mod4)
y =  -3.9165*wt + 1.2259*qsec + 2.9358*am + 9.6178

 
# (3) (1), (2)에서 만든 예측모델의 설명력(Adjusted R-squared)을 비교하시오.
summary(mod3) #0.8066
summary(mod4) #0.8336

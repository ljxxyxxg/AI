#로지스틱 회귀 : 범주형 자료 glm() 사용
#로지스틱 회귀모델 만들때 범주형 자료를 정수로 변환한 후 사용
# y 값이 범주형인 것 분석하기( 범주형의 자료를 정수형으로 변환 월 - 1, 화 - 2, 동 - 1, 서 - 2, 남 - 3, 북 - 4)

# 예측하기 - 품종
head(iris)
class(iris)
dim(iris)
str(iris)
iris.new <- iris

#범주형 자료 숫자로 변환
iris.new$Species <- as.integer(iris$Species)
str( iris.new )
tail( iris.new )

# 회귀식 구하기
# 종속변수 : Species         독립변수 : Sepal.Length Sepal.Width Petal.Length Petal.Width Species
mod1 <- glm( Species~. , data=iris.new)
mod1
summary(mod1)

#식으로 써보기 
y = Petal.Length*0.22865 + Petal.Width*0.60925 + 1.18650 
y

# 예측하기
head(iris.new)

Petal.Length <- 1.4
Petal.Width <- 0.2

tail(iris.new)
y = Petal.Length*0.22865 + Petal.Width*0.60925 + 1.18650 
y

# 예측하기
head(iris.new)

Petal.Length <- 4.0
Petal.Width <- 2.5
 
y = Petal.Length*0.22865 + Petal.Width*0.60925 + 1.18650 

#predict() 함수로 품종을 예측하기
unknown <- data.frame( rbind( c(5.1, 3.5, 1.4, 0.2 ))) # 예측하고 싶은 독립변수의 값을 넣기
unknown
names(unknown) <- names(iris)[1:4]
unknown

pre <- predict(mod1, unknown) #predict(회귀모델, 예측하려는 x 값들)

Sepal.Length <- 5.1
Sepal.Width <- 3.1
Petal.Length <- 1.4
Petal.Width <- 0.2

y = Sepal.Length*(-0.11191) + Sepal.Width*(-0.04008) + Petal.Length*0.22865 + Petal.Width*0.60925 + 1.18650 
y

pred <- round(pre,0)
pred

round(y,0)


# 7. UCLA 대학원의 입학 데이터를 불러와서 mydata에 저장한 후 다음 물음에 답하시오. 
mydata <- read.csv("https://stats.idre.ucla.edu/stat/data/binary.csv")
head(mydata)
class(mydata)
str(mydata)


# (1) gre, gpa, rank를 이용해 합격 여부(admit)를 예측하는 로지스틱 모델을 만드시오(0: 불합격, 1:합격).
#독립변수 gre, gpa, rank 종속변수 admit
#회귀식 (회귀모델)
mod2 <- glm( admit~., data=mydata)
mod2

summary(mod2)

# (2) mydata에서 합격 여부(admit)를 제외한 데이터를 예측 대상 데이터로 하여 (1)에서 만든 모델에 입력하여 합격 여부를 예측하고 실제값과 예측값을 나타내시오.
head(mydata) 
#1. 예측값 만들기
md <- data.frame(mydata)[,2:4]
head(md)

#2. predict() 만들기
pre <- predict(mod2, md) #predict(회귀모델명, 예측하려는 값 데이터셋)
length(pre)
head(pre) #모델로 예측값 구한 것
pre <- round(pre, 0)
head(pre)

#실제값
head( mydata$admit)
tail( mydata$admit)

 
# (3) 만들어진 모델의 예측 정확도를 나타내시오.
result <- data.frame( 예측값=pre, 실제값=mydata$admit, 오차 = pre-mydata$admit)
result
mean( result$예측값 == result$실제값)

# 8. mlbench 패키지의 PimaIndiansDiabetes 데이터셋은 17개의 변수로 당뇨 여부(diabetes)를 예측하기 위한 정보를 담고 있다. 17개의 변수들을 이용하여 당뇨 여부(diabetes)를 예측하는 로지스틱 회귀모델을 만드시오.
library(mlbench)
data(PimaIndiansDiabetes) # 데이터셋 불러오기
head(PimaIndiansDiabetes)
str(PimaIndiansDiabetes)
dim(PimaIndiansDiabetes)

# (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
# 1단계 diabetes 변수의 자료(범주형)를 숫자로 바꾸기
ds <- PimaIndiansDiabetes
ds$diabetes <- as.integer(ds$diabetes)
head( ds )

# 2단계 임의로 60프로 추출
set.seed(100)
train.idx <- sample( 1:nrow(ds), nrow(ds)*0.6)
head( train.idx )

train <- ds[train.idx,]
head(train)

test <- ds[-train.idx, ]
head(test)

# (2) train의 데이터로 당뇨여부(diabetes)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.(당뇨여부(diabetes) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)

mod3 <- glm( diabetes~. , data=train)
summary(mod3)
y = glucose * 0.0059901 + mass*0.0118620 + 0.1848415

# (3) 회귀모델에 대해 test의 데이터를 입력하여 당뇨여부(diabetes)를 예측하시오.

class(test)
pred <- predict( mod3, test)
head( pred)
pred <- round( pred, 0)
ds[1:20,]

# (4) 예측한 값과 실제 당뇨여부를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.
mean( pred == test$diabetes)

# 9. mlbench 패키지의 Glass 데이터셋은 9개의 변수로 잔디의 종류(Type)를 예측하기 위한 정보를 담고 있다. 9개의 변수들을 이용하여 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만드시오.
library(mlbench)
data(Glass) # 데이터셋 불러오기
str(Glass)

ds <- Glass
ds$Type <- as.integer(Glass$Type)

# (1) set.seed(100)을 실행한 후 전체 데이터(관측값)에서 임의로 60%를 추출하여 train에 저장하고 나머지 40%는 test에 저장하시오.
set.seed(100)
train.idx <- sample( 1:nrow(ds), nrow(ds)*0.6)
train <- ds[ train.idx,] 
test <- ds[ -train.idx,]



# (2) train의 데이터로 잔디의 종류(Type)를 예측하는 로지스틱 회귀모델을 만들고 회귀식을 나타내시오.(잔디의 종류(Type) 변수는 팩터 타입이므로 정수로 바꾸어야 모델을 만들 수 있다.)
mod4 <- glm(train$Type ~. , data = train) #안된다. NA때문에 NA제거하고 다시
summary(mod4)
 
# (3) 회귀모델에 대해 test의 데이터를 입력하여 잔디의 종류(Type)를 예측하시오.
pred <- predict( mod4, test)
pred
pred < round(pred, 0)

head(pred)
head(test)

# (4) 예측한 값과 실제 잔디의 종류를 비교하여 모델의 정확도(accuracy)가 어느 정도인지 확인하시오.

mean( pred == test$Type)
#독립변수를 다시 정비할 필요가 있다
# 정확도가 많이 낮다


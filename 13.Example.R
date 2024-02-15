# 1. R에서 제공하는 Seatbelts 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
# • 군집의 수는 2로 한다.
head( Seatbelts )
class( Seatbelts ) #시계열 ts "matrix" "array"
dim( Seatbelts )
str(Seatbelts)

# 표준화 함수(0~1사이 숫자로 구하기)
std <- function(x){
  return( (x - min(x)) / ( max(x) - min(x)) )
}
ds <- Seatbelts[ , 1:7]
head( ds )

# • Seatbelts 데이터셋에서 마지막에 있는 law 열은 제외하고 군집화를 실행한다.
ds <- Seatbelts[ , 1:7]
head( ds )


# • Seatbelts는 각 변수(열)의 값들의 단위의 차이가 많이 나기 때문에 0~1 표준화를 실시한 후 군집화를 실행한다.
ds.std <- apply( ds, 2, std)
head( ds.std)
fit <- kmeans( x=ds.std, centers = 2)

library(cluster)
clusplot(ds.std, fit$cluster, color = T, shade = T, labels = 2, lines = 1)

subset (ds.std, fit$cluster == 2 )
fit$cluster


# 2. mlbench 패키지에서 제공하는 Sonar 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오. 
library(mlbench)
data("Sonar") # 데이터셋 불러오기

class(Sonar)
head(Sonar)
dim(Sonar)
str(Sonar)


# • 군집의 수는 2로 한다.
# • Sonar 데이터셋에서 마지막에 있는 Class 열은 제외하고 군집화를 실행한다.
ds <- Sonar[, 1:60]
ds
fit <- kmeans(ds, centers = 2) 
fit
fit$cluster
subset(ds, fit$cluster == 2)
clusplot(ds, fit$cluster, color=T, shade=T, labels=2, lines=1)


# 3. R에서 제공하는 swiss 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
# • 군집의 수는 3으로 한다.
head(swiss)
fit <- kmeans( swiss, centers=3)
fit
clusplot( swiss, fit$cluster, color=T, shade =T, labels=2, lines=1)

# 4. R에서 제공하는 rock 데이터셋에 대해 k-평균 군집화를 실시하고 결과를 그래프로 출력하시오.
# • 군집의 수는 3으로 한다.
head( rock)
dim(rock)
std <- function(x){
  return( (x - min(x)) / ( max(x) - min(x)) )
}
ds.rock <- apply(rock, 2, std)
ds.rock

fit <- kmeans(ds.rock, centers= 3)
clusplot( ds.rock, fit$cluster, color = T, shade = T, labels = 2, lines = 1)

# 5. mlbench 패키지에서 제공하는 Soybean 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library( mlbench)
data(Soybean)
head( Soybean )
dim(Soybean)
class(Soybean)
str(Soybean)
#  Soybean 데이터셋에는 결측값이 포함되어 있으므로 결측값을 제거한다.
ds.new <- Soybean[complete.cases(Soybean), ]
ds.new

#  Soybean 데이터셋에서 첫 번째에 있는 Class 열이 그룹 정보이다.
##답안지


#  Soybean 데이터셋에서 짝수 번째 데이터(관측값)를 훈련용 데이터로 하고, 홀수 번째 데이터(관측값)를 테스트용 데이터로 한다.
# 학습문제
idx <- seq( 1, nrow(ds.new), 2) #홀수에 대한 인덱스

ds.train.que <- ds.new[-idx, 2:36]
head( ds.train.que)

# 학습답안지
ds.train.ans <- ds.new[-idx, 1]
head(ds.train.ans)

# 시험문제
ds.test.que <- ds.new[ idx, 2:36]

#
ds.test.ans <- ds.new[idx, 1]

#  k-최근접 이웃에서 k를 3, 5, 7로 다르게 하여 예측 정확도를 비교한다.
library(class)
pred <- knn(ds.train.que, ds.test.que, ds.train.ans, k=3)
pred

acc <-mean(pred == ds.test.ans)
acc

pred <- knn(ds.train.que, ds.test.que, ds.train.ans, k=5)
pred

acc <-mean(pred == ds.test.ans)
acc

pred <- knn(ds.train.que, ds.test.que, ds.train.ans, k=7)
pred

acc <-mean(pred == ds.test.ans)
acc

#-------------------------------------------------------------------------------
#k-fold 교차 검증 knn 예측을 높이기 위해서 데이터셋을 골고루 뽑기

install.packages('cvTools')
library( cvTools )
k <- 10
folds <- cvFolds( nrow(iris), K=k) #형식 cvFolds( 관측 수, 그룹 수) 
folds

acc<-c()
for( i in 1: k) {
  ts.idx <- folds$which == i  #folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬입니다.
  ds.train.que <- iris[ -ts.idx, 1:4] #학습문제
  ds.train.ans <- iris[ -ts.idx, 5] #학습문제 답안지
  ds.test.que <- iris[ts.idx, 1:4] #시험문제 테스트
  ds.test.ans <- iris[ts.idx, 5 ] #시험 문제 답안지
  pred <- knn(ds.train.que, ds.test.que, ds.train.ans,  k = 5)
  acc[i] <- mean(pred == ds.test.ans)
  
  }
acc
mean(acc)
#k-최근접 이웃 분류는 1번 분류인것


# 7. mlbench 패키지에서 제공하는 BreastCancer 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library(mlbench)
data("BreastCancer") # 데이터셋 불러오기


#  BreastCancer 데이터셋에는 결측값이 포함되어 있으므로 결측값을 제거한다.
ds.new <- BreastCancer[complete.cases(BreastCancer), ]
head(ds.new)
 
#  BreastCancer 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
ds.new

#  k-최근접 이웃에서 k는 5로 한다.
#  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
library( class ) #knn()
library( cvTools) #cvFolds()
folds <- cvFolds( nrow(ds.new), K=10)
head(folds)
acc <- c() # 각 폴드에 대한 정확도를 담아둘 벡터

for( i in 1:10) {
  idx <- folds$which == i  #folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬입니다.
  ds.train.que <- ds.new[ -idx, 1:10] #학습문제
  ds.train.ans <- ds.new[ -idx, 11] #학습문제 답안지
  ds.test.que <- ds.new[ idx, 1:10] #시험문제 테스트
  ds.test.ans <- ds.new[ idx, 11] #시험 문제 답안지
  pred <- knn(ds.train.que, ds.test.que, ds.train.ans,  k = 5)
  acc[i] <- mean(pred == ds.test.ans)
  
}
acc
mean(acc)


# 8. mlbench 패키지에서 제공하는 PimaIndiansDiabetes 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library(mlbench)
data("PimaIndiansDiabetes") # 데이터셋 불러오기
head( PimaIndiansDiabetes)
dim(PimaIndiansDiabetes) 
str(PimaIndiansDiabetes)
class(PimaIndiansDiabetes)

#  PimaIndiansDiabetes 데이터셋에서 마지막에 있는 diabetes 열이 그룹 정보이다.

#  k-최근접 이웃에서 k는 5로 한다.


#  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
ds <- PimaIndiansDiabetes[complete.cases( PimaIndiansDiabetes ), ]
folds <- cvFolds( nrow(ds), K = 10)
acc <- c()
for( i in 1:10) {
  idx <- folds$which == i  #folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬입니다.
  ds.train.que <- ds[ -idx, 1:8] #학습문제
  ds.train.ans <- ds[ -idx, 9] #학습문제 답안지
  ds.test.que <- ds[ idx, 1:8] #시험문제 테스트
  ds.test.ans <- ds[ idx, 9] #시험 문제 답안지
  pred <- knn(ds.train.que, ds.test.que, ds.train.ans,  k = 5)
  acc[i] <- mean(pred == ds.test.ans)
  
}
acc
mean(acc)


# 9. mlbench 패키지에서 제공하는 Vehicle 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library(mlbench)
data("Vehicle") # 데이터셋 불러오기
head(Vehicle)
dim(Vehicle)
class(Vehicle)
str(Vehicle)


#  Vehicle 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
# 
#  k-최근접 이웃에서 k는 3으로 한다.
# 
#  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
ds <- Vehicle[complete.cases(Vehicle),]
folds <- cvFolds( nrow(ds), K = 10)
acc <- c()


for( i in 1:10) {
  idx <- folds$which == i  #folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬입니다.
  ds.train.que <- ds[ -idx, 1:18] #학습문제
  ds.train.ans <- ds[ -idx, 19] #학습문제 답안지
  ds.test.que <- ds[ idx, 1:18] #시험문제 테스트
  ds.test.ans <- ds[ idx, 19] #시험 문제 답안지
  pred <- knn(ds.train.que, ds.test.que, ds.train.ans,  k = 3)
  acc[i] <- mean(pred == ds.test.ans)
  
}
acc
mean(acc)


# 10. mlbench 패키지에서 제공하는 Vowel 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.
library(mlbench)
data("Vowel") # 데이터셋 불러오기
dim(Vowel)
str(Vowel)
class(Vowel)

#  Vowel 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
ds <- Vowel
ds
#  k-최근접 이웃에서 k는 5로 한다.
# 
#  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
ds <- Vowel[complete.cases(Vowel),]
folds <- cvFolds( nrow(ds), K = 10)
acc <- c()


for( i in 1:10) {
  idx <- folds$which == i  #folds$which : 각 열에 인덱스 순열이 포함된 정수 행렬입니다.
  ds.train.que <- ds[ -idx, 1:10] #학습문제
  ds.train.ans <- ds[ -idx, 11] #학습문제 답안지
  ds.test.que <- ds[ idx, 1:10] #시험문제 테스트
  ds.test.ans <- ds[ idx, 11] #시험 문제 답안지
  pred <- knn(ds.train.que, ds.test.que, ds.train.ans,  k = 5)
  acc[i] <- mean(pred == ds.test.ans)
  
}
acc
mean(acc)







mydata <- iris[,1:4]
fit <- kmeans( x= mydata, centers=3)
fit
fit$cluster #각 데이터에 대한 군집 번호
head(iris)
iris[107:127, ]
fit$centers #중심좌표점
fit$totss #각 군집에 포인트 수
fit$size 

#군집 시각화
library(cluster)
clusplot(mydata, fit$cluster, color =T, shade= T, labes = 2, lines=0 )

# 1단계 : 대상 데이터셋을 준비한다. 이때 산점도 상의 점 하나가 관측값 하나를 의미한다.
# 
# 2단계 산점도상에 임의의 점 2개(*와 +)를 만든다. 이 2개의 점은 나중에 군집이 완성되었을 때 각 군집의 중심점이 된다. 
# 
# 3단계 산점도상의 점 하나하나와 임의의 점 2개와의 거리를 계산하여 두 점 중 가까운쪽으로 군집을 형성한다. 그결과 그리프의 왼쪽 위의 점들은 * 군집으로 오른쪽 아래의 점들은 + 군집으로 묶인다.
# 
# 4단계 두개의 군집에 중심점을 다시 계산한다. (*과 +도 포함하여 계산) *의 위치와 + 위치를 새로 계산한 중심점의 위치로 이동한다.
# 
# 5단계 4단계의 과정을 반복한다.
# 
# 6단계 *와 +의 위치가 더 이상 변동되지 않으면 군집의 중심점에 도달한 것이므로 반복을 중단한다.
# 
# 7단계 마지막으로 *와 가까운 점들을 * 군집으로 + 가까운 점들을 + 군집으로 표시한다. 군집화를 종료 한다.

#2번 군집 자료
subset( mydata, fit$cluster ==2  )
fit$size
subset( mydata, fit$cluster == 3)
fit$size

favorite <- c('WINTER','SUMMER','SPRING','SUMMER','SUMMER','ALL'
,'FALL','SUMMER','SPRING')
favorite
table( favorite ) #도수 분포표
tavle( favorite ) / length(favorite) #비율

ds <- table(favorite)
ds
barplot( ds, main = '좋아하는 과정')
pie(ds)

fav.color <- c(2,3,1,1,2,3,2,1,1,2,3,3)
ds2 <- table(fav.color)

colors <- c('green', 'red', 'blue')
barplot( ds2, main = '좋아하는 색깔', col = colors)
pie(ds2, main='favorite season', col = colores)

#연속성 자료형
weight <- c(60,62,64,65,68,69)
weight.heavy <- (weight, 120)
weight
mean(weight.heavy)

#산술평균
mean( weight )
mean( weight.heavy)

#중위수 중앙값
median(weigth)
median(weight.heavy)

#절사평균
mean(weight, trim = 0.2)
mean(weight.heavy, trim = 0.2)

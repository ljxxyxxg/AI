# 1. 다음의 각 문제를 해결하기 위한 R 코드를 작성하시오.
 
# (1) 1~100 사이의 정수 중 3의 배수들의 합과 개수를 구하시오. 
sum <- 0
cnt <- 0
for( i in 1:100) {
  if( i %% 3 ==0 ) {
    sum <- sum + i
    cnt <- cnt + 1
  }
}
sum
cnt

# (2) 101~200 사이의 숫자 중 3과 4의 공배수를 출력하시오. 
for( i in 101 : 200) {
  if( i%%3 ==0 & i%%4 == 0) {
    print(i)
  }
}

# (3) 24의 약수를 출력하시오. 
for( i in 1:24){
  if( 24%%i == 0) {
    print(i)
  }
  
}
 
# (4) 10!을 출력하시오.(단, factorial() 함수를 이용하지 않는다.) 
fac <- 1
for( i in 10:1){
  fac <- fac * i
}
fac

# * 출력
for( i in 1:6) {
  for(j in 1:i){
    cat('*')
  }
  cat('\n')
}

# 3. while문을 이용하여 
# 의 값을 출력하는 R 코드를 작성하시오.
i <- 1
sum <- 0
while( i <= 9) {
  sum <- sum + i^2
  i <- i + 1
}
sum

# 4. 다음의 R 코드를 ifelse문으로 재작성하시오.
score <- 80
result <- ifelse(score > 60, 'Pass', 'Fail')
result

# 5. 소수(prime number)는 1과 자기 자신 외에는 나누어 떨어지지 않는 수를 말한다. 2~1000 사이의 소수를 출력하는 R 코드를 작성하시오
prime <- c()
for( i in 2:1000) {
  for( j in 2:i) {
    if( i%%j == 0) break
  }
  if( j == i)
    prime <- c(prime, i)
}
prime

#6. 0, 1, 1, 2, 3, 5, 8, 13, 21...... 형태의 수열, 즉 첫 번째 항의 값은 0이고 두 번째 항의 값은 1일 때 이후의 항들은 이전의 두 항을 더한 값으로 만들어지는 수열을 ‘피보나치 수열’이라고 한다. 0에서부터 시작하여 40개의 피보나치 수열을 출력하는 R 코드를 작성하시오.

# 벡터의 초기값이 0,1 만들기
fi <- c(0,1)
while( length(fi) < 40 ) {
  f.1 <- fi[length(fi) -1]
  f.2 <- fi[length(fi)]
  fi <- c(fi, f.1 + f.2)
}
fi
 

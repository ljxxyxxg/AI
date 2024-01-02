import math

print( math.sin(1/2) )
print( math.cos(0) )
print( math.ceil(-12.3) )# x보다 작지 않는 최대값 구하기
print( math.floor(-12.3) ) # x보다 작지 않는 최소값 구하기
#print( math.round(12.3) )#math 모듈의 내장 함수가 아니다
print( round(12.3) ) #파이썬 자체 내장 함수다 반올리 .5 이상

#**** fsum() 실수형 합계 구하기
list1 = [1, 2, 3, 4, 5, 6]
tuple1 = (1,2,3)
print(math.fsum(list1))
print(math.fsum(tuple1))

print(math.log10(1000))
print(math.pow(3, 3))
print(math.sqrt( 4 ))

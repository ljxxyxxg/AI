'''
start = int(input("시작수는? "))
end = int(input("끝 수는?"))
num = int(input("정수를 입력하세요"))

result ="%d은(는) %d~%d 사이에 없습니다"%(num, start, end)

if start <= num <= end :
    result = "%d은(는 %d~%d 사이에 있다)"%(num, start, end)
print(result)'''


#난수를 구하기
import random

#print( random.random() )  # 0<= r < 1
#print( random.randrange(1, 7)) # 1<= 랜덤수  < 7

thinkNumber = random.randrange(1, 45)
a1 = int(input('답은'))
result = "정답입니다"
o = 0

while thinkNumber != a1 : #정답을 찾을때까지

  if a1 < thinkNumber :
    result = "답보다 큰 수입니다."
    o += 1
  else :
    result = "답보다 작은 수입니다."
    o += 1
  print(f"{result}")
  a1 = int(input('답은'))

result = "정답입니다"
print(f"정답입니다 {o}만에 문제 풀었다.")



"""kor = input("국어 성적을 입력하세요: ")
eng = input("영어 성적을 입력하세요: ")
math = input("수학 성적을 입력하세요: ")

sum = int(kor)+int(eng)+int(math)
avg = sum/3
print("합계 : %d, 평균: %.2f"%(sum,avg))"""

#p.81
"""price = 3000
num = 3
pay =10000

change = pay - price * num
print('거스름돈----> %d원' %change)
print(f'거스름돈 --> {change}')"""


# 83 탄생년
"""
from datetime import datetime

name = input('당신의 이름은?')
birth = int(input("당신이 태어난 해는?")) # "2005" - int -> 2005
now = datetime.today().year
age = (now - birth) + 1
print(f"{name}님의 나이는{age}입니다 ")"""

#p.86
# year = input("년은? ")
# month = input("월은? ")
# day = input("일은? ")

from datetime import datetime
# year = datetime.today().year
# month = datetime.today().month
# day = datetime.today().day
# weekday = datetime.today().weekday()
# A = datetime.today().microsecond



# print(datetime.today().weekday())
# print(datetime.today().strftime("%A"))

# if weekday == 0 :
#   weekdayHan = "월"
# elif weekday == 1 :
#   weekdayHan = "화"
# elif weekday == 2 :
#   weekdayHan = "수"
# elif weekday == 3 :
#   weekdayHan = "목"
# elif weekday == 4:
#   weekdayHan = "금"
# elifweekday == 5 :
#   weekdayHan = "토"
# elif weekday == 6 :
#   weekdayHan = "일"
# print(f"{weekdayHan}요일입니다")

#p.87
width = 10
height = 20
length = width * 2 + height * 2 #사각형 둘레
area = width * height #사각형 넓이
print(f"사각형 둘레는{length}")
print(f"사각형 넓이{area}")

#만약에 사각형 넓이가 100이 넘으면 큰사각형인데요
#아니면 작은 사각형이네요 라고 출력학
if area >= 100 :
  print(f"{area} 큰사각형이네요")
else : 
  print(f"{area} 작은사각형이네요")


#넓이가 100<=넓이 <= 300 큰사각형
#50 <= 넓이 <=99 중간사각형
# 0<= 널비 <= 49 작은사각형

if 100<= area <=300 :
  print("큰사각형")
elif 50 <= area <= 99 :
  print("중간사각형")
else :
  print("작은사각형")




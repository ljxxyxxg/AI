#논리연산자
x = 10
y = 20
if not x >= 0 and y >= 0 : # 10 > 0 참 and 20 >= 0 참
  print("두개 다 양수") # or ~이거나
  print(f'{x} {y}') # not 반대 참이면 거짓


xx = 10
print(xx % 2 == 0 or xx % 3 == 0 )

a=5
b=7
c = a+b #뒤를 계산해서 앞변수에 대입
c == 12 # c랑 12랑 같냐 true or false

hobby1 = "영화감상"
hobby2 = "수영"
my_hobby = "참이슬"
print( my_hobby == hobby1 or my_hobby == hobby2 )

pilgi = 90
silgi = 70
if pilgi >= 80 and silgi >= 80 :
    print("합격")
else :
    print("불합격")

# 월 입력 받아서
# 1, 2, 3월이면 1사분기 4, 5, 6월이면 2사분기
# 7, 8, 9월이면 3사분기 10, 11, 12월이면 4사분기

month = int(input("월"))
if month <= 0 or month > 13:
  print("잘못된 달입니다.")
if 1 <= month <= 3 :
  print("1사분기")
elif 4 <= month <= 6 :
  print("2사분기")
elif 7 <= month <= 9 :
  print("3사분기")

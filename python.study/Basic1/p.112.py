# 3-2 풀기'''
'''
month = input("월을 숫자로 입력하세요: ")
if month == "3" or month == "4" or month == "5" :
  print("%s월은 봄입니다."% month)
if month == "6" or month == "7" or month == "8" :
  print("%s월은 여름입니다."% month)
if month == "9" or month == "10" or month == "11" :
  print("%s월은 가을입니다."% month)  
if month == "12" or month == "1" or month == "2" :
  print("%s월은 겨울입니다."% month)'''

  #3-3풀기
'''
a = int(input("주민번호 뒷자리 첫 번째 숫자를 입력해주세요: "))
if a == 1 or a == 3 :
  print('남성입니다.')
if a == 2 or a == 4 :
  print('여성입니다.')'''

# 3-4
'''
a = "apple"
b = a.upper

char = input('영문 대문자 또는 소문자 하나를 입력하세요: ')
char2 = char.upper()

if char2 == "A" or "P" or "P" or "L" or "E" :
  print("%s -> 모음"%char)
else :
  print("%s -> 자음"%char)'''

height = int(input("키는? "))
weight = int(input("몸무게는?"))

s = (height - 100)*0.9

print("="*50)
print("키: ", height)
print("몸무게: ", weight)

if weight > s :
  print("건강을 위해 다이어트가 필요합니다. ")
else :
  print("표준 또는 마른 체형입니다!")

print("아르바이트 급여 계산 프로그램")
print('※시급')
print('-주간 근무: 9,500원')
print("-야간 근무: 주간 시급*1.5")
print()

hour_pay = 9500

a = int(input("1(주간 근무)또는 2(야간 근무)을 입력해주세요.: "))
work_time = int(intput("근무 시간을 입력해주세요: "))

if a == 1 :
  day_night = "주간"
  pay = hour_pay*work_time
else :
  day_night = '야간'
  pay = hour_pay*work_time*1.5

print("%d시간 동안 %s는 %d원입니다"%(work_time, day_night, pay))
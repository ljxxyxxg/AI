# #파이썬에서 True혹은 False를 갖는 타입은?
# print(bool(''))
# #아래 코드 출력 결과는?
# print((3 < 5))
# #아래 코드 출력 결과는?
# print((3 == 3) and (4!=3))
# #아래 코드가 에러가 발생하는 이유는?
# print( 3 >= 4)
# #아래 코드 실행 결과는?
# if 4 < 3 :
#   print("Hello")
# #아래 코드의 출력 결과를 예상하라
# if 4 < 3:
#   print("Hello World.")
# else:
#   print("Hi, there.")

# #아래 코드의 출력 결과를 예상하라
# if True :
#   print ("1")
#   print ("2")
# else :
#   print("3")
#   print("4")
# #아래 코드의 출력 결과를 예상하라 
  
# if True :
#   if False:
#     print("1")
#     print("2")
#   else:
#     print("3")
# else:
#   print("4")
#   print("5")

# # 사용자로부터 입력받은 문자열을 두 번 출력하라. 아래는 사용자가 "안녕하세요"를 입력한 경우의 출력 결과이다.
# a = input('입력하기')
# print(f"{a*2}")

# #사용자로부터 하나의 숫자를 입력받고, 입력 받은 숫자에 10을 더해 출력하라.
# a1 = int(input('숫자를 입력하세요')) 
# print(f"{a1+10}")



# #사용자로부터 하나의 숫자를 입력 받고 짝수/홀수를 판별하라.
# a2 = int(input('입력하기'))
# if a2 %2 == 0 :
#   print("짝수입니다.")
# else :
#   print('호올스입니다.')
  
# # 사용자로부터 값을 입력받은 후 해당 값에 20을 더한 값을 출력하라. 단 사용자가 입력한 값과 20을 더한 계산 값이 255를 초과하는 경우 255를 출력해야 한다.
# a3 = int(input("입력받기"))
# if a3 + 20 > 255 :
#   print(f'{255}')
# else :
#   print(f'{a3+20}')
#사용자로부터 하나의 값을 입력받은 후 해당 값에 20을 뺀 값을 출력하라. 단 출력 값의 범위는 0~255이다. 예를 들어 결괏값이 0보다 작은 값이되는 경우 0을 출력하고 255보다 큰 값이 되는 경우 255를 출력해야 한다.
# a4 = int(input("입력하기"))
# b = a4 -20
# if b > 255 :
#   print(f'{255}')
# elif b < 0 :
#   print(f'{0}')
# else :
#   print(f'{b}')

#사용자로부터 입력 받은 시간이 정각인지 판별하라.
# a5 = input("입력바랍니다")
# if a5[2:] == "00":
#   print("정각입니다.")
# else :
#   print("정각이아닙니다.")

# 영문자 한개를 입력 받고, 소문자일 경우 대문자로 대문자일 경우 소문자로 변경해라
# str = input("입력하세요")
# if str.islower()  :
#   print( str.upper())
# else :
#   print( str.lower())

#점수 구간에 해당하는 학점이 아래와 같이 정의되어 있다. 사용자로부터 score를 입력받아 학점을 출력하라.
# a = int(input("입력값"))
# if 81 <= a <= 100 :
#   print('점수는 A학점입니다.')
# elif 61 <= a <= 80 :
#   print('점수는 B학점입니다.')
# elif 41 <= a <= 60 :
#   print('점수는 C학점입니다.')
# elif 21 <= a <= 40 :
#   print('점수는 D학점입니다.')
# elif 0 <= a <= 20 :
#   print('점수는 E학점입니다.')  

# #숫자 세개를 입력 받은 후 가장 큰 숫자를 출력하세요
# A = int(input("첫 번째 정수는?"))
# B = int(input("두 번째 정수는?"))
# C = int(input("세 번째 정수는?"))

# if A > B and A > C :
#   largest = A
# elif B > A and B > C :
#   largest = B
# else :
#   largest = C
# print('%d, %d, %d 증에서 가장 큰수는 %d입니다'%(A, B, C, largest))

# 휴대폰 번호 앞자리에 따라 통신사는 아래와 같이 구분된다. 사용자로부터 휴대전화 번호를 입력 받고, 통신사를 출력하는 프로그램을 작성하라.
telecom = input("전화번호를 입력하세요")

if telecom[:3] == "010" :
  print("알수없음")
elif telecom[:3] == "011" :
  print("SKT")
elif telecom[:3] == "016" :
  print("KT")
elif telecom[:3] == "019" :
  print("LGU")
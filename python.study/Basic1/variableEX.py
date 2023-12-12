# 변수연습
_name = "홍길동" #밑줄이나 영어로 시작하면 가능
_Name1kk="다른변수"
_name = "이순신"
print(_name) #같은 이름 사용하면 앞에 변수 사라짐
print( type(_name)) # type 함수는 자료형을 보여준다.
number = 10
print( type(10))
pi = 3.14
ok = True
print( type(pi))
print( type(ok))
number = "백점"
print( type(number))
print( type(number))  
#사칙연산
str1="abc"
str2="def"
print(str1 + str2) # 연속해서 출력해라
print(str1 * 3) #str1을 3번 반복해라

str3 = str1 + str2
print(str3)

number=1; number2=2; number3=3
number4 = number + number2
number5 = number2 * number3
number6 = number2 ** number3 #거듭제곱
number7 = number3 / number2
number8 = number3 % number2
print(number, number2, number3, sep="--")
print(number4, number5, number6, sep=" == ")
print(number7, number8, sep=" --> ")


ok1 = True # 1 True 1
ok2 = False # 0 True 1
ok3 = ok1 + ok2 # + 연산은 True 1로 값으로 바꾼다 or연산 1
ok4 = ok1 - ok2 # 1 - 0 = 1
ok5 = ok1 * ok2 # and 연산자
# ok6 = ok1 /ok2

print( ok1, ok2, ok3, ok4, ok5, sep= " >> ")


print(-26.35 + 8.7*(-21.0))
print( 3/5 )
a=1/3
print(a)
print("%.2f"%a)
b=100//35 #나누기 소수점 아래 절삭
print(b)

s="안녕하세요. 반갑습니다."
print(s[7])
print(s[3:5]) # 3<=index number < 5
print(s[:6]) # 0<=index number < 6
print(s[7:]) # 6<=index number < 끝까지
print(s[:]) # 0 <= index number < 끝까지

jumin = "061125-2044580"
# 성별 추출하기 4
# 생일 추출하기 2006년 11월 25일
print()

print(jumin[7:8])
print()


year = jumin[0:2]
month = jumin[2:4]
day = jumin[4:6]
print("20", year, "년", month, "월", day, "일", sep= "")
print(len(jumin)) #len() 길이구하기


#print(len(a)) 숫자에서 len() 사용못함

print("-"*100)


a="100"
b="abc"
c=(str) (a)+b #"100" + "abc"
print( type(c))
print(c) #100abc

a="100"
b="200"
c=(int)(a) + (int)(b) #"100"- 숫자 바꾸기 -> 100
print(type(c))
print(c) # 300
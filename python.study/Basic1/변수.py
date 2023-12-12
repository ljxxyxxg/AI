주식명 = "삼성전자"
주식싯가 = "500000"
주식수 = "10주"
print(주식명 + "주식" + 주식수 + "총평가금액"+ 주식싯가 + "원 입니다.", sep= " ")

시가총액 = "298조"
현재가 = 50000
per = (float)(15.79)
print("항목", "값" )
print("시가총액" , 시가총액 )
print("현재가", 현재가,"원")
print("per", per)

h="hello"
p="python"
print(h+ "!" +p)

a="123"
print(a,type(a))

num_str = "1234"
a = int("1234")
print(a)

num_str = "12.567"
b = float("12.567")
print(b)

year = "2020"
year = int("2020")
print(year)

print()
print()

month = 48960
total = month*36
print(month*36)
print()

letters = "java programming"
print(letters[5], letters[10], letters[15])


print()

num_print = "43다6521"
print(num_print[3:])


print()


string = "홀짝홀짝홀짝홀짝"
print(string[ 1 : 8 : 2])

print()
string = "PYTHON"
print(string[ ::-1])

string = string.replace("Y", "K")#아예 변환
print(string)

print(string.replace("N", "M"))#임시로 치환
print(string)

phone_number = "010-888-9999"
phone_number = phone_number.replace("-", " ")
print( phone_number )

phone_number = phone_number.replace(" " , "")
print( phone_number )

url = "http://www.gmail.com"
url = url.split(".")
print(url[1]) 

lang = "java python"
#lang[0] = "k" #문자열은 부분적으로 수정이 안됨
lang = lang.replace("j", "k")
print(lang)


string = "abcdefABCDEFabc"
string = string.replace("c", "i")
print(string)

string = "abcdefABCDEFabc"
string.replace("c", "i")
print(string)

a ="123"
b="456"
print(a+b)

print("Hi!"*5)


print("+"*150)



s1="python"
s2="c++"
s3="java"
print((s1+ " " + s2 + " "+s3 + " ")*6)







name1 = "홍길동"

age1 = 25

eyesight1 = 1.2

name2 = "이순신"

age2= 13

eyesight2 = 0.8
print("이름 : %s 나이: %d 시력: %.1f "%(name1, age1, eyesight1))
print("이름 : %s 나이: %d 시력: %.1f "%(name2, age2, eyesight2))

print("이름: {} 나이: {} 시력: {}".format(name1, age1, eyesight1))
print("이름: {} 나이: {} 시력: {}".format(name2, age2, eyesight2))

print(f"이름: {name1} 나이: {age1} 시력:{eyesight1}")
print(f"이름: {name2} 나이: {age2} 시력: {eyesight2}")

#삭제, 수정 --> 치환
total = "5,896,124,650"
total = total.replace(",", "")
print( type(total) )
total = int (total)
print(total + 100)


print()
날짜 = "2024/01(E) 1사분기"
날짜 = 날짜[0:7]
print(f"{날짜}")
print(날짜)

날짜 = "2024/01(E) 1사분기"
날짜 = 날짜.split("(")
print(날짜[0])

data = "   공백제거하기          "
data = data.strip()
print( f"공백제거한값은 {data}")

lowerWord = "python is very good"
print(lowerWord.upper())

upperWord = "python is very good"
print(upperWord.lower())


capitalizeWord = 'python quiz'
print( capitalizeWord.capitalize() )

fileName="abc.csv"
print(fileName.endswith("csv"))

if fileName.endswith("csv") :
  print("액셀파일입니다.")

  print(fileName.endswith("csv" or "xlsx"))
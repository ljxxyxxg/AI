#문자열 반복 연산자
"""
x="토끼"
print(x) 


x = "apple" + str(123)
y = "-"*10 +"="*20
print(len(x+y))

#문자열 포맷팅
animal = "고양이"
age = 25
score = 12.55
x = "나는 %s를 좋아하는 %d 살입니다 포인트 점수 %.1f입니다" %(animal,age,score)
print(x)

y="ab"
x="%s"%y # %c 한글자
print(x)


y=15
x="%o"%y #%o 8진수로 표시
print(x)

y=15
x="%x"%y # %x 16진수로 표시
print(x) 

# %s %c %d %f %o %x

#input()
name = input("이름을 입력하세요")
print("%s 입니다"%name)

score = (int) (input("점수는")) 
print(type(score)) #str
print("%d 점입니다." %score)
"""





name = "홍지영"
a=10
b=20
print( name, a, b, a-b, 100, sep="/")


#76 널이란? 값이 없는 것 ""


print("문자열에는 문자 앞 뒤에 쌍따옴표(\")를 \n 붙인다")
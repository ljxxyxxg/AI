# # 10! = 1 X 2 X 3 .. X 10
# for i in range ( 10 ) : # 0~9까지 
#     print(i, end =" ")
# print("-"*10)
# for i in range(1, 11) : # 1~10
#     print(i, end = " ")
# for i in range(11, 0, -1) :
#     print(i, end = " ")
# print("-" * 30)
# for i in "I love you" : 
#     print(i, end = " ")
# sum = 0
# j = 1
# while True :
#     if sum >= 5000 :
#         break
#     else :
#         j += 1
#         sum += j
# print( j, sum )

# #10! = 1x2x...x10 팩토리얼 구하기
# fac = 1
# for i in range(1, 11) :
#     fac = fac * i
# print( fac )

# # 심화문제 4 - 1
# for 문
# for i in range(1, 1001) :
#   if i % 3 != 0 :
#     print( i , end= " ")
# # 3단계 한줄에 10개씩 출력
# count = 0
# for i in range(1, 1001) :
#   if count == 10 :
#     print()
#     count = 0
#   if i % 3 !=0 :
#     print(i, end=" ")
#     count += 1

# #while문
# i = 1
# count = 0
# while i<= 1000 :
#     if count == 10 :
#         print()
#         count = 0
        
#     if i % 3 != 0 :
#         print( i, end=" ")
#         count += 1
#     i += 1

# #4-2 성적을 입력받아 등급 판정하기 'q'를 입력하면 프로그램 종료
# con = 'y'
# while con == 'y' :
#     jumsu = int(input("성적을 입력하세요"))
#     if 90 <= jumsu <= 100 :
#         result = '수'
#     elif 80 <= jumsu <= 89 :
#         result = '우'
#     elif 70 <= jumsu <= 79 :
#         result = '미'
#     elif 60 <= jumsu <= 69 :
#         result = '양'            
#     elif 0 <= jumsu <= 59 :
#         result = '가' 
#     print(f'등급 : {result}')
#     con = input("계속하시겠습니까?(중간:q계속:y)")

#4-3
#시작수 입력받고 끝 수 입력받기
a = int(input("시작수는?"))
b = int(input("끝수는?"))
#시작수부터 끝수까지 출력하기
for i in range(a, b+1) :
    print(i, end=" ")
# 3단계 시작수 ~ 끝수 소수를 출력하기
for i in range( 2, 30) :
    if 31 % i == 0:
        x = False
        break
if x :
    print(f'{31}은 소수이다')


#소수만 출력하기
X = True #소수인 경우는 True
for i in range(a,b+1) : #start 30 end 38
    X = True
    for j in range(2, a) : #2~29까지 나누어 본다
        if i % j == 0 : 
            break #한단계 반복문 밖으로 나간다 즉 for j 에서 문 밖으로 
    if X:
        print(i , end=" ")   
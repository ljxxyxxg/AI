# #for문,while문
# for x in range(1,11,2) :
#   print(x)
# #5 10 .. 100
# for x in range(5,101,5) :
#   print(x)
# for x in range(100,4,-5) :
#   print(x)
# # 문제
# #시작수 3

# a = int(input('시작수?'))
# b = int(input('마지막수?'))
# c = int(input('증가수?'))
# for x in range(a,b,c) :
#   print(x)

# #1~100까지합
# sum = 0
# sumsum = 0
# for x in range(1, 101, 1) :
#   sum = sum + x
#   sumsum = sumsum + sum 
# print( sum )


# #146p
# for x in range(10) :
#   print(x)
# for x in range(1,10) :
#   print(x)
# for x in range(1,10,2) :
#   print(x)
# for x in range(20,0,-2) :
#   print(x)

# #2024년 1월 1일부터 2024년 1월 31일까지
# year = 2024
# month = 1
# day = 1
# for day in range(1,32) :
#   print(year,month,day,sep="/")
#   print()

# 1~100까지 합계 3000 넘어가면 멈추고 합계 출력


# a = 100
# for x in range(100, 10001, 5) :
#   a += x
#   if a>=5000:
#     break
# print( a )

#문자열  for 문 
# for x in "abcdefg" :
#   print(x)

# #'t' 몇개인가요?
# count = 0
# for x in "this is python" :
#   print(x)
#   if x == "t" :
#     count += 1
# print(f't의 갯수는 {count}입니당.')

# #공백이 몇개 인가요
# a = 0
# for x in "this is python" :
#   print(x)
#   if a == ' ' :
#     a += 1
# print(f'공백은 {a}입니다')

# # 구구단
# for i in range(1, 10) :
#   for j in range(2, 10) :
#     print( '%2dx%2d=%2d' %{j, i})

# for i in range( 2, 10 ) :
#   for j in range(1, 10):

# for i in range(1, 10):
#   print("*"*i)
  

# for i in range(10,1,-1):
#   print('*'*i)


# for i in range("", ):
#   print('*'*i)

# for i in range(1,6) :
#   for j in range(1, 6-i) :
#       print(" ", end = "" ) #공백찍기
#   for k in range(1, 2*i) :
#       print("*", end ="") 
#   print()

# count = 0
# for i in range(200, 801) :
#   if i %5 != 0 :
#     print("%d"%i, end = " ")
#     count = count + 1

#     if count % 10 == 0:
#       print()

# print("-" * 40)
# print(" cm mm m inch")
# print("-" * 40)

# for cm in range (1, 101, 1) :
#   mm = cm * 10.0
#   m = cm * 0.01
#   inch = cm * 0.3937
#   print("%d %d %.2f %.12.f"%(cm, mm, m, inch)) 

# number = input("숫자를 입력하세요")
# #"477569040"
# total = 0
# for a in number :
#   a = int (a)
#   if a % 2 != 0 :
#     total += 1
# print("홀수의 개수 : %d개" %total)

# for i in range(1,6):
#   for j in range(1,11):
#   print("*", end=" ")
#   print()




# for i in range(9, 0, -1) :
#   for j in  range(0, i, 1) :
#     print( i, end = " ")
# print()  


#while문
#형식 while 조건문 :
#           조건이 참이면 반복할 내용
#     조건이 거짓이면 수행할 내용


# 1~100까지 합 구하기
i = 1
sum = 0
while i <= 100:
    sum += i
    i += 1
print(sum)

#500~200까지의 합 구하기
j = 500
sum = 0
while j >= 200 :
    sum += j
    j -= 1
print(sum)

#500~1000까지 7개씩 증가하면서 합과 평균 구하기
a = 500
sum = 0
count = 0
while j <= 1000:
  sum += a
  a += 7
  count += 1
print('갯수%d'%sum)
print('합계%d'%count)
print('평균%.2f'%(sum/count))




























































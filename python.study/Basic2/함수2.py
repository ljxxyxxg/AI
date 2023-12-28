

# r = 0 #전역변수
# def printSum(sList) :
#   #r = 0 #지역변수
#   global r #전역변수 r 이라는 뜻
#   r = 0
#   for s in sList :
#     r += s
#   return r

# sList = [1,3,5,6,2]
# print( printSum(sList) )
# print( r )

#7-1
# def func() :
#   global x
#   x = 200

# func()
# print(x)

# #7-2

# def func(x) :
  
#   x = 200
#   print(x)

# x = 100
# func(x)
# print(x)

# def func() :
#   global x
#   x = 200
#   print(x)

#   x = 100
#   func()
#   print(x)

# #7-4
# k = int(input(" 킬로미터를 입력하세요 "))
# def func() :
#   global m
#   m = k * 0.621371
  
# func()
# print("%d 킬로미터는 %.2f 마일이다."%(k, m))

#7-5
# print("-선택 옵션")
# print("1.더하기")
# print("2.빼기")
# print("3.곱하기")
# print("4.나누기")
# x = int(input("원하는연산을 선택하세요(1/2/3/4)"))
# a = int(input("첫번째 숫자를 입력하세요"))
# b = int(input("두번째 숫자를 입력하세요"))

# def func():
  
#   if(x == 1) :
#     sum = a + b 
#     print(sum)
#   elif(x == 2 ):
#     subtract = a - b
#     print(subtract)
#   elif(x == 3) :
#     times = a * b
#     print(times)
#   elif(x == 4) :
#     divide = a / b
#     print(divide)

# func()    


# #7-6
# a = input("영어문장을 입력하세요:")
# b = input("알파벳 하나를 입력하세요:")


# def func() : 
#   c = a.count(b)
#   print(f"{a}에 포함된 {b}의 개수는 {c}개이다")

# func()

# #7-7
# def tuplSum( t1 ) : 
#   sm = 0
#   for i in t1:
#       sm = sm + i
#   return sm

# tup1 = (10,20,30,40,50)
# ss = tuplSum( tuple )
# print("튜플의 합계: %d"%(ss))

# #7-8 
# str = input("문자열을 입력하세요")

# def reverseFun(str):
#   reverseFun(str)
#   for i in range(9, -1, -1) :
#     print( str[i] )

# #7-9 
# def blankfun(s1):
#   global s
#   s = s1.replace(" ", "-")
  

# s = input("문자열을 입력하세요")
# blankfun( s )
# print( s ) 

# #심화문제
# eng_dict = {'house':'집','piano':'피아노','christmas':'크리스마스','friend':'친구','bread':'빵'}
# def engQuiz(eng_dict):
#   for i in eng_dict : #키값들이 i변수에 담긴다.
#     answer = input(f"{eng_dict[i]}에 맞는 영어단어는?")
#     if answer == i :
#       print("참 잘했어요!")
#     else:
#       print("틀렸어요")

# #심화문제 2
# n = int(input("n값을 입력해 주세요"))

# def decimalFun( n1 ) :
#   de = []
#   for i in range( 2, n1, 1) :
#     for j in range( 2, n1, 1) :
#       if i % j != 0 and i % i == 0 :
#         de.append( i )
#         break
  
#   print(de)

#심화문제
# def decimalFun(n1):
#   dL = []    
#   for i in range(2, n1, 1) :
#     x = True
#     for j in range( 2, i, 1) :
#       if i % j == 0 :
#         x = False
#         break
#     if x :
#       dL.append(i)
#   return dL
# dL = decimalFun( n )
# print(dL, end=" ")    

#심화문제 7-3
n = int( input("n값을 입력하세요:"))

def nMul( n ) :
    result = []
    for i in range( 1, n+1 ) : # 1~10
        result.append( i*i )
    return result


resultList = nMul( n )
print( resultList )
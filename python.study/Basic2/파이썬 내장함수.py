# #아스키 코드 = 유니코드
# x = "a"
# print(ord( x ))

# #2진수
# x = 15
# print(bin( x ))

# #16진수
# x = 15
# print(hex( x ))

# #반올림
# x = round(7.65676)
# print( x )

# #최댓값
# x = max(10,9,-20)
# print(x)

# #최솟값
# x = min([1,5,0,7])
# print(x)

# #tuple
# x = max( (10,8,7,20 ))
# print(x)

# #set
# x = min( { 10,98,67,10 })
# print(x)

# #Dicionary
# x = min ({1:"a", 0:"b", -1:"c"}) #키의 제일 작은 수 출력
# print(x)

# #유니코드
# x = min(["a", "A", "c"])
# print(x)

# #소수 여부 판별하기
# def is_prime( n ) :
#     prime = True
#     if n > 1 :
#         for i in range(2, n) :
#             if n % i == 0 :
#               prime = False
#               break

# number = int(input("수를 입력하세요"))
# if is_prime(number) :
#     print("소수이다")
# else :
#     print("소수가 아니다")

#세제곱 합계 구하기
# def sqaure_sum( n ) :
#     sm = 0
#     for i in range( 1, n+1 ) :
#         sm = sm + i*i*i
#     return sm



# n = int(input("n의 값을 입력하세요"))
# print( sqaure_sum( n ))

#8 - 1
# def sqaure_sum( n ) :
#     sm = 0
#     for i in range( 1, n+1) :
#         sm = sm + (i*i*i)
#         print("%d * %d * %d"%(i,i,i), end="")

#         if i == n :
#             print("=", end ="")
#         else :
#             print("+", end ="")
#     print(sm)

# N = int(input("N의 값을 입력하세요:"))
# sqaure_sum(N)

#8-2
def sqaure_sum( n ) :
  sm = 0
  for i in range( 1, n + 1 ) :
    if i % 2 != 0 :
      sm = sm + (i*i*i)
      print("%d*%d*%d" % (i,i,i), end="")

      if i==n or i==(n-1):
        print("=", end="")
      else :
        print("+", end="")
  print(sm)

N = int(input("N의 값을 입력하세요: "))
sqaure_sum(N)
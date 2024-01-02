# import add

# print(add.add(10, 20))
# print(add.sub(10, 20))
# print(add.mul(10, 20))
# print(add.div(10, 20))


#애칭 만들기(간편 수식어)
# import Basic3.add as p

# print(p.add(10, 20))
# print(p.sub(10, 20))
# print(p.mul(10, 20))
# print(p.div(10, 20))

#함수 불러내기
from add import sub, mul, mm, ss

# print(add.add(10, 20))
print(sub(10, 20))
print(mul(10, 20))
# print(add.div(10, 20))

print(mm(10, 30)) # 30의 제곱에다 10을 더하기
print(ss(3,2,1)) #가장 작은 수 출력하기

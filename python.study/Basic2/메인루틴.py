a = 10
print(a)

def f() : #설계만 한거 호출이 없음
  x = 10
  print(x)


def f() :
  global x #함수 밖에 있는 전역 변수

  print(x)

x = 25 #전역
f()
#지역변수
#전역변수
#변수의 생명주기 life cycle


def func( ) :
  x = 10 # 태어남 만들어짐
  print(x)


func()

gx = 200 #파일에서 태어남, 파일 안에서는 다 쓸 수 있다. 전역변수
def func2() :
  # gx = gx + 300 #오류남 사용가능 수정 x
  print(gx)


func2()
print(gx)
gx = gx + 300 #오류 없음
print(gx)

#
def func3() :
  global y #먼저 변수 선언을 해준다 스택 공간에 변수를 할당한다.
  # 계속 살아 있는 변수 쓸때 신중하게 메모리 비효율적
  #예) 장바구니, 로그인 유지, 포인트 계속 보이기 등
  y = 300 #함수 안에 선언할 변수를 전역변수로 만들고 싶다.
  y = y - 10
  print( y )

func3() 
print( y )
y = y + 20
print( y )

def func4( ) :
  print( y , "~~")


func4()

#
def func5() :
  global x
  x = 200 #두번째 호풀
  print(x, "~")

x = 100
print(x) #먼저 함수 호출
func5()
print(x) #마지막 호출

#
def cir_area() :
  global r
  result = r * r * 3.14
  return result
def cir_length():
  global r
  result = 2 * 3.14 * r
  return result
r = 10
area = cir_area()
length = cir_length()
print("원의 면적 :%.1f, 원주의 길이 : %.1f"%(area, length))
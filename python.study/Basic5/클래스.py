#클래스 : 설계도( 필드 - 변수, 함수 - 동작)
#객체 object : 클래스를 메모리 올려서 실제 자료 넣어주는 것
#메소드 : 클래스 안에 있는 함수, 동작하기
#필드 : 파이썬에서 속성

#클래스 만들기 (정의)
class Person :
  name = "홍길동"
  list = [] #빈 리스트
  def method1(self) : #self 자기 자신 
    print("메소드임")
  def method2(self, age) : #self 자기 자신 person 클래스 가르킨다
    print("나이는", age)

#클래스를 사용하기
p1 = Person() #객체화 자바식으로 person p1 = new person()
print(p1.name)
p1.list1.append( "aa" )
print(p1.list1)
print(Person.list1)
p1.method1()
p1.method2(25)

#Person.method1() - 오류남
#Person.method2() - 오류남

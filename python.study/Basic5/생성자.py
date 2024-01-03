#생성자
class Members :
  def __init__(self) : # 생성자 _init_
    self.name = None
    self.age = None
    self.gender = None
  def __init__(self, name=None, age=None, gender=None) : # 생성자 _init_
    self.name = name
    self.age = age
    self.gender = gender
  def show_info(self) :
    print("이름 : ", self.name)
    print("나이 : ", self.age )
    print("성별 : ", self.gender)


#객체 행성
m1 = Members("홍길동", 25)
m1.show_info()
m2 = Members("홍길동", 25, True)
m2.show_info()
# m3 = Members("홍길동", 25, True,"a") 생성자의 파라미터가 적으므로 에러 발생
# m3.show_info()
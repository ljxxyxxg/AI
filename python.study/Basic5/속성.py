# 속성 : 자바에서 필드 , 변수

class Student :
  pet = [] #클래스 속성
  def push_pet(self, x) :
    self.pet.append(x)

john = Student() #객체화
john.push_pet("고양이")
print(john.pet)
sally = Student()
sally.push_pet("강아지")
print(sally.pet)

# class Student :
#   def __init__(self) :
#     self.pet = [] #인스턴스 속성, 객체화 할때마다 지워진다.
#   def push_pet(self, x) :
#     set.pet.append(x)

# john = Student() #객체화
# john.push_pet("고양이")
# print(john.pet)
# sally = Student
# sally.push_pet("강아지")
# print(sally.pet)

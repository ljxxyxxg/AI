#나이를 입력 받아서 65세 이상이면 입장료 무료



from datetime import datetime

birth = int(input("태어난 연도는?") ) 
year1 = datetime.today().year
age = int(year1 - birth)
ticket = 2000

if year1 < birth : 
  print(f"올해가{year1}년입니다.")
  print("입력이 잘못되었네요.")
else :

  if age >= 61:
      ticket = 0
      print(f'입장료는 {ticket}입니다.')
  elif 40 <= age <= 60:
    ticket = 1000
    print(f'입장료는 {ticket}입니다.')
  elif 30 <= age <= 39:
      ticket = 1500
      print(f'입장료는 {ticket}입니다.')
  elif 20 <= age <= 29:
      ticket = 2000
      print(f'입장료는 {ticket}입니다.')
  elif 10 <= age <= 19:
      ticket = 2500
      print(f'입장료는 {ticket}입니다.')
  elif age  <= 10:
      ticket = 0
      print(f'입장료는 {ticket}입니다.')
      print(f'당신의 나이는{age}입니다.')




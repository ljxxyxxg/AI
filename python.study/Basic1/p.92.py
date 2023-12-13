#p.92
'''
a = 10
b = 20
print(a + b)

#p.92 2)
c = a + b
print(f"{a}+{b}={c}")

#p.92 3)
print(str(a)+"+"+str(b)+"="+str(c))

#p.92 4)
# fruit = input("첫 번째 과일을 입력하세요")
# fruit2 = input("두 번째 과일을 입력하세요")
# print(f"{fruit}와{fruit2}는 내가 좋아하는 과일이다.")

#p.92 7)
number = input("첫 번째 숫자를 입력하세요.")
number2 = input("두 번째 숫자를 입력하세요.")
divi = number / number2
print("5%d")

#p.93
# kg = input("변환할 킬로그램(kg)은")
# print("-" * 30)
# print("킬로그램 파운드 온스")
# print("-" * 30)
# pound = int(kg) * 2.204623
# ounce = int(kg) * 35.273962
# # print(f"{kg}  {pound}  {ounce}")
# print("%d  %.2f  %.2f"%(int(kg), pound, ounce) )
# print("-"*30)'''
'''
#p.93
phone = input("휴대번호는?")
#방법1) "-" 찾아서 "" 바꾸기
deleteHy = phone.replace("-", "")
print(f'입력된 휴대번호 : {phone}')
print(f'하이픈 삭제된 휴대번호 {deleteHy}')


#방법2) split("-")
deleteHy2 = phone.split("-")
print(deleteHy2[0], deleteHy2[1], deleteHy2[2], sep="")'''

#p.93 2-13
number = "37366366845"
print(number[-2::])

#p.93 2-12
string = "가는 말이 고와야 오는 말이 곱다"
print(string [6:14])
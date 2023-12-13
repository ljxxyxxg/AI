# 온라인 서점의 책 결제 금액
price = 20000
discount = 10
delivery = 3000
pay = price -(price * (discount/100)) + delivery
print(f"책값은 {price}, 할인율 {discount}\% ")
print(f"배송료{delivery}, 결제금액{int(pay)}")

#배송료가 2000원 이상이면 비싸다 아니면 저렴하다



if delivery >= 2000 :
  print ("비싸다")
  delivery = float (3000 * (1 - 0.02))
else :
  print("저렴하다")

print(f"책값은 {price}, 할인율 {discount}% ")
print(f"배송료{delivery}, 결제금액{int(pay)}")


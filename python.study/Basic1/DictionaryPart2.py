# #6-1
# year_sale = {"2016":237, "2017":98, "2018":158, "2019":233, "2020":120}

# for key in year_sale:
#   if year_sale[key]:
#     print("%s년 자동차판매량:%d대"% (key, year_sale[key]))

# #6-2
# year_sale = {"2016":237, "2017":98, "2018":158, "2019":233, "2020":120}
# sm = 0
# for key in year_sale :
#   if year_sale[key] == "2018" or year_sale[key] == "2019" :
#     print("%s냔 자동차 판매량: %d" % (key,year_sale[key]))
#     sm = sm + (year_sale[key])
# print("2년간 자동차 판매량: %d 대" % sm)

# #6-3
# year_sale = {"2016":237, "2017":98, "2018":158, "2019":233, "2020":120}
# sm = 0
# for key in year_sale == "2016" :
#   sm = sm + year_sale[key]
#   print("5년간 총 판매량: %d" % sm)

# avg = sm/len(year_sale) 
# print("5년간 연 평균판매량: %d" % avg)

#심화문제
temp = {"월":15.5, "화":17.0, "수":16.2, "목":12.9, "금":11.0, "토":10.5, "일":13.3}
#s6-1
print("-"*50)
for key in temp :
  print("%3s "%key, end=" ")
print()
print("-"*50)
for key in temp :
  print("%.1f "%temp[key], end=" ")
print()

min = 999
minkey = "월"
sum = 0
for key in temp :
  if min > temp[key] :
    min = temp[key]
    minkey = key 
print( "요일 %s, 최고 기온 : %.1f"%( minkey, min))
avg = sum / len(temp)
print( "일주일간 기온 평균 %.1f"%avg)
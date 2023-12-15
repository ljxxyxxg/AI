#세 정수 중 가장 큰 수를 찾아라
num1 = int(input("첫 번째 정수는?"))
num2 = int(input("두 번째 정수는?"))
num3 = int(input("세 번째 정수는?"))

if num1 > num2 and num1 > num3 :
  largest = num1
elif num2 > num1 and num2 > num3 :
  largest = num2
else :
  largest = num3
print('%d, %d, %d 증에서 가장 큰수는 %d입니다'%(num1, num2, num3, largest))


#세 정수 중에서 가장 작은 수를 찾아라
num1 = int(input("첫 번째 정수는?"))
num2 = int(input("두 번째 정수는?"))
num3 = int(input("세 번째 정수는?"))

if num1 < num2 and num1 < num3 :
  smallest = num1
elif num2 < num1 and num2 < num3 :
  smallestest = num2
else :
  smallestest = num3
print('%d, %d, %d 중에서 가장 작은수는 %d입니다'%(num1, num2, num3, smallestest))


if num1 != largest and num1 != smallest :
  mid = num1
elif num2 !=largest and num2 != smallest :
  mid = num2
else:
  mid = num3
print('%d,%d,%d 중에서 가장중간수는 %d입니다.'%(num1,num2,num3,mid))
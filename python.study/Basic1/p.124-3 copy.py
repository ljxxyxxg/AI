#ver.4



print("1. 더하기" "2. 빼기" "3. 곱하기" "4. 나누기")
3
s = input('계산기 기능을 선택하세요(1/2/3/4): ')
n = int(input('계산할 숫자갯수는?'))
result = 0
first = "y"
while n > 0 :
  num1 = int(input("숫자는?"))
  n = n - 1 
  if s == "1":
    result = 0
    result += num1
  elif s == "2":
    first == "y"
    if first == "y" :
        result = num1
        first = "n"
    else :
      result -= num1  
  elif s == "3":
    result = 1
    result *= num1
  elif s == "4":
    result = 1
    result /= num1
  else :
    print("입력숫자가 잘못되었습니다.")
print(result)

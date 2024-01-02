#                      "a" : append 없으면 추가로 들여쓰기
#                      "w" : 파일이 없으면 생성 있으면 덮어씌어짐    
# f = open("new_file1.txt","a", encoding="utf-8")
# names = ["김길동","이순신" ]

# for name in names :
#   f.write(name +"\n")

# print("파일쓰기완료")
# f.close()


f = open("new_file1.txt","r", encoding="utf-8")

lines = f.readlines()

print("파일 읽기 완료")
print( lines )
f.close()
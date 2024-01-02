#파일 삭제하기
import os

# if os.path.exists("new_file.txt") :
#   os.remove("new_file.txt")
# else:
#   print("삭제하려는 파일이 없습니다")

# #폴더 만들기
# if os.path.exists("Basic4/mm") :
#   print("이미 폴더가 있어요")
# else :
#   os.mkdir("Basic4/mm")
# if os.path.exists("Basic/mm") :
#   os.rename("Basic4/mm", "./Basic4/new_mm")
# else :
#   os.mkdir("Basic4/mm")

if os.path.exists("Basic4/mm") :
  os.rmdir("Basic4/mm")
else :
  print("이미 폴더가 있어요")

#폴더 삭제하기
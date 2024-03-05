import cv2 as cv # opencv 사용
import sys # window 운영체제 사용


img = cv.imread('soccer.jpg')

if img is None:
    sys.exit('파일을 찾을 수 없습니다') 
    
cv.imshow('Image display', img) # 화면 표시하기


cv.waitKey() #멈춰있기
cv.destroyAllWindows() #닫기

# 연습문제 3
img1 = cv.imread('google.png')

if img is None :
    sys.exit('파일을 찾을 수 없습니다')

cv.imshow('Google', img1)

cv.waitKey()
cv.destroyAllWindows()


img2 = cv.imread('naver.png')

if img is None :
    sys.exit('파일을 찾을 수 없습니다')

cv.imshow('Naver', img2)

cv.waitKey()
cv.destroyAllWindows()
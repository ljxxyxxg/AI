# 거짓긍정을 줄이기 위해
# 없는 에지를 그려주는 것
import cv2 as cv

img = cv.imread('soccer.jpg')

gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)

canny1 = cv.Canny(gray, 30, 60) #thigh = tlow 의 2 ~ 3배 권고
canny2 = cv.Canny(gray, 100, 200)

cv.imshow('Original', gray)
cv.imshow('Canny1', canny1)
cv.imshow('Canny2', canny2)

cv.waitKey()
cv.destroyAllWindows()

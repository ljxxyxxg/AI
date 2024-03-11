import cv2 as cv
import numpy as np

img = cv.imread('soccer.jpg')
gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
# 에지 맵에서 임계값 이상인 경계선만을 취한다
canny = cv.Canny(gray, 100, 200)
# 경계선을 찾는다
#findContour(영상, 바깥쪽 경계선만 찾는다, 경계선 표현하는 방식)

contour, hierarchy = cv.findContours(canny, cv.RETR_LIST, cv.CHAIN_APPROX_TC89_L1)


lcontour = []
for i in range(len(contour)):
    if contour[i].shape[0] > 100 :
        lcontour.append(contour[i])
        
# 영상에 경계선을 그린다. -1은 모든 경계선을 그린다.        
cv.drawContours(img, lcontour, -1, (0, 200), 4)

cv.imshow('Original with canny', img)
cv.imshow('Canny', canny)

cv.waitKey()
cv.destroyAllWindows()
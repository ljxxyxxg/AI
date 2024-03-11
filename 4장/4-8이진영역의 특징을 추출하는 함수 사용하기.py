import skimage
import numpy as np
import cv2 as cv

orig = skimage.data.horse()
# 말 영역은 255 배경은 9인 영상으로 변환한다

img = 255-np.uint8(orig)*255
cv.imshow('Horse', img)

contours, hierachy = cv.findContours(img, cv.RETR_EXTERNAL, cv.CHAIN_APPROX_NONE)
img2 = cv.cvtColor(img, cv.COLOR_GRAY2BGR)
cv.drawContours(img2, contours, -1, (255,0,255), 2)
cv.imshow('Hores with contour', img2)

contour = contours[0]
m = cv.moments(contour)
area = cv.contourArea( contour )
cx, cy = m['m10']/m['m00'], m['m01']/m['m00']
perimeter = cv.arcLength(contour, True) # 둘레 길이 계산
roundness = (4.0*np.pi*area) / (perimeter * perimeter)
print('면적=', area, '\n중점 = (',cx,',',cy,')','\n둘레=', perimeter,'\n둥근정도=',roundness)

img3 = cv.cvtColor(img,cv.COLOR_GRAY2BGR)

contour_approx = cv.approxPolyDP(contour, 8, True)
cv.drawContours(img3,[ contour_approx], -1,(0,255,0),2)

hull = cv.convexHull(contour)
hull = hull.reshape(1, hull.shape[0], hull.shape[2])

cv.drawContours(img3,hull,-1,(0,0,255),2)

cv.imshow('Horse with line segments and convex hull', img3)

cv.waitKey()
cv.destroyAllWindows()
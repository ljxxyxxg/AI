#오츄 알고리즘 binary.py
#명암 영상을 이진화 영상으로 바꾸기
#용량을 줄이고 경계선 명확히 하기 위해서
#오츄 알고리즘 : 형식 T (임계값)을 찾아서 T보다 크면 1, 작으면 0

import cv2 as cv
import sys

img = cv.imread('soccer.jpg')
t, bin_img = cv.threshold(img[:,:,2], 0, 255, cv.THRESH_BINARY + cv.THRESH_OTSU)
print('오츄알고리즘이 찾은 최적 임계값',  t)

cv.imshow('R channel', img[:,:, 2])
cv.imshow('R channel binarization', bin_img)

cv.waitKey()
cv.destroyAllWindows()

#최적화 문제 방법
# 낱낱 탐색 알고리즘 : 다구하기 , 현실성 없다
# 스네이크 탐욕 알고리즘 : 경계선 최대값이 있는 것 선택, 고전 방법 사용
# 역전파 알고리즘 : 신경망, 딥러닝 방법
import cv2 as cv
import sys
# img = cv.imread('soccer.jpg')
# if img is None:
#     sys.exit('파일을 찾을 수 없습니다.')
    
    
# gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
# hsv = cv.cvtColor(img, cv.COLOR_BGR2HSV)
# gray_small = cv.resize(gray, dsize = (0,0), fx=0.5, fy=0.5)
# img_small = cv.resize(img, dsize = (0,0), fx=0.6, fy=0.7)



# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray_small.jpg', gray_small)
# cv.imwrite('soccer_hsv.jpg', hsv)
# cv.imwrite('soccer_img_small.jpg', img_small)


# cv.imshow('Color image', img)
# cv.imshow('Gray Image', gray)
# cv.imshow('Gray image small', gray_small)
# cv.imshow('Hsv image', hsv)
# cv.imshow('image small', img_small)



# cv.waitKey()
# cv.destroyAllWindows()


# 연습문제 4
# =============================================================================
# img1 = cv.imread('soccer.jpg')
# if img is None:
#     sys.exit('파일을 찾을 수 없습니다.')
#     
# num1 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num2 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num3= cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num4 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num5 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num6 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num7 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num8 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num9 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# num10 = cv.cvtColor(img1, cv.COLORMAP_AUTUMN)
# 
# num1 = cv.resize(img1, dsize = (0,0), fx=0.1, fy=0.1)
# num2 = cv.resize(img1, dsize = (0,0), fx=0.2, fy=0.2)
# num3 = cv.resize(img1, dsize = (0,0), fx=0.3, fy=0.3)
# num4 = cv.resize(img1, dsize = (0,0), fx=0.4, fy=0.4)
# num5 = cv.resize(img1, dsize = (0,0), fx=0.5, fy=0.5)
# num6 = cv.resize(img1, dsize = (0,0), fx=0.6, fy=0.6)
# num7 = cv.resize(img1, dsize = (0,0), fx=0.7, fy=0.7)
# num8 = cv.resize(img1, dsize = (0,0), fx=0.8, fy=0.8)
# num9 = cv.resize(img1, dsize = (0,0), fx=0.9, fy=0.9)
# num10 = cv.resize(img1, dsize = (0,0), fx=0.10, fy=0.10)
# 
# 
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# cv.imwrite('soccer_gray.jpg', img1)
# 
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# cv.imshow('Color image', img1)
# 
# cv.waitKey()
# cv.destroyAllWindows()
# 
# =============================================================================
#두번째 방법 반복문
img2 = cv.imread('soccer.jpg')
for i in [0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0]:
    img_small_size = cv.resize(gray, dsize =(0,0), fx = i, fy = i)
    cv.imshow('color big image', imag_small_size)

    cv.waitKey()
    cv.destroyAllWindows()






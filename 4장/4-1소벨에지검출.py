import cv2 as cv

img = cv.imread('soccer.jpg')
gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)


# x 방향의 연산을 적용(경계선 sobel 함수 사용)
# cv.Sobel( 영상, 32비트실스맵으로 저장, x방향연산자 사용, 3x3 크기)
grad_x = cv.Sobel( gray, cv.CV_32F, 1, 0, ksize=3)
# cv.Sobel( 영상, 32비트실스맵으로 저장, y방향연산자 사용, 3x3 크기)
grad_y = cv.Sobel( gray, cv.CV_32F, 0, 1, ksize=3)

# 음수가 포함된 맵에 절대값을 취해 양수로 변환한다.
# convertScaleAbs() 8비트형인 CV_8U(numpy의 uint8과 같음)

sobel_x = cv.convertScaleAbs( grad_x )
sobel_y = cv.convertScaleAbs( grad_y )


# sobel_x와 sobel_y에 0.5(임의로 변경하면서 고를 수 있음)를 곱해서 더하여 0을 더함
# 즉 sobel_x * 0.5 + sobel_y * 0.5 + 0한 것임
edge_strength = cv.addWeighted(sobel_x, 0.5, sobel_y, 0.5, 0)

cv.imshow('Original', gray)
cv.imshow('Sobelx', sobel_x)
cv.imshow('Sobely', sobel_y)
cv.imshow('edge strength', edge_strength)

cv.waitKey()
cv.destroyAllWindows()



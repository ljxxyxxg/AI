import cv2 as cv

img = cv.imread('mot_color70,jpg')
gray = cv.cvtColor( img, cv.COLOR_BGR2GRAY)

sift = cv.SIFT_create(nfeatures=0, nOctaveLayer=3, contrastThreshold=0.04, edgeThreshold=10, sigma=1.6)
kp, des = sift.detectAndCompute(gray, None)


gray = cv.drawKeypoints(gray, kp, None, flags=cv.DrawMatchesFlags_DRAW_RICH_KEYPOINTS)
cv.imshow('sift', gray)

k = cv.waitKey()
cv.destroyAllWindows()
















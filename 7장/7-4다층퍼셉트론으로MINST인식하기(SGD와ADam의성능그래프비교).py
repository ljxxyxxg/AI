import numpy as np
import tensorflow as tf
import tensorflow.keras.datasets as ds
import matplotlib.pyplot as plt

from tensorflow.keras.models import Sequential #학습순서 순서대로
from tensorflow.keras.layers import Dense #층
from tensorflow.keras.optimizers import SGD, Adam #학습법


# 1단계 데이터 준비(1차원으로 준비)
(x_train, y_train),(x_test, y_test) = ds.mnist.load_data()
x_train = x_train.reshape(60000, 784)
x_test = x_test.reshape(10000, 784)
x_train = x_train.astype(np.float32) / 255.0
x_test = x_test.astype(np.float32) / 255.0
y_train = tf.keras.utils.to_categorical( y_train, 10)
y_test = tf.keras.utils.to_categorical( y_test, 10)

# 2단계 모델을 선택, 신경망 구조 설계
mlp_SGD = Sequential()
mlp_SGD.add( Dense(units = 512, activation = 'tanh', input_shape = (784,)))
mlp_SGD.add( Dense(units = 10, activation = 'softmax'))

# 3단계 학습한다
mlp_SGD.compile(loss = 'MSE', optimizer=SGD(learning_rate = 0.01),
            metrics = ['accuracy'])
hist_SGD = mlp_SGD.fit(x_train, y_train, batch_size = 128, epochs =50,
                  validation_data=(x_test, y_test), verbose=2)


print('SGD정확률', mlp_SGD.evaluate( x_test, y_test, verbose=0)[1]*100)

# -----------------------------------------------------------------------------
# Adam 모델

# 2단계 모델을 선택, 신경망 구조 설계
mlp_Adam = Sequential()
mlp_Adam.add( Dense(units = 512, activation = 'tanh', input_shape = (784,)))
mlp_Adam.add( Dense(units = 10, activation = 'softmax'))

# 3단계 학습한다
mlp_Adam.compile(loss = 'MSE', optimizer=Adam(learning_rate = 0.001),
            metrics = ['accuracy'])
hist_Adam = mlp_Adam.fit(x_train, y_train, batch_size = 128, epochs =50,
                  validation_data=(x_test, y_test), verbose=2)


print('Adam정확률', mlp_Adam.evaluate( x_test, y_test, verbose=0)[1]*100)

plt.plot(hist_SGD.history['accuracy'], 'r--')
plt.plot(hist_SGD.history['val_accuracy'], 'r')
plt.plot(hist_Adam.history['accuracy'], 'b--')
plt.plot(hist_Adam.history['val_accuracy'], 'b')
plt.title('Comparision of SGD and Adam optimizer')
plt.ylim((0.7 ,1.0))
plt.xlabel('epochs')
plt.ylabel('accuracy')
plt.legend(['train_SGD','val_SGD', 'train_Adam','val_Adam'])
plt.grid()
plt.show()
         

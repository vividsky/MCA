import numpy as np
matrix1=np.matrix('[1,2,3;8,3,2;6,4,5]')

matrix2=([3,2,1],
         [4,3,2],
         [5,4,3])

matrix3=np.matrix([2,5,6])

matrix4=([9,8,7])

matrix_multiplication=np.dot(matrix1,matrix2)

trace=np.trace(matrix1)

multiply_elementwise=np.multiply(matrix1,matrix2)

transpose1=np.transpose(matrix1)
transpose3=np.transpose(matrix3)

determinant=np.linalg.det(matrix1)
print(determinant)

outer_product=np.outer(matrix3,matrix4)

print(type(matrix1),matrix1.dtype,
      transpose1,
      transpose3)


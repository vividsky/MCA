import numpy as np

A=np.array([
    [1,2,3],
   [2,3,8],
   [3,4,5]
  ])
B=np.array([
    [1,1,1],
    [2,2,2],
    [3,3,3]
  ])
C=np.array([[1],[2],[3]])
D=np.array([2,2,2])
print('matrix A is:\n',A)
print('matrix B is:\n',B)
print('matrix C is:\n',C)
print('matrix D is:\n',D)

#Multiplication of two matrices:
ques1=np.array([[sum(a*b for a,b in zip(A_row,B_column)) for B_column in zip(*B)] for A_row in A])
print('ques1: multiplication of two matrices is:\n',ques1)

#Sum of the diagonal elements of a matrix:
ques2=[sum(A[i][i] for i in range(len(A)))]
print('ques2: sum of diagonal entries of a matrix A is:\n',ques2)

#Element-wise matrix multiplication:
ques3=np.array([[a*b for a,b in zip(A[i],B[i])] for i in range(len(A))])
print('ques3: element-wise matrix mult of a matrices is:\n',ques3)

#Outer product of two given Vectors C and D:
ques4=np.outer(C,D)
print('ques4: Outer product of C and D is:\n',ques4)

#Determinant of a given square matrix:
ques5=np.linalg.det(A)
print('ques5: determinant of a square matrix A is:\n',int(ques5))

  


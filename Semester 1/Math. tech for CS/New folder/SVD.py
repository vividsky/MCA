#Singular Value Decomposition
import numpy as np
#defining a matrix
A=np.array([[3,2,2],[2,3,-2]])
print("The Original matrix:")
print(A)
#SVD
U,s,VT=np.linalg.svd(A)
print(U)
print(np.diag(s)) #the s vector shows only the singular values 
print(VT)
#converting s into a diagonal matrix of order m*n(here 3*2)
#if A is a square matrix we just simply make diagonal matrix of s 
sigma=np.zeros((A.shape[0],A.shape[1]))
#populate sigma with n*n diagonal matrix
sigma[:A.shape[0],:A.shape[0]]=np.diag(s)
print(sigma)
#reconstruct A
B=U.dot(sigma.dot(VT))
print("The  matrix after reconstruction:")
print(B) #verifing SVD

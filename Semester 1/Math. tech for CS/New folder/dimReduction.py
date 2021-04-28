#Dimensionality Reduction of a matrix via Singular Value Decomposition
import numpy as np
#defining a matrix
A=np.array([[1,2,3,4,5,6,7,8,9,10],[11,12,13,14,15,16,17,18,19,20],[21,22,23,24,25,26,27,28,29,30]])
print("The Original matrix:")
#printing matrix
print(A)
#Singular value decomposition
U,s,VT=np.linalg.svd(A)
#creating a m*n sigma matrix
sigma=np.zeros((A.shape[0],A.shape[1]))
#populating n*n part of sigma with singular values
sigma[:A.shape[0],:A.shape[0]]=np.diag(s)
n_elts = 2
sigma=sigma[:,:n_elts]
VT=VT[:n_elts,:]
#reconstruct of A
B=U.dot(sigma.dot(VT))
print("The reconstructed matrix using k(here k=2) singular values:")
print(B)
#calculating frobenius norm for k=3 singluar values
dis=np.linalg.norm(A-B,"fro")
print(dis)
#transform
T=U.dot(sigma) #T = U.sigmak
print("The first transform is:")
print(T)
T=A.dot(VT.T) #T = A.Vk
print("The second transform is:")
print(T)
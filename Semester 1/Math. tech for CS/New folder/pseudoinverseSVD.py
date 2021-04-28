#PseudoInverse of a matrix via Singular Value Decomposition
#We can do inverse directly if matrix is n*n, where pseudoinverse is helpful when matrix is n*m where m!=n
import numpy as np
#defining a matrix
A=np.array([[1,2,3],[3,4,5]])
print("The Original matrix:")
print(A)
#SVD
U,s,VT=np.linalg.svd(A)
#Here it gives s as a single dimension array,and we convert it into diagonal matrix using diag
#inverse of s
inv_s = np.linalg.inv(np.diag(s))
#create m*n sigma inverse matrix of size of A
sigma_inverse=np.zeros(A.shape)
#A.shape[0]=2 and A.shape[1]=3
sigma_inverse[:A.shape[0],:A.shape[0]]=inv_s #shape[i] where i is smaller shape of 0 or 1
#calculating pseudo inverse i.e. A^+ = V.Sigma^+.UT
B=np.transpose(VT).dot(np.transpose(sigma_inverse).dot(np.transpose(U)))
print("The PseudoInverse of A is(By calculating):")
print(B)
#verifying with pinv
invA=np.linalg.pinv(A)
print("The PseudoInverse of A is(By pinv built-in function):")
print(invA)

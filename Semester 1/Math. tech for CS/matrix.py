import numpy as np
num_of_row = int(input('Number of rows of square matrices: '))
print('Give input value for two square matrices ,matrix1 and matrix2')
def main():
   matrix=[]
   for i in range(num_of_row):
      a = []
      for j in range(num_of_row):
         a.append(int(input(f'{i+1} row {j+1} column ele: ')))
      matrix.append(a)    
   matrix=np.array(matrix)
   return matrix

matrix1=main()
print(f'\nmatrix1 is: \n',matrix1)
matrix2=main()
print(f'\nmatrix2 is: \n',matrix2)   

def trace(matrix1):
   _trace= sum(matrix1[i][i] for i in range(num_of_row))
   return f'Trace of the given matrix1 is:\n{_trace}'
print(trace(matrix1))

def h_prod(matrix1,matrix2):
   _h_product=[]
   for i in range(num_of_row):
      a=[]
      for j in range(num_of_row):
         a.append(matrix1[i][j]*matrix2[i][j])
      _h_product.append(a)
   print('\nHadamard elementwise product of matrix1 and matrix2 is:')      
   return np.array(_h_product)
print(h_prod(matrix1,matrix2))

def prod(matrix1,matrix2):
   _product=[]
   for i in range(num_of_row):
      a=[]
      for j in range(num_of_row):
         ele=sum(matrix1[i][k]*matrix2[k][j] for k in range(num_of_row))
         a.append(ele)
      _product.append(a)
   print('\nproduct of matrix1 and matrix2 is:')      
   return np.array(_product)
print(prod(matrix1,matrix2))

def outer_product(matrix1,matrix2):
   _sum=[]
   for i in range(num_of_row):
      a=[]
      for j in range(num_of_row):
         b=[]
         for k in range(num_of_row):
            ele=matrix1[j][i]*matrix2[i][k]
            b.append(ele)
         a.append(b)
      _sum.append(a)
   _outer_product=_sum[0]  
   for i in range(1,num_of_row): 
      for j in range(num_of_row):
         _outer_product[j]=list(map(lambda a,b:a+b,_sum[i][j],_outer_product[j]))
   print('\nOuter product of matrix1 and matrix2 is:')
   return np.array(_outer_product)      
print(outer_product(matrix1,matrix2))

def determinant(matrix1):
   print('\nDeterminant of Matrix1 is: ')
   return round(np.linalg.det(matrix1),1)
print(determinant(matrix1))   
  










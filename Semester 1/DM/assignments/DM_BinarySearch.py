def RecSearch(a,x):
   mid=len(a)//2
   if not len(a):
      return False
   elif x==a[mid]:
      return True,f'Index of {x} is {user_list.index(x)}'
   
   else:
      if x>a[mid]:
         return RecSearch(a[mid+1:],x)
      else:
         return RecSearch(a[:mid],x)
user_list=sorted(list(map(int,input('list elts with space:').strip().split())))

x = int(input('ele you want to search in list:').strip())
print(RecSearch(user_list,x))  


         
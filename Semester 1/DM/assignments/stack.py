class Stack:
    '''
    Stack class

    Attributes:
    -----------
    __stack_list: List container to store stack elements, Private Attribute.
    __size: size of the stack, Private Attribute.

    Methods:
    --------
    push: Pushes an item on the top of the stack
    pop: Pops the item from the top of the stack
    peek: Returns the item from the top of the stack
    '''
    def __init__(self,n):
        '''
        Constructor for the Stack class.

        Attributes:
        ----------
        n <int> : size of the stack.
        '''
        self.__stack_list = []
        self.__size = n

    def __len__(self):
        '''
        Returns the length of the stack.
        '''
        return len(self.__stack_list)

    def __str__(self):
        '''
        Returns the string representation of the stack.
        '''
        return f"{self.__stack_list} ,current length of stack is {len(self)} and size of the stack {self.__size}"
    
    def push(self,ele):
        '''
        Pushes an element on the top of the stack.
        Raises an OverflowError if the stack is full.

        Arguments:
        ----------
        ele : Element to be pushed on the top of the stack
        '''
        if len(self) >= self.__size:
            raise TypeError("Overflow Error: Stack is Full, can't push")

        self.__stack_list.append(ele)

    def pop(self):
        '''
        Pops an element from the top of the stack.
        Raises an UnderflowError if the stack is empty.
        '''
        if not len(self):
            raise TypeError("Underflow Error: Stack is empty, can't pop")

        return self.__stack_list.pop()

    def peek(self):
        '''
        Returns an element from the top of the stack.
        Raises an UnderflowError if the stack is empty.
        '''
        if not len(self):
            raise TypeError("Underflow Error: Stack is empty")
 
        return self.__stack_list[-1]
# stack = Stack(3)
# print(len(stack))
# stack.push(1)
# print(len(stack))
# stack.push(2)
# stack.push(3)
# stack.push(4)
# print(len(stack))
# stack.pop()
# print(len(stack))
# print(stack.peek())
# print(stack)


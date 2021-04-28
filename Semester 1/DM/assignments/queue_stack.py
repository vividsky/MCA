class Queue:
    '''
    CircularQueue class
    
    Methods:
    --------
    isempty - check if queue is empty or not
    isfull  - check if queue is full or not
    enqueue - Insert an element in the queue at back
    dequeue - Remove an element from the queue at front
    __str__ - Displays the queue
    '''
    def __init__(self,n):
        '''
        Constructor for CircularQueue
        
        Attributes:
        ----------
        n = size of queue
        '''
        self.__size = n
        self.__my_queue = list(range(self.__size))
        self.__front = -1
        self.__back = -1
     
    def isempty(self):
        '''
        check if queue is empty or not
        
        Returns
        -------
        True: if queue is empty
        False:if queue is not empty
        '''
        return self.__front == -1
        
    def isfull(self):
        '''
        check if queue is full or not
        
        Returns
        -------
        True: if queue is full
        False:if queue is not full
        '''
        return self.__front == (self.__back+1) % self.__size

    def enqueue(self,ele):
        '''
        Insert an element in the queue at back if queue is not full else raises Exception

        Attribute:
        ----------
        ele - element to be enqueued

        '''
        if self.isfull():
            raise Exception('Queue Overflow')
        else:
            if self.__front == -1:
                self.__front = 0 
            self.__back = (self.__back+1) % self.__size
            self.__my_queue[self.__back] = ele
            
    def dequeue(self):
        '''
        Dequeues an element from the queue front if queue is not empty else raises Exception

        Returns:
        --------
        element dequeued
        
        '''
        if self.isempty():
            raise Exception('Queue Underflow')
        else:
            r = self.__my_queue[self.__front]
            if self.__front == self.__back:
                self.__front = self.__back = -1
            else:
                self.__front = (self.__front+1) % self.__size
            return r
            
    def __str__(self):
        '''
        Displays queue
        '''
        if self.__front <= self.__back:
            return str(self.__my_queue[self.__front:self.__back+1])
        else:
            return str(self.__my_queue[self.__front:self.__size] + self.__my_queue[0:self.__back+1])

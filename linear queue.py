# a linear queue and circular queue
class linearQueue:
    def __init__(self, capacity):
        self.capacity = capacity
        self.queue = []

    def enqueue(self, item):
        if len(self.queue) < self.capacity:
            self.queue.append(item)
        else:
            print("Queue is full")

    def dequeue(self):
        if self.queue:
            return self.queue.pop(0)
        else:
            print("Queue is empty")

    def display(self):
        print("Queue:", self.queue)
        
class CircularQueue:
    def __init__(self, capacity):
        self.capacity = capacity
        self.queue = [None] * capacity
        self.front = self.rear = -1

    def is_empty(self):
        return self.front == -1

    def is_full(self):
        return (self.rear + 1) % self.capacity == self.front

    def enqueue(self, item):
        if self.is_full():
            print("Queue is full")
        elif self.is_empty():
            self.front = self.rear = 0
            self.queue[self.rear] = item
        else:
            self.rear = (self.rear + 1) % self.capacity
            self.queue[self.rear] = item

    def dequeue(self):
        if self.is_empty():
            print("Queue is empty")
            return None
        elif self.front == self.rear:
            item = self.queue[self.front]
            self.front = self.rear = -1
            return item
        else:
            item = self.queue[self.front]
            self.front = (self.front + 1) % self.capacity
            return item

    def display(self):
        if self.is_empty():
            print("Queue is empty")
        elif self.front <= self.rear:
            print("Queue:", self.queue[self.front : self.rear + 1])
        else:
            print("Queue:", self.queue[self.front :] + self.queue[: self.rear + 1])


# write a python or java implementation of a liner queue, circular queue using stack

import queue

class MyQueue:
    def init(self):
        self.queue = queue.Queue()

    def push(self, value):
        self.queue.put(value)

    def removes(self):
        if not self.queue.empty():
            return self.queue.get()
        else:
            print("Queue is empty")
            return None

    def listempty(self):
        if self.queue.empty():
            print("Queue is empty")
            return True
        else:
            print("Queue is not empty")
            return False
    if
    

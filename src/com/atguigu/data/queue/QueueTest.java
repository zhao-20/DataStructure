package com.atguigu.data.queue;

public class QueueTest {
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(4);
		queue.addQueue(3);
		queue.addQueue(4);
		queue.addQueue(5);
		queue.addQueue(6);
		queue.getAllQueue();
	}
}

class ArrayQueue{
	private int maxSize; //数组最大容量
	private int front; //队列头
	private int rear; //队列尾
	private int[] arr;  //该数组存放数据模拟队列
	
	
	public ArrayQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		front=-1;
		rear=-1;
		arr=new int[maxSize];
	}
	
	//判断队列是否满
	public boolean isFull() {
		return rear==maxSize-1;
	}
	
	//判断是否为空
	public boolean isEmpty() {
		return rear==front;
	}
	
	//添加数据到队列
	public void addQueue(int n) {
		if(isFull()) {
			throw new RuntimeException("队列已满，无法添加数据");
		}
		
		rear++;
		arr[rear]=n;
	}
	
	//获取队列数据  出队列
	public int getQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列已空，无法获取数据");
		}
		
		front++;
		return arr[front];
	}
	//显示队列所有数据
	public void getAllQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列已空，无法获取数据");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
	
	//显示队列头数据
	public int headQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列为空，没有数据");
		}
		
		return arr[front+1];
	}
	
}

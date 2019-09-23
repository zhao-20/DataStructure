package com.atguigu.data.queue;

public class QueueTest2 {
	public static void main(String[] args) {
		 CircleArrayQueue queue = new CircleArrayQueue(5);
		queue.addQueue(3);
		queue.addQueue(4);
		queue.addQueue(5);
		queue.addQueue(6);
		queue.getAllQueue();
		System.out.println(queue.size());
	}
}

class CircleArrayQueue{
	private int maxSize; //数组最大容量
	private int front; //队列头
	private int rear; //队列尾
	private int[] arr;  //该数组存放数据模拟队列
	
	
	public CircleArrayQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		front=0;
		rear=0;
		arr=new int[maxSize];
	}
	
	//判断队列是否满
	public boolean isFull() {
		return (rear+1)%maxSize==front ;
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
		//直接将数据加入
		arr[rear]= n;
		//
		rear=(rear+1)%maxSize;
	}
	
	//获取队列数据  出队列
	public int getQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列已空，无法获取数据");
		}
		
		//这里需要分析出front是指向队列的第一个元素
		 int value=arr[front];
		 front=(front+1)%maxSize;
		 return value;
	}
	//显示队列所有数据
	public void getAllQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列已空，无法获取数据");
		}
		//从front开始遍历，遍历多个元素
		for(int i=front;i<front+size();i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
	//求出当前队列数据有效个数
	public int size() {
		return (rear+maxSize-front)%maxSize;
	}
	
	//显示队列头数据
	public int headQueue() {
		if(isEmpty()) {
			throw new RuntimeException("队列为空，没有数据");
		}
		
		return arr[front];
	}
	
}

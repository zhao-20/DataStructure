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
	private int maxSize; //�����������
	private int front; //����ͷ
	private int rear; //����β
	private int[] arr;  //������������ģ�����
	
	
	public CircleArrayQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		front=0;
		rear=0;
		arr=new int[maxSize];
	}
	
	//�ж϶����Ƿ���
	public boolean isFull() {
		return (rear+1)%maxSize==front ;
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear==front;
	}
	
	//������ݵ�����
	public void addQueue(int n) {
		if(isFull()) {
			throw new RuntimeException("�����������޷��������");
		}
		//ֱ�ӽ����ݼ���
		arr[rear]= n;
		//
		rear=(rear+1)%maxSize;
	}
	
	//��ȡ��������  ������
	public int getQueue() {
		if(isEmpty()) {
			throw new RuntimeException("�����ѿգ��޷���ȡ����");
		}
		
		//������Ҫ������front��ָ����еĵ�һ��Ԫ��
		 int value=arr[front];
		 front=(front+1)%maxSize;
		 return value;
	}
	//��ʾ������������
	public void getAllQueue() {
		if(isEmpty()) {
			throw new RuntimeException("�����ѿգ��޷���ȡ����");
		}
		//��front��ʼ�������������Ԫ��
		for(int i=front;i<front+size();i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
	//�����ǰ����������Ч����
	public int size() {
		return (rear+maxSize-front)%maxSize;
	}
	
	//��ʾ����ͷ����
	public int headQueue() {
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ�û������");
		}
		
		return arr[front];
	}
	
}

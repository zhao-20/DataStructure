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
	private int maxSize; //�����������
	private int front; //����ͷ
	private int rear; //����β
	private int[] arr;  //������������ģ�����
	
	
	public ArrayQueue(int arrMaxSize) {
		maxSize=arrMaxSize;
		front=-1;
		rear=-1;
		arr=new int[maxSize];
	}
	
	//�ж϶����Ƿ���
	public boolean isFull() {
		return rear==maxSize-1;
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
		
		rear++;
		arr[rear]=n;
	}
	
	//��ȡ��������  ������
	public int getQueue() {
		if(isEmpty()) {
			throw new RuntimeException("�����ѿգ��޷���ȡ����");
		}
		
		front++;
		return arr[front];
	}
	//��ʾ������������
	public void getAllQueue() {
		if(isEmpty()) {
			throw new RuntimeException("�����ѿգ��޷���ȡ����");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
	
	//��ʾ����ͷ����
	public int headQueue() {
		if(isEmpty()) {
			throw new RuntimeException("����Ϊ�գ�û������");
		}
		
		return arr[front+1];
	}
	
}

package com.atguigu.data.array;

import java.util.function.IntToDoubleFunction;
/*dasasd*/
public class ArrayTest {
	public static void main(String[] args) {
		//���ö�ά����
		int [][] cherryArray=new int[11][11];
		cherryArray[1][2]=1;
		cherryArray[2][3]=2;
		cherryArray[3][4]=2;
		for (int[] is : cherryArray) {
			for (int is2 : is) {
				System.out.printf("%d\t",is2);
			}
			System.out.println();
		}
		
		//�鿴�м�����
		int sum=0;
		for(int i=0;i<11;i++) {
			for (int j = 0; j < cherryArray.length; j++) {
				if(cherryArray[i][j] !=0) {
					sum++;
				}
			}
		}
		
		//����ϡ������
		int squareArr[][]=new int[sum+1][3];
		
		int count=0;
		squareArr[0][0]=11;
		squareArr[0][1]=11;
		squareArr[0][2]=sum;
		for(int i=0;i<11;i++) {
			for (int j = 0; j < cherryArray.length; j++) {
				if(cherryArray[i][j] !=0) {
					count++;
					squareArr[count][0]=i;
					squareArr[count][1]=j;
					squareArr[count][2]=cherryArray[i][j];
				}
			}
		}
		System.out.println("ϡ��������ʾ��");
		for (int[] is : squareArr) {
			for (int is2 : is) {
				System.out.printf("%d\t",is2);
			}
			System.out.println();
		}
		
		//��ϡ������ת��Ϊ��ά����
		int cherryArray2[][]=new int[squareArr[0][0]][squareArr[0][1]];
		for(int i=1;i<squareArr.length;i++) {
			cherryArray2[squareArr[i][0]][squareArr[i][1]]=squareArr[i][2];
			}
		System.out.println("�ָ���Ķ�ά����");
		for (int[] is : cherryArray2) {
			for (int is2 : is) {
				System.out.printf("%d\t",is2);
			}
			System.out.println();
		}
		}
	}


package day01;

import java.util.Random;
import java.util.Scanner;

public class demo1 {
	/*
	 * * ���ݸ�������alt+/ main������main,Ȼ��alt+/,�س� �����䣺syso,Ȼ��alt+/,�س�
	 */
	public static void test() {
		byte b = 10;
		System.out.println(10);
		System.out.println(b);

	}

	public static void test1() {
		byte b = 10;
		byte a = 5;
		int c;
		c = a + b;
		c += 1;
		System.out.println(10);
		System.out.println(b);
		System.err.println("c:" + c);

	}

	public static void test2() {
		int a = 10;
		char ch = 'a';
		System.out.println(a + ch);
		System.out.println("----------------");

		// �ַ������ӷ�
		System.out.println("hello" + "world");
		System.out.println("hello" + 10);
		System.out.println("hello" + 10 + 20);
		System.out.println(10 + 20 + "hello");

	}

	public static void test3() {
		int a = 10;
		System.out.println("a:" + a);

		// a++;
		// a--;
		// ++a;
		// --a;
		// System.out.println("a:"+a);

		int b = a++;
		// int c = ++a;
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

	public static void test4() {
		// �������
		int a = 3;
		int b = 4;
		int c = 5;

		// &&�߼���
		System.out.println((a > b) && (a > c)); // false && false
		System.out.println((a < b) && (a > c)); // true && false
		System.out.println((a > b) && (a < c)); // false && true
		System.out.println((a < b) && (a < c)); // true && true
		System.out.println("------------");

		// ||�߼���
		System.out.println((a > b) || (a > c)); // false || false
		System.out.println((a < b) || (a > c)); // true || false
		System.out.println((a > b) || (a < c)); // false || true
		System.out.println((a < b) || (a < c)); // true || true
		System.out.println("------------");

		// !�߼���
		System.out.println((a > b));
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
	}

	public static void test5() {
		// ������������
		int a = 10;
		int b = 20;

		int c = (a > b) ? a : b;
		System.out.println("c:" + c);

	}

	public static void test6() {
		Random b = new Random();
		int a = b.nextInt(100);
		System.out.println(a);
		System.out.println("������һ����");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int c = a > x ? a : x;

		System.out.println(c);

		sc.close();

	}

	public static void test7() {
		// ��������¼�����
		Scanner sc = new Scanner(System.in);

		// ������ʾ
		System.out.println("������ѧ���Ŀ��Գɼ���");
		int score = sc.nextInt();

		// if����ʽ3ʵ��

		/*
		 * if(score>=90 && score<=100) { System.out.println("����"); }else if(score>=80 &&
		 * score<90) { System.out.println("��"); }else if(score>=70 && score<80) {
		 * System.out.println("��"); }else if(score>=60 && score<70) {
		 * System.out.println("����"); }else { System.out.println("������"); }
		 */

		// ͨ�����ݵĲ��ԣ����Ƿ��ֳ��򲻹��Ͻ���δ����Ƿ����ݵ��ж�
		if (score > 100 || score < 0) {
			System.out.println("������ĳɼ�����");
		} else if (score >= 90 && score <= 100) {
			System.out.println("����");
		} else if (score >= 80 && score < 90) {
			System.out.println("��");
		} else if (score >= 70 && score < 80) {
			System.out.println("��");
		} else if (score >= 60 && score < 70) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		sc.close();
	}

	public static void test8() {
		int[] arr = new int[3];
		int[] a = { 1, 2, 3 };
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			System.err.println("a:" + a[i]);

			System.out.println(arr[i] + 10);
		}
	}

	public static void test9() {
		// ����һ������Ϊ6������
		int[] arr = new int[6];

		// ��ί��ֵ����ݲ��ü���¼��ʵ��
		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < arr.length; x++) {
			System.out.println("�������" + (x + 1) + "����ί�����ķ�����");
			int score = sc.nextInt();
			arr[x] = score;
		}

		// д�����ȡ��������ֵ(��߷�)
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}

		// д�����ȡ�������Сֵ(��ͷ�)
		int min = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}

		// д�����������е�Ԫ�غ�(�ܷ�)
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}

		// ƽ���֣�(�ܷ�-��߷�-��ͷ�)/(arr.length-2)
		int avg = (sum - max - min) / (arr.length - 2);

		// ���ƽ���ּ���
		System.out.println("��ѡ�ֵ����յ÷��ǣ�" + avg);
		sc.close();
	}

	public static int test10() {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		int a1 = a.nextInt();
		a.close();
		Scanner b = new Scanner(System.in);
		int b1 = b.nextInt();
		b.close();
		int c = a1 + b1;
		return c;
		
	
	}

	public static int test10(int a1, int b1) {
		// TODO Auto-generated method stub

		int c = a1 + b1;
		return c;

	}

	public static void main(String[] args) {
		Dog a = new Dog();
		a.age = 90;
		a.name = "xiaohuang";
		System.out.println(a);

	}
}
package day01;

import java.util.Random;
import java.util.Scanner;

public class demo1 {
	/*
	 * * 内容辅助键：alt+/ main方法：main,然后alt+/,回车 输出语句：syso,然后alt+/,回车
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

		// 字符串做加法
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
		// 定义变量
		int a = 3;
		int b = 4;
		int c = 5;

		// &&逻辑与
		System.out.println((a > b) && (a > c)); // false && false
		System.out.println((a < b) && (a > c)); // true && false
		System.out.println((a > b) && (a < c)); // false && true
		System.out.println((a < b) && (a < c)); // true && true
		System.out.println("------------");

		// ||逻辑或
		System.out.println((a > b) || (a > c)); // false || false
		System.out.println((a < b) || (a > c)); // true || false
		System.out.println((a > b) || (a < c)); // false || true
		System.out.println((a < b) || (a < c)); // true || true
		System.out.println("------------");

		// !逻辑非
		System.out.println((a > b));
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
	}

	public static void test5() {
		// 定义两个变量
		int a = 10;
		int b = 20;

		int c = (a > b) ? a : b;
		System.out.println("c:" + c);

	}

	public static void test6() {
		Random b = new Random();
		int a = b.nextInt(100);
		System.out.println(a);
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int c = a > x ? a : x;

		System.out.println(c);

		sc.close();

	}

	public static void test7() {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);

		// 给个提示
		System.out.println("请输入学生的考试成绩：");
		int score = sc.nextInt();

		// if语句格式3实现

		/*
		 * if(score>=90 && score<=100) { System.out.println("优秀"); }else if(score>=80 &&
		 * score<90) { System.out.println("好"); }else if(score>=70 && score<80) {
		 * System.out.println("良"); }else if(score>=60 && score<70) {
		 * System.out.println("及格"); }else { System.out.println("不及格"); }
		 */

		// 通过数据的测试，我们发现程序不够严谨，未加入非法数据的判断
		if (score > 100 || score < 0) {
			System.out.println("你输入的成绩有误");
		} else if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("好");
		} else if (score >= 70 && score < 80) {
			System.out.println("良");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
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
		// 定义一个长度为6的数组
		int[] arr = new int[6];

		// 评委打分的数据采用键盘录入实现
		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < arr.length; x++) {
			System.out.println("请输入第" + (x + 1) + "个评委给出的分数：");
			int score = sc.nextInt();
			arr[x] = score;
		}

		// 写代码获取数组的最大值(最高分)
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}

		// 写代码获取数组的最小值(最低分)
		int min = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] < min) {
				min = arr[x];
			}
		}

		// 写代码求数组中的元素和(总分)
		int sum = 0;
		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}

		// 平均分：(总分-最高分-最低分)/(arr.length-2)
		int avg = (sum - max - min) / (arr.length - 2);

		// 输出平均分即可
		System.out.println("该选手的最终得分是：" + avg);
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
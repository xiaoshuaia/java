package day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JiHe {
	public static void test() {
		// �������϶���
		Set<String> set = new HashSet<String>();

		// ���Ԫ��
		set.add("hello");
		set.add("world");
		set.add("java");
		// Ψһ
		set.add("world");

		// ��������
		for (String s : set) {
			System.out.println(s);
		}
	}

	public static void test1() {
		// �������϶���
		HashSet<String> hs = new HashSet<String>();

		// ���Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");

		/*
		 * //�������� for(String s : hs) { System.out.println(s); }
		 */
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}
	public static void map(){
		//�������϶���
				Map<String,String> map = new HashMap<String,String>();
				
				//���Ԫ��
				map.put("����", "����");
				map.put("���", "С��Ů");
				map.put("���޼�", "����");
				
				//V get(Object key):���ݼ���ȡֵ
				System.out.println("get:"+map.get("���޼�"));
				System.out.println("get:"+map.get("������"));
				System.out.println("--------------------");
				
				//Set<K> keySet():��ȡ���м��ļ���
				Set<String> set = map.keySet();
				for(String key : set) {
					System.out.println(key);
				}
				System.out.println("--------------------");
				
				//Collection<V> values():��ȡ����ֵ�ļ���
				Collection<String> values = map.values();
				for(String value : values) {
					System.out.println(value);
				}
				Set<String> a=map.keySet();
				for (String b: a) {
					System.out.println(b+":"+map.get(b));
					
				}
//				��ȡ��ֵ�Զ���ļ���
				Set<Map.Entry<String,String>> set1 = map.entrySet();
				//������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
				for(Map.Entry<String,String> me : set1) {
					//���ݼ�ֵ�Զ����ȡ����ֵ
					String key = me.getKey();
					String value = me.getValue();
					System.out.println(key+"---"+value);

				}
	}
	public static void list() {
		//�������϶���
				HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
			
				//����Ԫ��1
				ArrayList<String> sgyy = new ArrayList<String>();
				sgyy.add("�����");
				sgyy.add("����");
				//��Ԫ����ӵ�hm��
				hm.put("��������", sgyy);
				
				//����Ԫ��2
				ArrayList<String> xyj = new ArrayList<String>();
				xyj.add("��ɮ");
				xyj.add("�����");
				//��Ԫ����ӵ�hm��
				hm.put("���μ�", xyj);
				
				//����Ԫ��3
				ArrayList<String> shz = new ArrayList<String>();
				shz.add("����");
				shz.add("³����");
				//��Ԫ����ӵ�hm��
				hm.put("ˮ䰴�", shz);
				
				//��������
				Set<String> set = hm.keySet();
				for(String key : set) {
					System.out.println(key);
					ArrayList<String> value = hm.get(key);
					for(String s : value) {
						System.out.println("\t"+s);
					}
				}
			}

	
	public static void main(String[] args) {
		list();
	}
}

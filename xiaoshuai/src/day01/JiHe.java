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
		// 创建集合对象
		Set<String> set = new HashSet<String>();

		// 添加元素
		set.add("hello");
		set.add("world");
		set.add("java");
		// 唯一
		set.add("world");

		// 遍历集合
		for (String s : set) {
			System.out.println(s);
		}
	}

	public static void test1() {
		// 创建集合对象
		HashSet<String> hs = new HashSet<String>();

		// 添加元素
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("world");

		/*
		 * //遍历集合 for(String s : hs) { System.out.println(s); }
		 */
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

	}
	public static void map(){
		//创建集合对象
				Map<String,String> map = new HashMap<String,String>();
				
				//添加元素
				map.put("郭靖", "黄蓉");
				map.put("杨过", "小龙女");
				map.put("张无忌", "赵敏");
				
				//V get(Object key):根据键获取值
				System.out.println("get:"+map.get("张无忌"));
				System.out.println("get:"+map.get("张三丰"));
				System.out.println("--------------------");
				
				//Set<K> keySet():获取所有键的集合
				Set<String> set = map.keySet();
				for(String key : set) {
					System.out.println(key);
				}
				System.out.println("--------------------");
				
				//Collection<V> values():获取所有值的集合
				Collection<String> values = map.values();
				for(String value : values) {
					System.out.println(value);
				}
				Set<String> a=map.keySet();
				for (String b: a) {
					System.out.println(b+":"+map.get(b));
					
				}
//				获取键值对对象的集合
				Set<Map.Entry<String,String>> set1 = map.entrySet();
				//遍历键值对对象的集合，得到每一个键值对对象
				for(Map.Entry<String,String> me : set1) {
					//根据键值对对象获取键和值
					String key = me.getKey();
					String value = me.getValue();
					System.out.println(key+"---"+value);

				}
	}
	public static void list() {
		//创建集合对象
				HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
			
				//创建元素1
				ArrayList<String> sgyy = new ArrayList<String>();
				sgyy.add("诸葛亮");
				sgyy.add("赵云");
				//把元素添加到hm中
				hm.put("三国演义", sgyy);
				
				//创建元素2
				ArrayList<String> xyj = new ArrayList<String>();
				xyj.add("唐僧");
				xyj.add("孙悟空");
				//把元素添加到hm中
				hm.put("西游记", xyj);
				
				//创建元素3
				ArrayList<String> shz = new ArrayList<String>();
				shz.add("武松");
				shz.add("鲁智深");
				//把元素添加到hm中
				hm.put("水浒传", shz);
				
				//遍历集合
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

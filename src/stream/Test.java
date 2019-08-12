package stream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;

/**
 * @desc jdk8 stream 使用
 * @author wayne
 */
public class Test {

	/**
	 * @desc 简单聚合运算
	 * @desc 过滤后聚合运算
	 * @desc distinct去重, 过滤后聚合运算
	 * @desc Collectors.toList() 创建一个子列表
	 */
	@org.junit.Test
	public void test1() {
		System.out.println("---test1---");
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("B");
		list.add("C");

		long c1 = list.stream().count();
		System.out.println(c1);
		
		long c2 = list.stream().filter(r -> !r.equals("C")).count();
		System.out.println(c2);
		
		long c3 = list.stream().distinct().filter(r -> !r.equals("C")).count();
		System.out.println(c3);
		
		list.stream().limit(10).forEach(System.out::println);

		System.out.println("---distinct---");
		List<String> list2 = list.stream().distinct().collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		// peek 对每个元素执行操作并返回一个新的 Stream
		Stream.of("one", "two", "three", "four")
		 .filter(e -> e.length() > 3)
		 .peek(e -> System.out.println("Filtered value: " + e))
		 .map(String::toUpperCase)
		 .peek(e -> System.out.println("Mapped value: " + e))
		 .collect(Collectors.toList());
		
		// reduce 的用例
		
		// 字符串连接，concat = "ABCD"
		String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
		// 求最小值，minValue = -3.0
		double minValue = Stream.of(-1.5, 1.0, -3.0, -2.0).reduce(Double.MAX_VALUE, Double::min);
		// 求和，sumValue = 10, 有起始值
		int sumValue = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
		// 求和，sumValue = 10, 无起始值
		sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
		// 过滤，字符串连接，concat = "ace"
		concat = Stream.of("a", "B", "c", "D", "e", "F").
		 filter(x -> x.compareTo("Z") > 0).
		 reduce("", String::concat);
	}

	/**
	 * @desc limit 取前？条数据
	 * @desc forEach 对每个元素进行？操作
	 */
	@org.junit.Test
	public void test2() {
		System.out.println("---test2---");
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.stream().limit(5).forEach(System.out::println);
		
		// 使用Lambda表达式-传入本对象及trans方法
		list.stream().forEach(Test::trans);
		
		System.out.println("---stream forEach 原有Stream对象不改变---");
		list.stream().limit(10).forEach(System.out::println);
		
	}
	
	/**
	 * 定义转换逻辑的方法
	 * @return
	 */
	public static String trans(String value){
		String temp = value + "-Test";
		System.out.println(temp);
		return temp;
	}

	/**
	 * @desc map函数mapToInt-使用普通参数传递
	 * @desc map函数mapToInt-使用Lambda表达式
	 */
	@org.junit.Test
	public void test3() {
		System.out.println("---test3---");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("2");
		list.add("4");
		
		// 使用普通参数传递
		list.stream().mapToInt(new ToIntFunction<Object>(){
			@Override
			public int applyAsInt(Object value) {
				return Integer.parseInt(value+"0");
			}
		}).forEach(System.out::println);
		
		// 使用Lambda表达式
		list.stream().mapToInt(r -> Integer.parseInt(r+"0")).forEach(System.out::println);

		ArrayList<Integer> intList = list.stream()
			.collect(() -> new ArrayList<Integer>()
					, (lista, item) -> lista.add(Integer.parseInt(item+"00"))
					, (lista, listb) -> lista.addAll(listb));

		System.out.println("---collect---");
		intList.stream().forEach(System.out::println);
		
		Map<Object, List<String>> map = list.stream().collect(Collectors.groupingBy(x -> x));

		System.out.println("---groupingBy---" + map);
		
	}

	/**
	 * @desc Collections sort
	 * 
	 */
	@org.junit.Test
	public void test4() {
		System.out.println("---test4---");
		
		List<String> list = Arrays.asList("E", "A", "B", "C", "D");
		// 原始写法
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		
		// Lamdba写法
		Collections.sort(list, (o1, o2) -> -o1.compareTo(o2));
		
	}

	/**
	 * @desc iterate
	 * 
	 */
	@org.junit.Test
	public void test5() {
		System.out.println("---test5---");
		System.out.println("参与者-围观者及参与人数众多,吃瓜群众.");
		System.out.println("大方向-绝大人数看法相同,达成共识.");
		System.out.println("曝光度-在人民心中有深刻印象,似曾相识.");
		System.out.println("积极度-主动出击.");
		System.out.println("导火索-干柴烈火.");
		System.out.println("持久度-熊熊烈火,一发不可收拾.");
		Stream.iterate(0, n -> n+4).limit(10).forEach(System.out::println);
		// xckj +|+-||
		// zhny +-+-||
		// chfh 
		
		System.out.println("1过去为什么活着？");
		System.out.println("2现在为什么活着？");
		System.out.println("3我还要活下去么？");
		
		System.out.println("生命的意义-为了以更好的状态来迎接死亡?");
		System.out.println("生命的意义-体验人生的过程?");
		System.out.println("生命的意义-希望，理想，信仰?");
		System.out.println("生命的意义-人活着就是经历幸福，悲伤，苦难，然后死去?");
		System.out.println("生命的意义-反正都要死，不求死的轰轰烈烈，只求死之前没有太多遗憾?");
		System.out.println("-虽然我们的生命是无意义的，最终会被遗忘，消失；但生活过程中，我们能够经历其中的美好事物，等等");
		System.out.println("关怀身边的人及事物");
		System.out.println("尽力在你喜欢的事物上做的更好");
		System.out.println("对你的好友真诚宽恕你的敌人");
		System.out.println("试着找到自己更多的兴趣");
		System.out.println("看一场电影");
		System.out.println("旅行");
		System.out.println("户外运动");
		System.out.println("吃一顿美食");
		System.out.println("自由自在");
		System.out.println("和老同学一起开黑打游戏");
		System.out.println("和老同学聊天、聚会、游玩");
		
	}

	/**
	 * @desc lambda表达式
	 * @desc Java 8的方法引用
	 */
	@org.junit.Test
	public void test6() {
		System.out.println("---test6---");
		
		// 无参数
		// () -> System.out.println("Hello Lambda Expressions");
		// 有两个参数
		// (int x, int y) -> x + y;
		
		JButton show =  new JButton("Show");
		// Java 8之前
		show.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println("Event handling without lambda expression is boring");
		    }
		});
		// lambda表达式
		show.addActionListener(e -> System.out.println("Event handling without lambda expression is boring"));
		
		// Java 8之前
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		for (String feature : features) {
		    System.out.println(feature);
		}
		// lambda表达式
		// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示
		features.stream().forEach(System.out::println);
		
		
		
	}


	/**
	 * @desc 在lambda表达式中加入Predicate
	 * @desc map示例-对列表的每个元素应用函数
	 */
	@org.junit.Test
	public void test7() {
		System.out.println("---test7---");
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		
		Predicate<String> startWithPre = s -> s.startsWith("J");
		Predicate<String> lengthPre = s -> s.length() == 4;
		languages.stream().filter(startWithPre.and(lengthPre)).forEach(System.out::println);

		System.out.println("---or---");
		languages.stream().filter(startWithPre.or(lengthPre)).forEach(System.out::println);

		System.out.println("---map---");
		languages.stream().map(x -> x + "+++").forEach(System.out::println);
		
	}


	/**
	 * @desc map示例与reduce示例
	 */
	@org.junit.Test
	public void test8() {
		System.out.println("---test8---");
		List<Double> costBeforeTax = Arrays.asList(100D, 200D, 300D, 400D, 500D);
		
		// 为每个订单加上12%的税
		System.out.println("---map---");
		costBeforeTax.stream().map(x -> x + x * 0.12).forEach(System.out::println);
		
		// 
		
	}

	/**
	 * @desc 计算集合元素的最大值、最小值、总和以及平均值
	 */
	@org.junit.Test
	public void test9() {
		System.out.println("---test9---");
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		
		IntSummaryStatistics summary = primes.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("max=" + summary.getMax());
		System.out.println("min=" + summary.getMin());
		System.out.println("sum=" + summary.getSum());
		System.out.println("average=" + summary.getAverage());
		
		
	}

	/**
	 * @desc BigDecimal类型-计算集合元素的最大值、最小值、总和以及平均值
	 */
	@org.junit.Test
	public void test10() {
		System.out.println("---test10---");
		BigDecimalObj obj1 = new BigDecimalObj();
		BigDecimalObj obj2 = new BigDecimalObj();
		obj1.setX(new BigDecimal("100"));
		obj2.setX(new BigDecimal("200"));
		List<BigDecimalObj> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		
		// 求和
		BigDecimal total = list.stream()
				.filter(r -> r.getX().compareTo(BigDecimal.ZERO) < 0)
				.map(r -> r.getX()).reduce(BigDecimal.ZERO, BigDecimal::add);
		// 最大值
		BigDecimal max = list.stream()
				.filter(r -> r.getX().compareTo(BigDecimal.ZERO) < 0)
				.map(r -> r.getX()).reduce(BigDecimal.ZERO, BigDecimal::max);
		// 最小值
		BigDecimal min = list.stream()
				.filter(r -> r.getX().compareTo(BigDecimal.ZERO) < 0)
				.map(r -> r.getX()).reduce(BigDecimal.ZERO, BigDecimal::min);

		// 按x分组
		Map<BigDecimal, List<BigDecimalObj>> groupMap = list.stream().collect(Collectors.groupingBy(BigDecimalObj::getX));

		System.out.println("total=" + total);
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.println("groupMap=" + groupMap);
	}


	/**
	 * @desc toMap
	 * @desc groupingBy
	 */
	@org.junit.Test
	public void test11() {
		System.out.println("---test11---");
		List<TExecuteTask> taskList = new ArrayList<>();
		TExecuteTask r1 = new TExecuteTask();
		r1.setExcId(1L);
		r1.setTaskArea("广东深圳南山区西丽镇");
		r1.setTaskAreaDetail("天虹");
		taskList.add(r1);
		TExecuteTask r2 = new TExecuteTask();
		r2.setExcId(2L);
		r2.setTaskArea("广东深圳南山区西丽镇");
		r2.setTaskAreaDetail("人人乐");
		taskList.add(r2);
		
		Map<Long, TExecuteTask> taskMap1 = taskList.stream().collect(Collectors.toMap(TExecuteTask::getExcId, Function.identity()));
		
		Map<String, List<TExecuteTask>> taskMap2 = taskList.stream().collect(Collectors.groupingBy(TExecuteTask::getTaskArea));
		
	}
	
	public static void main(String[] args) {
		
	}
}

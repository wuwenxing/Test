package combination;

public class Test {

	/**
	 * @desc 组合模式-将对象组合成树形结构以表示“部分-整体”的层次结构
	 * @desc 理解清楚 “部分/整体” 还有 “单个对象” 与 “组合对象” 的含义
	 * @desc 让你可以优化处理递归或分级数据结构
	 * 
	 * @desc 涉及角色：
	 * @desc 1、Component：是组合中的对象声明接口，在适当的情况下，实现所有类共有接口的默认行为。声明一个接口用于访问和管理Component子部件
	 * @desc 2、Leaf：在组合中表示叶子结点对象，叶子结点没有子结点
	 * @desc 3、Composite：定义有枝节点行为，用来存储子部件，在Component接口中实现与子部件有关操作，如增加(add)和删除(remove)等
	 * 
	 */
	@org.junit.Test
	public void test1() {
		Company root = new ConcreteCompany();
        root.setName("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        Company shandongCom = new ConcreteCompany("山东分公司");
        shandongCom.add(new HRDepartment("山东分公司人力资源部"));
        shandongCom.add(new FinanceDepartment("山东分公司账务部"));
        Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
        zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));
        zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部"));
        Company jinanCom = new ConcreteCompany("济南办事处");
        jinanCom.add(new FinanceDepartment("济南办事处财务部"));
        jinanCom.add(new HRDepartment("济南办事处人力资源部"));
        shandongCom.add(jinanCom);
        shandongCom.add(zaozhuangCom);
        Company huadongCom = new ConcreteCompany("上海华东分公司");
        huadongCom.add(new HRDepartment("上海华东分公司人力资源部"));
        huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));
        Company hangzhouCom = new ConcreteCompany("杭州办事处");
        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));
        hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));
        Company nanjingCom = new ConcreteCompany("南京办事处");
        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));
        nanjingCom.add(new HRDepartment("南京办事处人力资源部"));
        huadongCom.add(hangzhouCom);
        huadongCom.add(nanjingCom);
        root.add(shandongCom);
		root.add(huadongCom);
		root.display(0);
	}

	public static void main(String[] args) {

	}
}

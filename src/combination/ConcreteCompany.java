package combination;

import java.util.ArrayList;
import java.util.List;

/**
 *  定义有枝节点行为，用来存储子部件，实现与子部件有关操作
 * @author wayne
 *
 */
public class ConcreteCompany extends Company{

	private List<Company> list;
	
	public ConcreteCompany() {
		super();
		list = new ArrayList<Company>();
    }
	
	public ConcreteCompany(String name) {
		super(name);
		list = new ArrayList<Company>();
	}
	
	@Override
	protected void add(Company company) {
		list.add(company);
	}

	@Override
	protected void remove(Company company) {
		list.remove(company);
	}

	@Override
	protected void display(int depth) {
		StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName());
        for (Company c : list) {
            c.display(depth + 2);
        }
	}
	
}

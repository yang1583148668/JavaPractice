package Day20.test01;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;








public class Test01 {
	@SuppressWarnings("all")
	@Test
	public void main1() {
		List list = new ArrayList();
		list.add("张三");
		list.add(0, "李四");
		System.out.println(list);
	}
}

package cn.edu.scau.sec.chenyonghuang.client;
import cn.edu.scau.sec.chenyonghuang.adapter.ClassAdapter;
import cn.edu.scau.sec.chenyonghuang.adapter.ObjectAdapter;


public class AdapterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAdapter ca = new ClassAdapter();
		ca.printDate("2000.3.6");
		
		ObjectAdapter oa = new ObjectAdapter();
		oa.printDate("2000.3.6");
	}

}

package com.coffee.mongo;

import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 测试MiniMogodb中的方法
 * @author coffee
 *
 */
public class MiniMogodbTest {
	private static final String uuid  = "068523e5-bc85-4c08-85a7-dc7a84735f7b";
	private static final String database_name  = "src/test/resource/mini-mongodb.xml";
	
	/**
	 * 查询表数据
	 */
	@Test
	public void testLoadTableDatas() {
		try {
			MiniMogodb dao = new MiniMogodb();
			List<Map> list = dao.loadTableDatas(database_name,"test");
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除表数据
	 */
	@Test
	public void testDeleteData() {
		Person po = new Person();
		po.set_uuid(uuid);
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.deleteData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 在更新表数据
	 */
	@Test
	public void testUpdateData() {
		Person po = new Person();
		po.set_uuid(uuid);
		po.setName("张代浩");
		po.setAge(28);
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.updateData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 在test表中添加数据
	 */
	@Test
	public void testAddData() {
		Person po = new Person();
		po.setName("lisan");
		po.setAge(20);
		po.setMoney(2000.98);
		po.setSex("男");
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.addData(database_name,"test",po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 初始化创建数据库
	 */
	@Test
	public void testCreateDataBase() {
		try {
			MiniMogodb dao = new MiniMogodb();
			dao.createDataBase(database_name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}

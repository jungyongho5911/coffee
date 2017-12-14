package com.web.coffee.serviceImpl;

import java.awt.Menu;
import java.util.HashMap;
import java.util.Set;

import com.web.coffee.service.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
	public HashMap<String,String> menumap;
	private Object pay;
	public CoffeeServiceImpl() {
		menumap = new HashMap<>();
	}
	@Override
	public void mainmenu(String[] dummy) {
		for(String a : dummy) {
			String[] arr = a.split("/");
			menumap.put(arr[0], arr[1]);
			System.out.println("더미의 0번째+"+arr[0]+"+더미의1번째+"+arr[1]);
		}
	}
	@Override
	public String choicemenu(String select) {
		System.out.println("내가 선택한메뉴는"+select);
		String [] arr = select.split("/");
		String item = arr[0];
		String count = arr[1];
		System.out.println("arr[0]="+arr[0]+"+arr[1]="+arr[1]);
		Set<String> keys = menumap.keySet();
		String price = "";
		System.out.println("키꾸러미 보여줍니다= "+keys);
		for(String key: keys) {
			if(item.equals(key)) {
				price = menumap.get(key);
			}
		}
		int pay = Integer.parseInt(price)*Integer.parseInt(count);
		
		return ""+pay;
	
	}
}

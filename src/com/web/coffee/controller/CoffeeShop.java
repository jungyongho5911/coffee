package com.web.coffee.controller;

import java.security.Provider.Service;

import javax.swing.JOptionPane;

import com.web.coffee.constant_pool.CoffeeMenu;
import com.web.coffee.service.CoffeeService;
import com.web.coffee.serviceImpl.CoffeeServiceImpl;

public class CoffeeShop {
	public static void main(String[] args) {
		CoffeeService coffeeService = new CoffeeServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog(CoffeeMenu.MENU)) {
			case "1" :
				//메뉴를 담자
				String[]dummy = {
						"americano/3500",
						"cafelatte/4500",
						"banillalatte/4500",
						"cafemoca/5000",
				};
				coffeeService.mainmenu(dummy);
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, coffeeService.choicemenu(JOptionPane.showInputDialog("어떤걸 구매하시겠습니까/수량선택을해주세요")));
				break;
			}
		}
	}
}

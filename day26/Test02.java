package com.java5200.date0613;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class Account {

	private String name;// 账号
	private double balance;// 余额

	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if ((obj != null) && (obj instanceof Account)) {
			Account a = (Account) obj;
			if (this.name == a.name) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "账号:" + name + ", 余额:" + balance;
	}

}

class MyComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {

		if (a1.equals(a2)) {
			return 0;
		} else if (a1.getBalance() < a2.getBalance()) {
			return 1;
		} else {
			return -1;
		}

	}
}

/**
 * •向TreeMap集合添加10个银行账号对象 •要求Account账号类重写equals()和hashCode()方法
 * •对账号进行定制排序,以账号余额降序排列 •在测试类中输出最后结果
 * 
 * @author CSH
 * @date 2018年6月13日上午9:21:47
 */
public class Test02 {

	public static void main(String[] args) {

		Map<Account, String> map = new TreeMap<Account, String>(new MyComparator());
		Account account0 = new Account("账号0", 750);
		Account account1 = new Account("账号1", 250);
		Account account2 = new Account("账号2", 150);
		Account account3 = new Account("账号3", 50);
		Account account4 = new Account("账号4", 350);
		Account account5 = new Account("账号5", 50);
		Account account6 = new Account("账号6", 250);
		Account account7 = new Account("账号7", 150);
		Account account8 = new Account("账号8", 950);
		Account account9 = new Account("账号9", 350);
		map.put(account0, "账户0");
		map.put(account1, "账户1");
		map.put(account2, "账户2");
		map.put(account3, "账户3");
		map.put(account4, "账户4");
		map.put(account5, "账户5");
		map.put(account6, "账户6");
		map.put(account7, "账户7");
		map.put(account8, "账户8");
		map.put(account9, "账户9");
		Set<Entry<Account, String>> set = map.entrySet();
		Iterator<Entry<Account, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<Account, String> entry = iterator.next();
			System.out.println(entry.getKey());
		}

	}

}
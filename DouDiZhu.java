package com.itheima.���ư���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * ���ư���+����
 * 
 * @author unlinks
 *
 */
public class DouDiZhu {
	public static void main(String[] args) {
		faPai();
	}

	public static void faPai() {
		ArrayList<String> lt = new ArrayList<>();
		ArrayList<String> lt2 = new ArrayList<>();
		ArrayList<String> lt3 = new ArrayList<>();
		Map<Integer, String> map = new HashMap<>();
		ArrayList<Integer> lt4 = new ArrayList<>();// �������
		lt.add("����");
		lt.add("����");
		lt.add("����");
		lt.add("÷��");
		lt2.add("2");
		lt2.add("3");
		lt2.add("4");
		lt2.add("5");
		lt2.add("6");
		lt2.add("7");
		lt2.add("8");
		lt2.add("9");
		lt2.add("10");
		lt2.add("J");
		lt2.add("Q");
		lt2.add("K");
		lt2.add("A");
		int n = 0;
		for (int i = 0; i <= lt2.size() - 1; i++) {
			for (int j = 0; j <= lt.size() - 1; j++) {
				String s = lt.get(j) + lt2.get(i);
				map.put(n, s);
				lt4.add(n);
				n++;
			}
		}
		map.put(53, "����");
		map.put(54, "С��");
		lt4.add(53);
		lt4.add(54);

		// System.out.println(lt3);
		Collections.shuffle(lt4);
		ArrayList<Integer> p1 = new ArrayList<>();
		ArrayList<Integer> p2 = new ArrayList<>();
		ArrayList<Integer> p3 = new ArrayList<>();
		ArrayList<String> p4 = new ArrayList<>();
		ArrayList<String> p5 = new ArrayList<>();
		ArrayList<String> p6 = new ArrayList<>();
		ArrayList<String> d2 = new ArrayList<>();
		ArrayList<Integer> d1 = new ArrayList<>();
		for (int i = 0; i < lt4.size() - 3; i += 3) {
			int s2 = lt4.get(i);
			p1.add(s2);
		}
		for (int i = 1; i < lt4.size() - 3; i += 3) {
			int s2 = lt4.get(i);
			p2.add(s2);
		}
		for (int i = 2; i < lt4.size() - 3; i += 3) {
			int s2 = lt4.get(i);
			p3.add(s2);
		}
		for (int i = lt4.size() - 3; i <= lt4.size() - 1; i++) {
			int s2 = lt4.get(i);
			d1.add(s2);
		}
		TreeSet<Integer> ts1 = new TreeSet<>();
		TreeSet<Integer> ts2 = new TreeSet<>();
		TreeSet<Integer> ts3 = new TreeSet<>();
		TreeSet<Integer> ts4 = new TreeSet<>();
		ts1.addAll(p1);
		ts2.addAll(p2);
		ts3.addAll(p3);
		ts4.addAll(d1);
		p1.clear();
		p2.clear();
		p3.clear();
		d1.clear();
		p1.addAll(ts1);
		p2.addAll(ts2);
		p3.addAll(ts3);
		d1.addAll(ts4);
		for (Integer m : p1) {
			String s = map.get(m);
			p4.add(s);
		}
		for (Integer m : p2) {
			String s = map.get(m);
			p5.add(s);
		}
		for (Integer m : p3) {
			String s = map.get(m);
			p6.add(s);
		}
		for (Integer m : d1) {
			String s = map.get(m);
			d2.add(s);
		}
		System.out.println("A:" + p4);
		System.out.println("B:" + p5);
		System.out.println("C:" + p6);
		Scanner sc = new Scanner(System.in);
		System.out.println("������:" + d2);
		String s = sc.nextLine();
		if (s.equals("A������")) {
			p4.addAll(d2);
			System.out.println("A����:" + p4);
		} else if (s.equals("B������")) {
			p5.addAll(d2);
			System.out.println("B����" + p5);
		} else if (s.equals("C������")) {
			p6.addAll(d2);
			System.out.println("C����" + p6);
		} else {
			System.out.println("����,���¿�ʼ");
		}

		System.out.println("�ܹ���" + lt4.size() + "����");
		System.out.println("A������" + p4.size() + "��");
		System.out.println("B������" + p5.size() + "��");
		System.out.println("C������" + p6.size() + "��");

	}
}

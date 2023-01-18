package com.Kwon.ch11Project;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		//TreeSet메서드
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(score[i]); //중복 된 것이 있으면 하나만 추가
		}
		
		System.out.println("set : "+set);
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		//headSet(기준값)에서 기준값보다 작은값만 리턴 (기본값 미포함한다)
		//public SortedSet<E> headSet(E toElement) 반환은 SortedSet이므로 TreeSet반환
		//기본형을 파라메터로 사용하면 autoboxing에 의해 기본형의 wrapper클래스로 변경
		
		System.out.println("50보다 큰 값 : " + set.tailSet(50));
		//public SortedSet<E> tailSet (E fromElement)
		//tailSet은 기본값을 포함해서 리턴한다

		
		
	}//main method;
}//main class;

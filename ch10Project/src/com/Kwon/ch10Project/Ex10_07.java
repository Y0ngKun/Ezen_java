package com.Kwon.ch10Project;

import java.text.DecimalFormat;

public class Ex10_07 {

	public static void main(String[] args) {
		
		//문자열을 숫자로 DecimalFormat에서 정한 패턴 형식으로 변환(parse 메서드 사용) 
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");//wrapper클래스중 숫자 클래스들의 상위
			System.out.print("1,234,567.89" + " -> ");
			//double d = num.doubleValue(); // num이 참조변수형이므로 기본형으로 바꿈
			double d = (double)num;
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
		}
		catch(Exception e){e.getMessage();}
		
	}//main method;

}//main class;

package com.kwon.ch02project;

public class Ex02_09 {
	public static void main(String[] args) {

		String url = "www.codechobo.com";
		float f1 = .10f; // = 0.10 = 1.0E-1
		float f2 = 1E1f; // = 10.0 = 1.0E1 = 1.0E+1 / E =10 E1�� 10�� 1��
		float f3 = 3.14E3F; // 3140.0 = E = 10 / E3= 10�� 3��
		double d = 1.23456789; // �ڹٿ��� �Ҽ������ͷ��� �⺻�� double

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);

		System.out.printf("d=%f%n", d); // f�� �Ҽ��� 6�ڸ� ǥ���ϴµ� �ݿø�
		System.out.printf("d=%14.10f%n", d); // ��ü 14�ڸ��� �Ҽ��� 10�ڸ�
		// �����κ��ڸ��� ������ ����ΰ� �Ҽ������� ����ִ��ڸ��� 0���� ó��
		System.out.printf("[12345678901234567890]%n"); // ��¿���ũ�� ���� �����ϸ� �� �״�� ���
		System.out.printf("[%s]%n", url); // ����ũ�� �����Ƿ� �״�� ���
		System.out.printf("[%20s]%n", url); // ����ũ�⸦ 20���� �ָ� �����ʺ��� ä��
		System.out.printf("[%8s]%n", url); // ���ʿ��� 8���ڸ� ���

	}
}
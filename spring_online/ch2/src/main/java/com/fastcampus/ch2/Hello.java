package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. ���� ȣ�Ⱑ���� ���α׷����� ���
@Controller
public class Hello {
	int iv = 10;	//�ν��Ͻ� ����
	static int cv = 20;	// static ����
	
	// 2. URL �� �޼��带 ����
	@RequestMapping("/hello")
	private void main() {	// �ν��Ͻ� �޼��� - iv, cv �Ѵ� ��� ����
		System.out.println("Hello");
		System.out.println(cv);
		System.out.println(iv);   	 
	}
	
	public static void main2() {	// st��tic�޼��� - cv�� ��밡��
		System.out.println(cv);
//		System.out.println(iv);   	// ����
	}
}

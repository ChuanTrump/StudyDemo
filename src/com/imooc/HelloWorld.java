package com.imooc;

public class HelloWorld {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
      //����һ���ַ�����ѧϰJAVA��̡�
	  String str = "ѧϰJAVA���";
	  //���ַ���ת����Сд
	  System.out.println("ת��ΪСд��"+str.toLowerCase());
	  //��ȡ����λ��Ϊ1���ַ�
	  System.out.println("��ȡ����λ��Ϊ1λ�õ��ַ�"+str.charAt(1));
	  //���ַ���ת����byte[],����ӡ���
	  byte[] b = str.getBytes();
	  System.out.println("ת��Ϊ�ַ����飺");
	  for(int i = 0; i < b.length; i++){
		  System.out.println(b[i] + " ");
		  
	  }
	  System.out.println();
	  //����һ���ַ�����JAVA��̡����бȽ�
	  String str2 = new String("ѧϰJAVA���");
	  System.out.println("str��str2���ڴ��ַ��ͬ��"+(str == str2));
	  System.out.println("str��str2��������ͬ��"+str.equals(str2));
	  //����һ���ַ���
	  String s = "amdskfkafkafsfafsfa";
	  //���ִ���
	  int num = 0;
	  //ѭ������ÿ���ַ����ж��Ƿ����ַ�a������ǣ��ۼӴ���
	  for(int i = 0; i < s.length(); i++){//ѭ������ÿ���ַ�
		  if(s.charAt(i) == 'a'){
			  num++;//�ۼ�ͳ�ƴ���
			  
		  }
	  }
	  System.out.println("�ַ�a���ֵĴ�����"+num);
	}

}

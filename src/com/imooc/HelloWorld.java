package com.imooc;

public class HelloWorld {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
      //定义一个字符串“学习JAVA编程”
	  String str = "学习JAVA编程";
	  //将字符串转换成小写
	  System.out.println("转换为小写："+str.toLowerCase());
	  //获取索引位置为1的字符
	  System.out.println("获取索引位置为1位置的字符"+str.charAt(1));
	  //将字符串转换成byte[],并打印输出
	  byte[] b = str.getBytes();
	  System.out.println("转换为字符数组：");
	  for(int i = 0; i < b.length; i++){
		  System.out.println(b[i] + " ");
		  
	  }
	  System.out.println();
	  //和另一个字符串“JAVA编程”进行比较
	  String str2 = new String("学习JAVA编程");
	  System.out.println("str和str2的内存地址相同？"+(str == str2));
	  System.out.println("str和str2的内容相同？"+str.equals(str2));
	  //定义一个字符串
	  String s = "amdskfkafkafsfafsfa";
	  //出现次数
	  int num = 0;
	  //循环遍历每个字符，判断是否是字符a，如果是，累加次数
	  for(int i = 0; i < s.length(); i++){//循环遍历每个字符
		  if(s.charAt(i) == 'a'){
			  num++;//累加统计次数
			  
		  }
	  }
	  System.out.println("字符a出现的次数："+num);
	}

}

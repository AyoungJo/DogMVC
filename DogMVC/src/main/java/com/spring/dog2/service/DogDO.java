package com.spring.dog2.service;

public class DogDO {
	private int num;		//������ ��� ����
	private String name;	//������ �̸�
	private String host;	//��ȣ�� �̸�
	private String breed;	//������ ����
	private String sex; 	//������ ����	
	private int age;		//������ ����
	
	@Override
	public String toString() {
		return "DogDO [num=" + num + ", name=" + name + ", "
				+ "breed=" + breed + ", sex=" + sex + ", "
				+ "host=" + host + ", age=" + age + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}		
}




package com.spring.dog2.service;

public class DogDO {
	private int num;		//강아지 등록 순서
	private String name;	//강아지 이름
	private String host;	//보호자 이름
	private String breed;	//강아지 종류
	private String sex; 	//강아지 성별	
	private int age;		//강아지 나이
	
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




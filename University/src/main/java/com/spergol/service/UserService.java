package com.spergol.service;
/*
 * ���ݷ��ʲ㣬���ݿ�ͨ�����������
 * ���н�����ÿһ��������Ҫ�Լ��Ķ�Ӧ
 * ���ʽӿڣ�user�ӿ�ֻ����user����ɾ�Ĳ�
 * �����ݷ��ʣ�����������Ĳ������������ӿ�
 * */

import java.util.List;

import com.spergol.pojo.User;

public interface UserService {
	/*
	 * ����ʱ�밴�չ淶��sel,add,del,upd��ͷ
	 * */
	List<User> selectUser(int id);
}
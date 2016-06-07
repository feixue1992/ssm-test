package com.lzh.ssm.service.impl;

import com.lzh.springmvc.model.User;
import com.lzh.ssm.mapper.UserMapper;
import com.lzh.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	private Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userDao;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		int cnt = userDao.deleteByPrimaryKey(id);
		log.info("----删除----cnt :" + cnt);
		return cnt;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Integer id) {
		User user = userDao.selectByPrimaryKey(id);
		if (null == user) {
			return user;
		}
		String name = user.getUsername();
		log.info("---usrname-- " + name);
		return user;
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}

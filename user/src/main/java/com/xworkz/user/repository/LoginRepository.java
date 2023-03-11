package com.xworkz.user.repository;

import com.xworkz.user.entity.LoginEntity;

public interface LoginRepository {
	boolean save(LoginEntity entity);
}

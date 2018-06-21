package com.zjh.dao;

import com.zjh.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by jiazhao on 4/3/18.
 */

@RepositoryRestResource
public interface UserDao extends CrudRepository<User, Integer>{

}

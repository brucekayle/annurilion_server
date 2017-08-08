package com.brucekyale.dao;

import com.brucekyale.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by BruceKayle on 2017/8/8.
 */
@Repository
public interface UserDao {

    List<User> selectAllUser();
}

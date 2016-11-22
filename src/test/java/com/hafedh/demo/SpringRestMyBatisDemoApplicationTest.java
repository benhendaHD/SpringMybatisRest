package com.hafedh.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hafedh.SpringRestMyBatisDemoApplication;
import com.hafedh.domain.User;
import com.hafedh.mappers.UserMapper;

/**
 * @author Siva
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringRestMyBatisDemoApplication.class)
public class SpringRestMyBatisDemoApplicationTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUsers() {
        final List<User> users = userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());

    }
}

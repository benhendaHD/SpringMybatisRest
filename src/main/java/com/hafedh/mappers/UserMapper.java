/**
 * 
 */
package com.hafedh.mappers;

import java.util.List;

import com.hafedh.domain.User;

/**
 * @author hafedh
 */
public interface UserMapper {

    List<User> findAllUsers();

}

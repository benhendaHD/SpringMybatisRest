/**
 * 
 */
package com.hafedh.domain;


/**
 * @author hafedh
 */

public class User {
    private Integer id;
    private String name;
    private String email;

    public User() {
    }

    public User(final Integer id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

}

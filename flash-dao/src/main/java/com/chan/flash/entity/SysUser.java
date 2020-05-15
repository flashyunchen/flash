package com.chan.flash.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * sys_user
 * @author 
 */
@Table(name="sys_user")
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private int id;

    private String userName;

    private static final long serialVersionUID = 1L;
}
package com.lsang.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserSearchRequest implements Serializable {
    private static final long serialVersionUID = 604209319197419311L;
    private int current;
    private int pageSize;
    private String userName;
}

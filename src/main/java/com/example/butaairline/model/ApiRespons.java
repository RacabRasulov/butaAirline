package com.example.butaairline.model;

public class ApiRespons {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String butaTokenUtil;


    public ApiRespons(String butaTokenUtil) {
        this.butaTokenUtil = butaTokenUtil;
    }

    public String getToken() {
        return this.butaTokenUtil;
    }


}

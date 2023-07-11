package com.example.butaairline.apidto;

import lombok.Data;

@Data
public class Root {
    public int status;
    public Message message;
    public CustomData data;
}

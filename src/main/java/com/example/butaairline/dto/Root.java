package com.example.butaairline.dto;

import lombok.Data;

@Data
public class Root {
    public int status;
    public Message message;
    public CustomData data;
}

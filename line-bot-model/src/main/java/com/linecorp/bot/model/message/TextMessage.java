package com.linecorp.bot.model.message;

import lombok.Value;

@Value
public class TextMessage implements Message {

    public static final String TYPE = "text";

    private String text;

    @Override
    public String getType() {
        return TYPE;
    }
}
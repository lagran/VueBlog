package com.funboy.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return Result.succ("操作成功", data);
    }

    public static Result succ(String mess, Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }

    public static Result fail(String mess) {
        return Result.fail(mess, null);
    }

    public static Result fail(String mess, Object data) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(mess);
        return m;
    }
}


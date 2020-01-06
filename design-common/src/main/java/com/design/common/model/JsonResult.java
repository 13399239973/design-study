package com.design.common.model;


import lombok.Data;


@Data
public class JsonResult {


    private boolean success = true;
    private String msg;
    private Object data;

    public JsonResult() {

    }

    public JsonResult(String msg) {
        this.msg = msg;
    }

    public static JsonResult success() {
        return new JsonResult();
    }

    public static JsonResult success(String msg) {
        return new JsonResult(msg);
    }

    public static JsonResult success(Object data) {
        JsonResult jr = new JsonResult();
        jr.setData(data);
        return jr;
    }

    public static JsonResult error() {
        JsonResult jr = new JsonResult();
        jr.setSuccess(false);
        return jr;
    }

    public static JsonResult error(String msg) {
        JsonResult jr = new JsonResult(msg);
        jr.setSuccess(false);
        return jr;
    }
}
package org.klsource.aigou.util;

public class AjaxResult {
    private boolean success = true;
    private String message = "成功";
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public Object setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

//    按照新的方法来
    public static AjaxResult getAjaxResult(){
        return new AjaxResult();
    }
//    按照以前的方法进行返回AjaxResult
//    这是一个无参的构造方法，因为AjaxResult有默认值，所以直接得到的就是  成功
//    public AjaxResult  (){}

//    这个是一个失败的返回，传进来message是失败提示
//    public AjaxResult(String message) {
//        this.success = false;
//        this.message = message;
//    }
}

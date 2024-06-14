package site.metacoding.blogv3._core.util;


import lombok.Data;

@Data
public class ApiUtil<T> {

    private Integer status;
    private String msg;
    private T body;
    private Boolean b;

    // 성공
    public ApiUtil(T body) {
        this.status = 200;
        this.msg = "성공";
        this.body = body;
    }

    //실패
    public ApiUtil(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
        this.body = null;
    }

}
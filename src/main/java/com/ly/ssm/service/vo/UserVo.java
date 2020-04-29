package com.ly.ssm.service.vo;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ly on 2017/11/30.
 */
public class UserVo {

    private Long id;
    private String userName;
    private String userEmail;
    private String userPwd;
    private MultipartFile file;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }


}

package cn.pirateswang.common.publicVO;

public class CurrentUser {
    
    private Long id;
    
    private String userName;

    private String userSex;
    
    private Integer age;

    private String userImage;

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public CurrentUser(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public CurrentUser() {
    }
}

package edu.fatec.profg.contactlist;

public class Contact {
    private int code;
    private String name;
    private String initials_name;
    private String phone;
    private String nickname;
    private byte[] image;

    public Contact(int code, String name, String initials_name, String phone, String nickname, byte[] image) {
        this.code = code;
        this.name = name;
        this.initials_name = initials_name;
        this.phone = phone;
        this.nickname = nickname;
        this.image = image;
    }

    public Contact(String name, String initials_name, String phone, String nickname, byte[] image) {
        this(0, name, initials_name, phone, nickname, image);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getInitials_name() { return initials_name; }

    public String getPhone() {
        return phone;
    }

    public String getNickname() {
        return nickname;
    }

    public byte[] getImage() {
        return image;
    }
}

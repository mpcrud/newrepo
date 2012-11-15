package com.app.mpadmin.domain;

/**
 * Created with IntelliJ IDEA.
 * User: miti
 * Date: 11/10/12
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Editor {
    private String email;
    private String subject;
    private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getEmail() {
        return email;
        }

        public void setEmail(String email) {
        this.email = email;
        }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

package org.example.myBean;

public class MyBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage(String message)
    {
        System.out.println("Message = " + message);
    }

    @Override
    public String toString() {
        return "myBean{" +
                "message='" + message + '\'' +
                '}';
    }
}

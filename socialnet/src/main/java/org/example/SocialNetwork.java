package org.example;


abstract class SocialNetwork {
    public String userName;
    public String passWord;


    public void SocialNetwork(String userName,String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }


    public void post(String msg){
        if(!logging(userName,passWord)){
            System.out.println("faça o login primeiro");
        }SendData(msg);
        logout();
    }
    // usuario faz o post , manda dados e dps faz o logout




    abstract boolean logging(String userName,Boolean pwd);



    abstract boolean SendData(String data);
    abstract boolean logout();





}

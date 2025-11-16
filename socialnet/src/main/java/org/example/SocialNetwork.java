package org.example;


abstract class SocialNetwork {
    public String userName;
    public String passWord;

    public void post(String msg){
        // POST AQUI FAZ O PROCESSO -> LOGIN/ MANDAR ALGUM DADO
        // FAZER LOGOUT, CHAMANDO OS METODOS ABSTRATOS
    }

    abstract boolean logging(String userName,Boolean pwd);
    abstract boolean SendData(String data);
    abstract boolean logout();





}

package org.example;

public class Facebook extends SocialNetwork {



    @Override
    boolean logging(String userName, Boolean pwd) {
        // logica de envio de dados twitter
        return false;
    }

    @Override
    boolean SendData(String data) {
        return false;
    }

    @Override
    boolean logout() {
        return false;
    }

}

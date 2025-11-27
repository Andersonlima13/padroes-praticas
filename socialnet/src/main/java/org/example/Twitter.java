package org.example;

public class Twitter extends SocialNetwork  {

    @Override
    boolean logging(String userName, Boolean pwd) {

        // logica de login twitter
        return false;
    }

    @Override
    boolean SendData(String data) {
//
        // logica de envio de dados twitter
        return false;
    }

    @Override
    boolean logout() {
        // logica de saida do twitter
        return false;
    }
}

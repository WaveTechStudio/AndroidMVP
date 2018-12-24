package com.gplxmvp.presenters;

import android.os.CountDownTimer;

import com.gplxmvp.models.User;

public class MainActivityPresenter {

    private User user;
    private View mainActivityView;

    public MainActivityPresenter(View mainActivityView) {
        this.user = new User();
        this.mainActivityView = mainActivityView;
    }

    public void loginAPICall(String email, String password) {
        user.setEmail(email);
        user.setPassword(password);

        //Do Apa call here, I am adding dummy loader/for delay
        mainActivityView.showProgressBar();

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {

                mainActivityView.updateLoginResponse("Successfully logged in with these credentials: \n\n" + user.toString());

                mainActivityView.clearInputFeilds();
                mainActivityView.hideProgressBar();
            }
        }.start();
    }

    public interface View {

        void updateLoginResponse(String response);

        void clearInputFeilds();

        void showProgressBar();

        void hideProgressBar();

    }
}
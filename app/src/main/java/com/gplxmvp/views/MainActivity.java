package com.gplxmvp.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.gplxmvp.R;
import com.gplxmvp.presenters.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityPresenter.View {

    private MainActivityPresenter presenter;
    private TextView myTextView;
    private ProgressBar progressBar;
    private EditText password, email;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        myTextView = findViewById(R.id.myTextView);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        btnLogin = findViewById(R.id.btnLogin);
        progressBar = findViewById(R.id.progressBar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!email.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {
                    presenter.loginAPICall(email.getText().toString(), password.getText().toString());
                } else {
                    Toast.makeText(MainActivity.this, getString(R.string.empty_feild_error), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void updateLoginResponse(String response) {
        myTextView.setText(response);
    }

    @Override
    public void clearInputFeilds() {
        email.getText().clear();
        password.getText().clear();
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }
}

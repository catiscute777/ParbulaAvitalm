package com.example.parbulaavitalm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wb;
    String st;
    EditText ed;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wb = findViewById(R.id.web);
        ed = findViewById(R.id.edt);
        btn = findViewById(R.id.btn);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new MyWebViewClient());
    }

    public void go(View view)
    {
        String add = "%2B";
        String text = ed.getText().toString();
        int index = text.indexOf('x');
        String a = text.substring(0,index);
        text = text.substring(index+3,text.length());
        index = text.indexOf('x');
        String b = text.substring(0,index);
        if(b.substring(0,1).equals("+"))
        {
            b= add+b;
        }
        text = text.substring(index+1,text.length());
        String c = text;
        if(c.substring(0,1).equals("+"))
        {
            c= add+c;
        }
        st = "https://www.google.co.il/search?q="+a+"x%5E2"+b+"x"+c+"&sca_esv=a48dbaf87d89a746&sxsrf=ACQVn09WTt9h6tdEua_U2UmicwdP0DBntQ%3A1707063499955&ei=y7i_Zc_mObP-7_UPlq2P-Ak&udm=&ved=0ahUKEwiP-JeMi5KEAxUz_7sIHZbWA58Q4dUDCBA&uact=5&oq=12x%5E2-3x-6&gs_lp=Egxnd3Mtd2l6LXNlcnAiCjEyeF4yLTN4LTYyBhAAGAUYHjIGEAAYCBgeMgYQABgIGB4yBhAAGAgYHjIGEAAYCBgeMgYQABgIGB4yBhAAGAgYHjIGEAAYCBgeMgYQABgIGB4yBhAAGAgYHkioEFDNCVjNCXABeAGQAQCYAX2gAX2qAQMwLjG4AQPIAQD4AQHCAgoQABhHGNYEGLAD4gMEGAAgQYgGAZAGAg&sclient=gws-wiz-serp";
        wb.loadUrl(st);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean  over(WebView view, String url) {
            view.loadUrl(url);
            return true;
    }
}}
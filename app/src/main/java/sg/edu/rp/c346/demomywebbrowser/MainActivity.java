package sg.edu.rp.c346.demomywebbrowser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnLoadUrl;
WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadUrl=findViewById(R.id.btnLoadUrl);
        wvMyPage=findViewById(R.id.webViewMyPage);
        wvMyPage.setWebViewClient(new WebViewClient());
        btnLoadUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                String url="https://www.grab.com";


                WebSettings testing=wvMyPage.getSettings();
                        testing.setCacheMode(WebSettings.LOAD_NO_CACHE);
                testing.setAllowFileAccess(false);
                testing.setJavaScriptEnabled(true);

                testing.setBuiltInZoomControls(true);

                wvMyPage.loadUrl(url);



            }
        });
    }
}

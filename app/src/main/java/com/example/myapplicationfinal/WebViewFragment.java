package com.example.myapplicationfinal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebViewFragment extends Fragment {
    WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
  View view=inflater.inflate(R.layout.fragment_web_view, container, false);
        String url = getArguments().getString("url");
        webView=view.findViewById(R.id.webviewId);
        Bundle bundle=this.getArguments();
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (keyCode == KeyEvent.KEYCODE_BACK) {
                        if (webView != null) {
                            if (webView.canGoBack()) {
                                webView.goBack();
                            } else {
                                getActivity().onBackPressed();
                            }
                        }
                    }
                }
                return true;
            }

        });



        return view;
    }
}
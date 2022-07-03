package com.example.webviewwebrtc

import android.os.Bundle
import android.webkit.PermissionRequest
import android.webkit.WebChromeClient
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val WebView: WebView = findViewById(R.id.webview)
        WebView.settings.javaScriptEnabled = true
        WebView.settings.domStorageEnabled = true
        WebView.setWebChromeClient(object : WebChromeClient() {
            override fun onPermissionRequest(request: PermissionRequest) {
                request.grant(request.resources)
            }
        })
        WebView.loadUrl("https://aadi-video.app.100ms.live/meeting/stj-lci-aah")
    }
}

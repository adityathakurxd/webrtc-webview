//
//  ContentView.swift
//  webrtcwebview
//
//  Created by Aditya Thakur on 30/06/22.
//

import SwiftUI
import WebKit

struct ContentView: View {
    @State private var showWebView = false
    
    var body: some View{
        WebView(url: URL(string: "https://aadi-video.app.100ms.live/preview/stj-lci-aah")!)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
 
struct WebView: UIViewRepresentable {
    var url: URL
    func makeUIView(context: Context) -> WKWebView {
        return WKWebView()
    }
    func updateUIView(_ webView: WKWebView, context: Context) {
        let request = URLRequest(url: url)
        webView.load(request)
    }
}

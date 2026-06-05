package o7;

import android.net.Uri;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p7.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12424a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static d8.e a(WebView webView) {
        WebViewProviderBoundaryInterface webViewProviderBoundaryInterfaceCreateWebView = o.f12820a.createWebView(webView);
        d8.e eVar = new d8.e();
        eVar.f5001a = webViewProviderBoundaryInterfaceCreateWebView;
        return eVar;
    }
}

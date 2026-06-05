package xc;

import android.webkit.WebViewClient;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f19916b;

    public /* synthetic */ d0(e0 e0Var, int i10) {
        this.f19915a = i10;
        this.f19916b = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19915a) {
            case 0:
                e0 e0Var = this.f19916b;
                try {
                    r0 r0Var = mc.n.D.f11577c;
                    WebViewClient webViewClient = e0Var.f19920a.getWebViewClient();
                    if (webViewClient != e0Var) {
                        if (webViewClient != null) {
                            e0Var.f19923d = webViewClient;
                        }
                        e0Var.f19920a.setWebViewClient(e0Var);
                        e0Var.a();
                        break;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
            default:
                e0 e0Var2 = this.f19916b;
                e0Var2.f19922c.execute(new d0(e0Var2, 0));
                break;
        }
    }
}

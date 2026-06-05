package he;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzbeo;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jh.c;
import lh.e;
import mc.m;
import nd.g;
import nd.h;
import qc.l0;
import rc.k;
import t.m1;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7891a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7892b;

    public b(Context context, e eVar) {
        this.f7892b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i10 = this.f7891a;
        Object obj = this.f7892b;
        switch (i10) {
            case 0:
                try {
                    a.a((Context) obj);
                    return 0;
                } catch (g e10) {
                    return Integer.valueOf(e10.f12281a);
                } catch (h e11) {
                    return Integer.valueOf(e11.f12282a);
                }
            default:
                m mVar = (m) obj;
                try {
                    mVar.A = (zzavs) mVar.f11570c.get(1000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e12) {
                    e = e12;
                    int i11 = l0.f13401b;
                    k.h("", e);
                } catch (ExecutionException e13) {
                    e = e13;
                    int i112 = l0.f13401b;
                    k.h("", e);
                } catch (TimeoutException e14) {
                    int i12 = l0.f13401b;
                    k.h("", e14);
                }
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("https://").appendEncodedPath((String) zzbeo.zzd.zze());
                p pVar = mVar.f11572e;
                builder.appendQueryParameter("query", (String) pVar.f17055d);
                builder.appendQueryParameter("pubId", (String) pVar.f17052a);
                builder.appendQueryParameter("mappver", (String) pVar.f17057f);
                TreeMap treeMap = (TreeMap) pVar.f17054c;
                for (String str : treeMap.keySet()) {
                    builder.appendQueryParameter(str, (String) treeMap.get(str));
                }
                Uri uriBuild = builder.build();
                zzavs zzavsVar = mVar.A;
                if (zzavsVar != null) {
                    try {
                        uriBuild = zzavsVar.zzb(uriBuild, mVar.f11571d);
                    } catch (zzavt e15) {
                        int i13 = l0.f13401b;
                        k.h("Unable to process ad data", e15);
                    }
                }
                return m1.w(mVar.zzq(), "#", uriBuild.getEncodedQuery());
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f7891a) {
            case 0:
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    a.f7887a.b((Context) this.f7892b, "pi", num.intValue());
                    Log.d("FirebaseFunctions", "Failed to update ssl context");
                    c.f8933h.setResult(null);
                    break;
                } else {
                    c.f8933h.setResult(null);
                    break;
                }
            default:
                String str = (String) obj;
                WebView webView = ((m) this.f7892b).f11573f;
                if (webView != null && str != null) {
                    webView.loadUrl(str);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b(m mVar) {
        this.f7892b = mVar;
    }
}

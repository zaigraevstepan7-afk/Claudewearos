package mc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzfdp;
import nc.s;
import nc.z;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f11567a;

    public l(m mVar) {
        this.f11567a = mVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        m mVar = this.f11567a;
        z zVar = mVar.f11574z;
        if (zVar != null) {
            try {
                zVar.zzf(zzfdp.zzd(1, null, null));
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                rc.k.i("#007 Could not call remote method.", e10);
            }
        }
        z zVar2 = mVar.f11574z;
        if (zVar2 != null) {
            try {
                zVar2.zze(0);
            } catch (RemoteException e11) {
                int i11 = l0.f13401b;
                rc.k.i("#007 Could not call remote method.", e11);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m mVar = this.f11567a;
        Context context = mVar.f11571d;
        int iB = 0;
        if (str.startsWith(mVar.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            z zVar = mVar.f11574z;
            if (zVar != null) {
                try {
                    zVar.zzf(zzfdp.zzd(3, null, null));
                } catch (RemoteException e10) {
                    int i10 = l0.f13401b;
                    rc.k.i("#007 Could not call remote method.", e10);
                }
            }
            z zVar2 = mVar.f11574z;
            if (zVar2 != null) {
                try {
                    zVar2.zze(3);
                } catch (RemoteException e11) {
                    int i11 = l0.f13401b;
                    rc.k.i("#007 Could not call remote method.", e11);
                }
            }
            mVar.n(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            z zVar3 = mVar.f11574z;
            if (zVar3 != null) {
                try {
                    zVar3.zzf(zzfdp.zzd(1, null, null));
                } catch (RemoteException e12) {
                    int i12 = l0.f13401b;
                    rc.k.i("#007 Could not call remote method.", e12);
                }
            }
            z zVar4 = mVar.f11574z;
            if (zVar4 != null) {
                try {
                    zVar4.zze(0);
                } catch (RemoteException e13) {
                    int i13 = l0.f13401b;
                    rc.k.i("#007 Could not call remote method.", e13);
                }
            }
            mVar.n(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            z zVar5 = mVar.f11574z;
            if (zVar5 != null) {
                try {
                    zVar5.zzi();
                } catch (RemoteException e14) {
                    int i14 = l0.f13401b;
                    rc.k.i("#007 Could not call remote method.", e14);
                }
            }
            String queryParameter = Uri.parse(str).getQueryParameter("height");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    rc.e eVar = s.f12202f.f12203a;
                    iB = rc.e.b(context, Integer.parseInt(queryParameter));
                } catch (NumberFormatException unused) {
                }
            }
            mVar.n(iB);
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        z zVar6 = mVar.f11574z;
        if (zVar6 != null) {
            try {
                zVar6.zzc();
                mVar.f11574z.zzh();
            } catch (RemoteException e15) {
                int i15 = l0.f13401b;
                rc.k.i("#007 Could not call remote method.", e15);
            }
        }
        if (mVar.A != null) {
            Uri uriZza = Uri.parse(str);
            try {
                uriZza = mVar.A.zza(uriZza, context, null, null);
            } catch (zzavt e16) {
                int i16 = l0.f13401b;
                rc.k.h("Unable to process ad data", e16);
            }
            str = uriZza.toString();
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
        return true;
    }
}

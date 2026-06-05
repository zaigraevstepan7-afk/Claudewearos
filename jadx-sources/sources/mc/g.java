package mc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import java.util.Collections;
import java.util.concurrent.Callable;
import nc.t;
import qc.l0;
import qc.m0;
import qc.r0;
import rg.a0;
import rg.z;
import w8.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11549c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f11547a = i10;
        this.f11549c = obj;
        this.f11548b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        zzan zzanVar;
        boolean z2 = false;
        switch (this.f11547a) {
            case 0:
                return ((i) this.f11549c).a((Context) this.f11548b);
            case 1:
                Context context = (Context) this.f11548b;
                Context context2 = (Context) this.f11549c;
                if (context != null) {
                    l0.k("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    l0.k("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z2 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    l0.k("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z2) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        l0.k("Persisting user agent.");
                    }
                }
                return string;
            case 2:
                m0 m0Var = r0.f13445l;
                String absolutePath = ((Context) this.f11548b).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.f11549c;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaX)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            case 3:
                z zVar = (z) this.f11548b;
                tg.a aVar = zVar.f14496g;
                rg.h hVar = (rg.h) this.f11549c;
                wg.h.a(hVar);
                aVar.e();
                return z.a(zVar, new sg.b(sg.d.f15034e, hVar));
            case 4:
                z zVar2 = (z) this.f11548b;
                wg.h hVar2 = (wg.h) zVar2.f14492c.get((a0) this.f11549c);
                if (hVar2 == null) {
                    return Collections.EMPTY_LIST;
                }
                zVar2.f14496g.e();
                return z.b(zVar2, hVar2, new sg.b(new sg.d(2, hVar2.f19306b, true), rg.h.f14414d));
            case 5:
                w8.a aVar2 = (w8.a) this.f11549c;
                rc.f fVar = (rc.f) this.f11548b;
                try {
                    synchronized (aVar2.f18916a) {
                        zzanVar = aVar2.f18923h;
                    }
                    if (zzanVar == null) {
                        aVar2.q(u.j, 119, null);
                    } else {
                        String packageName = aVar2.f18921f.getPackageName();
                        String str = fVar.f14339a;
                        String str2 = aVar2.f18918c;
                        long jLongValue = aVar2.f18939y.longValue();
                        Bundle bundle = new Bundle();
                        zze.zzc(bundle, str2, jLongValue);
                        Bundle bundleZzd = zzanVar.zzd(9, packageName, str, bundle);
                        u.a(zze.zzb(bundleZzd, "BillingClient"), zze.zzh(bundleZzd, "BillingClient"));
                    }
                } catch (DeadObjectException e10) {
                    aVar2.q(u.j, 28, e10);
                } catch (Exception e11) {
                    aVar2.q(u.f18985h, 28, e11);
                }
                return null;
            default:
                return ((xc.a) this.f11549c).getClickSignals((String) this.f11548b);
        }
    }

    public /* synthetic */ g(int i10, Object obj, Object obj2, boolean z2) {
        this.f11547a = i10;
        this.f11548b = obj;
        this.f11549c = obj2;
    }

    public /* synthetic */ g(w8.a aVar, l7.n nVar, rc.f fVar) {
        this.f11547a = 5;
        this.f11549c = aVar;
        this.f11548b = fVar;
    }
}

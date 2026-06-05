package qc;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzari;
import com.google.android.gms.internal.ads.zzbdc;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static zzaqe f13472a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13473b = new Object();

    public y(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f13473b) {
            try {
                if (f13472a == null) {
                    zzbdc.zza(context);
                    f13472a = ((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzeE)).booleanValue() ? o.a(context) : zzari.zza(context, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static w a(int i10, String str, HashMap map, byte[] bArr) throws IOException {
        w wVar = new w();
        t0.j jVar = new t0.j(29, str, wVar);
        rc.h hVar = new rc.h();
        v vVar = new v(i10, str, wVar, jVar, bArr, map, hVar);
        if (rc.h.c()) {
            try {
                Map mapZzl = vVar.zzl();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (rc.h.c()) {
                    hVar.d("onNetworkRequest", new wh.s(str, "GET", mapZzl, bArr2));
                }
            } catch (zzapj e10) {
                String message = e10.getMessage();
                int i11 = l0.f13401b;
                rc.k.g(message);
            }
        }
        f13472a.zza(vVar);
        return wVar;
    }
}

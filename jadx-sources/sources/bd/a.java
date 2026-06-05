package bd;

import ad.f;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbxn;
import fc.g;
import fc.r;
import nc.t;
import rc.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    public static void load(Context context, String str, g gVar, b bVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        e0.j(gVar, "AdRequest cannot be null.");
        e0.j(bVar, "LoadCallback cannot be null.");
        e0.d("#008 Must be called on the main UI thread.");
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzk.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                c.f14330b.execute(new f(context, str, gVar, bVar, 1));
                return;
            }
        }
        new zzbxn(context, str).zza(gVar.f6695a, bVar);
    }

    public abstract fc.t getResponseInfo();

    public abstract void show(Activity activity, r rVar);

    public static void load(Context context, String str, gc.a aVar, b bVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        e0.j(aVar, "AdManagerAdRequest cannot be null.");
        throw null;
    }
}

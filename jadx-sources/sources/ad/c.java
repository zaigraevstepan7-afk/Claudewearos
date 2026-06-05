package ad;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxc;
import fc.g;
import fc.l;
import fc.r;
import fc.y;
import nc.t;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        try {
            return y.a(context).zzu(str);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(Context context, String str, g gVar, d dVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        e0.j(gVar, "AdRequest cannot be null.");
        e0.j(dVar, "LoadCallback cannot be null.");
        e0.d("#008 Must be called on the main UI thread.");
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzk.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                rc.c.f14330b.execute(new f(context, str, gVar, dVar, 0));
                return;
            }
        }
        k.b("Loading on UI thread");
        new zzbxc(context, str).zza(gVar.f6695a, dVar);
    }

    @Deprecated
    public static c pollAd(Context context, String str) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        try {
            zzbwt zzbwtVarZzm = y.a(context).zzm(str);
            if (zzbwtVarZzm != null) {
                return new zzbxc(context, str, zzbwtVarZzm);
            }
            k.i("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
    }

    public abstract fc.t getResponseInfo();

    public abstract void setFullScreenContentCallback(l lVar);

    public abstract void show(Activity activity, r rVar);

    public static void load(Context context, String str, gc.a aVar, d dVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        e0.j(aVar, "AdManagerAdRequest cannot be null.");
        throw null;
    }
}

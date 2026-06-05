package sc;

import ad.f;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbmx;
import fc.g;
import fc.l;
import fc.y;
import nc.m0;
import nc.t;
import rc.c;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return y.a(context).zzt(str);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(Context context, String str, g gVar, b bVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "AdUnitId cannot be null.");
        e0.j(gVar, "AdRequest cannot be null.");
        e0.j(bVar, "LoadCallback cannot be null.");
        e0.d("#008 Must be called on the main UI thread.");
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzi.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                c.f14330b.execute(new f(context, str, gVar, bVar, 6));
                return;
            }
        }
        new zzbmx(context, str).zza(gVar.f6695a, bVar);
    }

    @Deprecated
    public static a pollAd(Context context, String str) {
        try {
            m0 m0VarZzj = y.a(context).zzj(str);
            if (m0VarZzj != null) {
                return new zzbmx(context, str, m0VarZzj);
            }
            k.i("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
    }

    public abstract fc.t getResponseInfo();

    public abstract void setFullScreenContentCallback(l lVar);

    public abstract void setImmersiveMode(boolean z2);

    public abstract void show(Activity activity);
}

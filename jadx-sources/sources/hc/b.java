package hc;

import ad.f;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.ads.zzbaq;
import com.google.android.gms.internal.ads.zzbau;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import fc.g;
import fc.y;
import nc.t;
import rc.c;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {
    @Deprecated
    public static boolean isAdAvailable(Context context, String str) {
        try {
            return y.a(context).zzs(str);
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return false;
        }
    }

    public static void load(Context context, String str, g gVar, a aVar) {
        e0.j(context, "Context cannot be null.");
        e0.j(str, "adUnitId cannot be null.");
        e0.j(gVar, "AdRequest cannot be null.");
        e0.d("#008 Must be called on the main UI thread.");
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzd.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                c.f14330b.execute(new f(context, str, gVar, aVar, 3));
                return;
            }
        }
        new zzbbc(context, str, gVar.f6695a, aVar).zza();
    }

    @Deprecated
    public static b pollAd(Context context, String str) {
        try {
            zzbau zzbauVarZzh = y.a(context).zzh(str);
            if (zzbauVarZzh != null) {
                return new zzbaq(zzbauVarZzh, str);
            }
            k.i("Failed to obtain an App Open ad from the preloader.", null);
            return null;
        } catch (RemoteException e10) {
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
    }

    public abstract fc.t getResponseInfo();

    public abstract void show(Activity activity);
}

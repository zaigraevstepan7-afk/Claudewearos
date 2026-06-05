package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import nc.t;
import rc.k;
import rc.l;
import rc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbcg {
    zzayw zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbcg() {
        this.zzc = rc.c.f14330b;
    }

    public zzbcg(final Context context) {
        ExecutorService executorService = rc.c.f14330b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfo)).booleanValue();
                zzbcg zzbcgVar = this.zza;
                Context context2 = context;
                if (zBooleanValue) {
                    try {
                        zzbcgVar.zza = (zzayw) a.a.d0(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new l() { // from class: com.google.android.gms.internal.ads.zzbcc
                            @Override // rc.l
                            public final Object zza(Object obj) {
                                return zzayv.zzb((IBinder) obj);
                            }
                        });
                        zzbcgVar.zza.zze(new xd.b(context2), "GMA_SDK");
                        zzbcgVar.zzb = true;
                    } catch (RemoteException | NullPointerException | m unused) {
                        k.b("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}

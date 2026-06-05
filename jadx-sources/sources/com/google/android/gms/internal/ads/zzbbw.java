package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbw {
    private zzbbl zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbbw(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbbw zzbbwVar) {
        synchronized (zzbbwVar.zzd) {
            try {
                zzbbl zzbblVar = zzbbwVar.zza;
                if (zzbblVar == null) {
                    return;
                }
                zzbblVar.disconnect();
                zzbbwVar.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Future zzc(zzbbm zzbbmVar) {
        zzbbq zzbbqVar = new zzbbq(this);
        zzbbu zzbbuVar = new zzbbu(this, zzbbmVar, zzbbqVar);
        zzbbv zzbbvVar = new zzbbv(this, zzbbqVar);
        synchronized (this.zzd) {
            zzbbl zzbblVar = new zzbbl(this.zzc, n.D.f11593t.b(), zzbbuVar, zzbbvVar);
            this.zza = zzbblVar;
            zzbblVar.checkAvailabilityAndConnect();
        }
        return zzbbqVar;
    }
}

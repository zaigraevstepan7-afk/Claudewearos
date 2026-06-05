package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfrx {
    private static zzfrx zzb;
    final zzfrt zza;

    private zzfrx(Context context) {
        this.zza = zzfrt.zzb(context);
        zzfrs.zza(context);
    }

    public static final zzfrx zza(Context context) {
        zzfrx zzfrxVar;
        synchronized (zzfrx.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfrx(context);
                }
                zzfrxVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfrxVar;
    }

    public final void zzb(zzfrr zzfrrVar) {
        synchronized (zzfrx.class) {
            zzfrt zzfrtVar = this.zza;
            zzfrtVar.zze("vendor_scoped_gpid_v2_id");
            zzfrtVar.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}

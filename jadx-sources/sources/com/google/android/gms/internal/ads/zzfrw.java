package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfrw extends zzfru {
    private static zzfrw zzd;

    private zzfrw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfrw zzi(Context context) {
        zzfrw zzfrwVar;
        synchronized (zzfrw.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfrw(context);
                }
                zzfrwVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfrwVar;
    }

    public final zzfrr zzh(long j, boolean z2) {
        synchronized (zzfrw.class) {
            try {
                if (this.zzc.zzd()) {
                    return zzb(null, null, j, z2);
                }
                return new zzfrr();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() {
        synchronized (zzfrw.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

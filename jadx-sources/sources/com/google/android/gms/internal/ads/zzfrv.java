package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfrv extends zzfru {
    private static zzfrv zzd;

    private zzfrv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfrv zzj(Context context) {
        zzfrv zzfrvVar;
        synchronized (zzfrv.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfrv(context);
                }
                zzfrvVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfrvVar;
    }

    public final zzfrr zzh(long j, boolean z2) {
        zzfrr zzfrrVarZzb;
        synchronized (zzfrv.class) {
            zzfrrVarZzb = zzb(null, null, j, z2);
        }
        return zzfrrVarZzb;
    }

    public final zzfrr zzi(String str, String str2, long j, boolean z2) {
        zzfrr zzfrrVarZzb;
        synchronized (zzfrv.class) {
            zzfrrVarZzb = zzb(str, str2, j, z2);
        }
        return zzfrrVarZzb;
    }

    public final void zzk() {
        synchronized (zzfrv.class) {
            zzf(false);
        }
    }

    public final void zzl() {
        synchronized (zzfrv.class) {
            zzf(true);
        }
    }
}

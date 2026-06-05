package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfrs {
    private static zzfrs zzb;
    final zzfrt zza;

    private zzfrs(Context context) {
        this.zza = zzfrt.zzb(context);
    }

    public static final zzfrs zza(Context context) {
        zzfrs zzfrsVar;
        synchronized (zzfrs.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfrs(context);
                }
                zzfrsVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzfrsVar;
    }

    public final void zzb(boolean z2) {
        synchronized (zzfrs.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z2));
        }
    }

    public final void zzc(boolean z2) {
        synchronized (zzfrs.class) {
            try {
                zzfrt zzfrtVar = this.zza;
                zzfrtVar.zzd("paidv2_publisher_option", Boolean.valueOf(z2));
                if (!z2) {
                    zzfrtVar.zze("paidv2_creation_time");
                    zzfrtVar.zze("paidv2_id");
                    zzfrtVar.zze("vendor_scoped_gpid_v2_id");
                    zzfrtVar.zze("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzd() {
        boolean zZzf;
        synchronized (zzfrs.class) {
            zZzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zZzf;
    }

    public final boolean zze() {
        boolean zZzf;
        synchronized (zzfrs.class) {
            zZzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zZzf;
    }
}

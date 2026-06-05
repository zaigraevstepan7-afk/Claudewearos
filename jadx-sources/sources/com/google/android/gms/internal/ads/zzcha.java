package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcha {
    private rc.a zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcha zzd(long j) {
        this.zzc = j;
        return this;
    }

    public final zzcha zze(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcha zzf(rc.a aVar) {
        this.zza = aVar;
        return this;
    }
}

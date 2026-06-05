package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzt {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzt zza(int i10) {
        zzdd.zzf(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzv zzb() {
        zzdd.zzf(!this.zzb);
        this.zzb = true;
        return new zzv(this.zza, null);
    }
}

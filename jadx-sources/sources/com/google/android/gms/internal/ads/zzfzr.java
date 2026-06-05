package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfzr extends zzfyf {
    static final zzfyf zza = new zzfzr(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfzr(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzfve.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyf, com.google.android.gms.internal.ads.zzfya
    public final int zza(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final Object[] zzg() {
        return this.zzb;
    }
}

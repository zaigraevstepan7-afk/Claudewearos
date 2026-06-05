package com.google.android.gms.internal.ads;

import java.util.Iterator;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgai extends zzfyk {
    final transient Object zza;

    public zzgai(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfyo(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m1.j("[", this.zza.toString(), "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya
    public final zzfyf zzd() {
        return zzfyf.zzo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya
    /* renamed from: zze */
    public final zzgal iterator() {
        return new zzfyo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return false;
    }
}

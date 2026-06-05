package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfzu extends zzfyk {
    private final transient zzfyi zza;
    private final transient zzfyf zzb;

    public zzfzu(zzfyi zzfyiVar, zzfyf zzfyfVar) {
        this.zza = zzfyiVar;
        this.zzb = zzfyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya
    public final zzfyf zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk, com.google.android.gms.internal.ads.zzfya
    /* renamed from: zze */
    public final zzgal iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return true;
    }
}

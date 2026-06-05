package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfzs extends zzfyf {
    final /* synthetic */ zzfzt zza;

    public zzfzs(zzfzt zzfztVar) {
        this.zza = zzfztVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzfzt zzfztVar = this.zza;
        zzfve.zza(i10, zzfztVar.zzc, "index");
        int i11 = i10 + i10;
        Object obj = zzfztVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzfztVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return true;
    }
}

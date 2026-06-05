package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgzf extends AbstractList {
    private final zzgzd zza;
    private final zzgze zzb;

    public zzgzf(zzgzd zzgzdVar, zzgze zzgzeVar) {
        this.zza = zzgzdVar;
        this.zzb = zzgzeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzd(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}

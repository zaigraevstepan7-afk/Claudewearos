package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfxm extends AbstractCollection {
    final /* synthetic */ zzfxo zza;

    public zzfxm(zzfxo zzfxoVar) {
        this.zza = zzfxoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        return mapZzl != null ? mapZzl.values().iterator() : new zzfxh(zzfxoVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}

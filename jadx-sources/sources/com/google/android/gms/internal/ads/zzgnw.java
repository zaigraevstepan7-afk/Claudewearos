package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgnw implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzgnw(zzgoa zzgoaVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgny(this.zza.iterator(), this.zzb.iterator(), null);
    }
}

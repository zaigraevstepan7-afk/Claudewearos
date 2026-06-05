package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvq implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvt zzb;

    public zzfvq(zzfvt zzfvtVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvtVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfuw.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}

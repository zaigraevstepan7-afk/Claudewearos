package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgcd extends zzgcc {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgcg.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgcg.class, "remainingField");

    private zzgcd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final int zza(zzgcg zzgcgVar) {
        return zzb.decrementAndGet(zzgcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final void zzb(zzgcg zzgcgVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgcgVar, null, set2)) {
            if (atomicReferenceFieldUpdater.get(zzgcgVar) != null && atomicReferenceFieldUpdater.get(zzgcgVar) != null) {
                return;
            }
        }
    }

    public /* synthetic */ zzgcd(zzgcf zzgcfVar) {
        super(null);
    }
}

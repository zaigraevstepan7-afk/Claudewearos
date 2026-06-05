package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnj {
    private static final zzgnj zza = new zzgnj();
    private final AtomicReference zzb = new AtomicReference(new zzgoj(new zzgog(null), null));

    public static zzgnj zza() {
        return zza;
    }

    public final Object zzb(zzgen zzgenVar, Class cls) {
        return ((zzgoj) this.zzb.get()).zzb(zzgenVar, cls);
    }

    public final synchronized void zzc(zzgoe zzgoeVar) {
        AtomicReference atomicReference = this.zzb;
        zzgog zzgogVar = new zzgog((zzgoj) atomicReference.get(), null);
        zzgogVar.zza(zzgoeVar);
        atomicReference.set(new zzgoj(zzgogVar, null));
    }

    public final synchronized void zzd(zzgok zzgokVar) {
        AtomicReference atomicReference = this.zzb;
        zzgog zzgogVar = new zzgog((zzgoj) atomicReference.get(), null);
        zzgogVar.zzb(zzgokVar);
        atomicReference.set(new zzgoj(zzgogVar, null));
    }
}

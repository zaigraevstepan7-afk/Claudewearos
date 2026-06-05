package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgom implements zzgop {
    private final zzgws zza;
    private final zzgtt zzb;

    private zzgom(zzgtt zzgttVar, zzgws zzgwsVar) {
        this.zzb = zzgttVar;
        this.zza = zzgwsVar;
    }

    public static zzgom zza(zzgtt zzgttVar) {
        return new zzgom(zzgttVar, zzgox.zza(zzgttVar.zzi()));
    }

    public static zzgom zzb(zzgtt zzgttVar) {
        return new zzgom(zzgttVar, zzgox.zzb(zzgttVar.zzi()));
    }

    public final zzgtt zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgws zzd() {
        return this.zza;
    }
}

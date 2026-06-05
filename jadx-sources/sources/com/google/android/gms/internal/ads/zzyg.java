package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzyg implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzyg(zzz zzzVar, int i10) {
        this.zza = 1 == (zzzVar.zze & 1);
        this.zzb = zzmb.zza(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyg zzygVar) {
        return zzfxu.zzj().zzd(this.zzb, zzygVar.zzb).zzd(this.zza, zzygVar.zza).zza();
    }
}

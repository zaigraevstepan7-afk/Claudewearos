package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxk extends zzbwp {
    private final String zza;
    private final int zzb;

    public zzbxk(ad.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final String zzf() {
        return this.zza;
    }

    public zzbxk(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }
}

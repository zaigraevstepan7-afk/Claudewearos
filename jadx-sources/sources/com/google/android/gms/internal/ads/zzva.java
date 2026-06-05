package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzva extends zzuv {
    public static final Object zzc = new Object();
    private final Object zzd;
    private final Object zze;

    private zzva(zzbl zzblVar, Object obj, Object obj2) {
        super(zzblVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static zzva zzq(zzap zzapVar) {
        return new zzva(new zzvb(zzapVar), zzbk.zza, zzc);
    }

    public static zzva zzr(zzbl zzblVar, Object obj, Object obj2) {
        return new zzva(zzblVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final int zza(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final zzbj zzd(int i10, zzbj zzbjVar, boolean z2) {
        this.zzb.zzd(i10, zzbjVar, z2);
        if (Objects.equals(zzbjVar.zzb, this.zze) && z2) {
            zzbjVar.zzb = zzc;
        }
        return zzbjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final zzbk zze(int i10, zzbk zzbkVar, long j) {
        this.zzb.zze(i10, zzbkVar, j);
        if (Objects.equals(zzbkVar.zzb, this.zzd)) {
            zzbkVar.zzb = zzbk.zza;
        }
        return zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuv, com.google.android.gms.internal.ads.zzbl
    public final Object zzf(int i10) {
        Object objZzf = this.zzb.zzf(i10);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    public final zzva zzp(zzbl zzblVar) {
        return new zzva(zzblVar, this.zzd, this.zze);
    }
}

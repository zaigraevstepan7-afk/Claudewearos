package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzajs implements zzaes {
    final /* synthetic */ zzaju zza;

    public /* synthetic */ zzajs(zzaju zzajuVar, zzajt zzajtVar) {
        this.zza = zzajuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        zzaju zzajuVar = this.zza;
        return zzajuVar.zzd.zzf(zzajuVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        zzaju zzajuVar = this.zza;
        long jLongValue = BigInteger.valueOf(zzajuVar.zzd.zzg(j)).multiply(BigInteger.valueOf(zzajuVar.zzc - zzajuVar.zzb)).divide(BigInteger.valueOf(zzajuVar.zzf)).longValue() + zzajuVar.zzb;
        long j4 = zzajuVar.zzb;
        long j10 = zzajuVar.zzc - 1;
        String str = zzex.zza;
        zzaet zzaetVar = new zzaet(j, Math.max(j4, Math.min(jLongValue - 30000, j10)));
        return new zzaeq(zzaetVar, zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return true;
    }
}

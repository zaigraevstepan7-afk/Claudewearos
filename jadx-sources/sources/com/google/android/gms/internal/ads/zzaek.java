package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaek implements zzaes {
    private final zzeb zza;
    private final zzeb zzb;
    private long zzc;

    public zzaek(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.zzd(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.zza = new zzeb(length2);
            this.zzb = new zzeb(length2);
        } else {
            int i10 = length2 + 1;
            zzeb zzebVar = new zzeb(i10);
            this.zza = zzebVar;
            zzeb zzebVar2 = new zzeb(i10);
            this.zzb = zzebVar2;
            zzebVar.zzc(0L);
            zzebVar2.zzc(0L);
        }
        this.zza.zzd(jArr);
        this.zzb.zzd(jArr2);
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzaeq zzg(long j) {
        zzeb zzebVar = this.zzb;
        if (zzebVar.zza() == 0) {
            zzaet zzaetVar = zzaet.zza;
            return new zzaeq(zzaetVar, zzaetVar);
        }
        int iZzb = zzex.zzb(zzebVar, j, true, true);
        long jZzb = zzebVar.zzb(iZzb);
        zzeb zzebVar2 = this.zza;
        zzaet zzaetVar2 = new zzaet(jZzb, zzebVar2.zzb(iZzb));
        if (zzaetVar2.zzb == j || iZzb == zzebVar.zza() - 1) {
            return new zzaeq(zzaetVar2, zzaetVar2);
        }
        int i10 = iZzb + 1;
        return new zzaeq(zzaetVar2, new zzaet(zzebVar.zzb(i10), zzebVar2.zzb(i10)));
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean zzh() {
        return this.zzb.zza() > 0;
    }
}

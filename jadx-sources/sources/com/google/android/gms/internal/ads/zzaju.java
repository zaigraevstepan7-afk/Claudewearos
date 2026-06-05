package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaju implements zzaka {
    private final zzajz zza;
    private final long zzb;
    private final long zzc;
    private final zzakf zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaju(zzakf zzakfVar, long j, long j4, long j10, long j11, boolean z2) {
        zzdd.zzd(j >= 0 && j4 > j);
        this.zzd = zzakfVar;
        this.zzb = j;
        this.zzc = j4;
        if (j10 == j4 - j || z2) {
            this.zzf = j11;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajz();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzaka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzd(com.google.android.gms.internal.ads.zzadu r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaju.zzd(com.google.android.gms.internal.ads.zzadu):long");
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* bridge */ /* synthetic */ zzaes zze() {
        zzajt zzajtVar = null;
        if (this.zzf != 0) {
            return new zzajs(this, zzajtVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzg(long j) {
        long j4 = this.zzf - 1;
        String str = zzex.zza;
        this.zzh = Math.max(0L, Math.min(j, j4));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}

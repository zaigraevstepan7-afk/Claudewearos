package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzanc implements zzamx {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaop zzb;
    private zzanb zzg;
    private long zzh;
    private String zzi;
    private zzaez zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzana zze = new zzana(128);
    private long zzl = -9223372036854775807L;
    private final zzanp zzf = new zzanp(178, 128);
    private final zzen zzc = new zzen();

    public zzanc(zzaop zzaopVar, String str) {
        this.zzb = zzaopVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanc.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzi = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzj = zzaezVarZzw;
        this.zzg = new zzanb(zzaezVarZzw);
        this.zzb.zzc(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
        zzdd.zzb(this.zzg);
        if (z2) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        zzfv.zzi(this.zzd);
        this.zze.zzb();
        zzanb zzanbVar = this.zzg;
        if (zzanbVar != null) {
            zzanbVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzagm implements zzadw {
    private final long zzb;
    private final zzadw zzc;

    public zzagm(long j, zzadw zzadwVar) {
        this.zzb = j;
        this.zzc = zzadwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzG() {
        this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final void zzP(zzaes zzaesVar) {
        this.zzc.zzP(new zzagl(this, zzaesVar, zzaesVar));
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final zzaez zzw(int i10, int i11) {
        return this.zzc.zzw(i10, i11);
    }
}

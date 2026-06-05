package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzafs implements zzadt {
    private final zzen zza = new zzen(4);
    private final zzaeu zzb = new zzaeu(-1, -1, "image/avif");

    private final boolean zza(zzadu zzaduVar, int i10) {
        zzen zzenVar = this.zza;
        zzenVar.zzI(4);
        ((zzadj) zzaduVar).zzm(zzenVar.zzN(), 0, 4, false);
        return zzenVar.zzu() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final int zzb(zzadu zzaduVar, zzaep zzaepVar) {
        return this.zzb.zzb(zzaduVar, zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ List zzd() {
        return zzfyf.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zze(zzadw zzadwVar) {
        this.zzb.zze(zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzf(long j, long j4) {
        this.zzb.zzf(j, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzi(zzadu zzaduVar) throws EOFException, InterruptedIOException {
        ((zzadj) zzaduVar).zzl(4, false);
        return zza(zzaduVar, 1718909296) && zza(zzaduVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final /* synthetic */ zzadt zzc() {
        return this;
    }
}

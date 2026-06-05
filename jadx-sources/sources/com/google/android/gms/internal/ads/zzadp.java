package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadp implements zzaez {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z2) {
        return zzaex.zza(this, zzlVar, i10, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i10, boolean z2, int i11) throws EOFException {
        int iZza = zzlVar.zza(this.zza, 0, Math.min(4096, i10));
        if (iZza != -1) {
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i10) {
        zzaex.zzb(this, zzenVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i10, int i11) {
        zzenVar.zzM(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(long j, int i10, int i11, int i12, zzaey zzaeyVar) {
    }
}

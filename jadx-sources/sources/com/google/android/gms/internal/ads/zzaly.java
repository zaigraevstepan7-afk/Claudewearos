package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaly implements zzakr {
    private final zzen zza = new zzen();
    private final zzen zzb = new zzen();
    private final zzalx zzc;
    private Inflater zzd;

    public zzaly(List list) {
        zzalx zzalxVar = new zzalx();
        this.zzc = zzalxVar;
        zzalxVar.zzb(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i11 + i10);
        zzenVar.zzL(i10);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzen zzenVar2 = this.zzb;
        if (zzex.zzO(zzenVar, zzenVar2, this.zzd)) {
            zzenVar.zzJ(zzenVar2.zzN(), zzenVar2.zzd());
        }
        zzalx zzalxVar = this.zzc;
        zzalxVar.zzd();
        int iZza = zzenVar.zza();
        zzcu zzcuVarZza = null;
        if (iZza >= 2 && zzenVar.zzq() == iZza) {
            zzalxVar.zzc(zzenVar);
            zzcuVarZza = zzalxVar.zza(zzenVar);
        }
        zzdnVar.zza(new zzakj(zzcuVarZza != null ? zzfyf.zzo(zzcuVarZza) : zzfyf.zzn(), -9223372036854775807L, 5000000L));
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamv implements zzamx {
    private final zzen zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaez zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamv(String str, int i10, int i11, String str2) {
        this.zza = new zzen(new byte[i11]);
        this.zzc = str;
        this.zzd = i10;
    }

    private final void zzf(zzadq zzadqVar) {
        int i10;
        int i11 = zzadqVar.zzb;
        if (i11 == -2147483647 || (i10 = zzadqVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i10 == zzzVar.zzG && i11 == zzzVar.zzH && Objects.equals(zzadqVar.zza, zzzVar.zzo)) {
            return;
        }
        zzz zzzVar2 = this.zzl;
        zzx zzxVar = zzzVar2 == null ? new zzx() : zzzVar2.zzb();
        zzxVar.zzS(this.zzf);
        zzxVar.zzG(this.zze);
        zzxVar.zzah(zzadqVar.zza);
        zzxVar.zzD(i10);
        zzxVar.zzai(i11);
        zzxVar.zzW(this.zzc);
        zzxVar.zzaf(this.zzd);
        zzz zzzVarZzan = zzxVar.zzan();
        this.zzl = zzzVarZzan;
        this.zzg.zzm(zzzVarZzan);
    }

    private final boolean zzg(zzen zzenVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzenVar.zza(), i10 - this.zzi);
        zzenVar.zzH(bArr, this.zzi, iMin);
        int i11 = this.zzi + iMin;
        this.zzi = i11;
        return i11 == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f1  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r23) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzf = zzaolVar.zzb();
        this.zzg = zzadwVar.zzw(zzaolVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
    }
}

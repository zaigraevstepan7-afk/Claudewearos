package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzamw implements zzamx {
    private final List zza;
    private final zzaez[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzamw(List list, String str) {
        this.zza = list;
        this.zzc = new zzaez[list.size()];
    }

    private final boolean zzf(zzen zzenVar, int i10) {
        if (zzenVar.zza() == 0) {
            return false;
        }
        if (zzenVar.zzm() != i10) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzenVar, 32)) {
                if (this.zze != 1 || zzf(zzenVar, 0)) {
                    int iZzc = zzenVar.zzc();
                    int iZza = zzenVar.zza();
                    for (zzaez zzaezVar : this.zzc) {
                        zzenVar.zzL(iZzc);
                        zzaezVar.zzr(zzenVar, iZza);
                    }
                    this.zzf += iZza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        int i10 = 0;
        while (true) {
            zzaez[] zzaezVarArr = this.zzc;
            if (i10 >= zzaezVarArr.length) {
                return;
            }
            zzaoi zzaoiVar = (zzaoi) this.zza.get(i10);
            zzaolVar.zzc();
            zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 3);
            zzx zzxVar = new zzx();
            zzxVar.zzS(zzaolVar.zzb());
            zzxVar.zzG(this.zzb);
            zzxVar.zzah("application/dvbsubs");
            zzxVar.zzT(Collections.singletonList(zzaoiVar.zzb));
            zzxVar.zzW(zzaoiVar.zza);
            zzaezVarZzw.zzm(zzxVar.zzan());
            zzaezVarArr[i10] = zzaezVarZzw;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
        if (this.zzd) {
            zzdd.zzf(this.zzg != -9223372036854775807L);
            for (zzaez zzaezVar : this.zzc) {
                zzaezVar.zzt(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }
}

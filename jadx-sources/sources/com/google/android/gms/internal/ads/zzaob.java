package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaob {
    private final List zza;
    private final zzaez[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfz zzd = new zzfz(new zzfy() { // from class: com.google.android.gms.internal.ads.zzaoa
        @Override // com.google.android.gms.internal.ads.zzfy
        public final void zza(long j, zzen zzenVar) {
            zzadg.zza(j, zzenVar, this.zza.zzc);
        }
    });

    public zzaob(List list, String str) {
        this.zza = list;
        this.zzc = new zzaez[list.size()];
    }

    public final void zzb() {
        this.zzd.zzd();
    }

    public final void zzc(long j, zzen zzenVar) {
        this.zzd.zzb(j, zzenVar);
    }

    public final void zzd(zzadw zzadwVar, zzaol zzaolVar) {
        int i10 = 0;
        while (true) {
            zzaez[] zzaezVarArr = this.zzc;
            if (i10 >= zzaezVarArr.length) {
                return;
            }
            zzaolVar.zzc();
            zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 3);
            zzz zzzVar = (zzz) this.zza.get(i10);
            String str = zzzVar.zzo;
            boolean z2 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z2 = false;
            }
            zzdd.zze(z2, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String strZzb = zzzVar.zza;
            if (strZzb == null) {
                strZzb = zzaolVar.zzb();
            }
            zzx zzxVar = new zzx();
            zzxVar.zzS(strZzb);
            zzxVar.zzG(this.zzb);
            zzxVar.zzah(str);
            zzxVar.zzaj(zzzVar.zze);
            zzxVar.zzW(zzzVar.zzd);
            zzxVar.zzB(zzzVar.zzL);
            zzxVar.zzT(zzzVar.zzr);
            zzaezVarZzw.zzm(zzxVar.zzan());
            zzaezVarArr[i10] = zzaezVarZzw;
            i10++;
        }
    }

    public final void zze() {
        this.zzd.zzd();
    }

    public final void zzf(int i10) {
        this.zzd.zze(i10);
    }
}

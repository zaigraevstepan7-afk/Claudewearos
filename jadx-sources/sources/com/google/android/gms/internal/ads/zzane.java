package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzane implements zzamx {
    private final zzaob zza;
    private long zzf;
    private String zzh;
    private zzaez zzi;
    private zzand zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzanp zzc = new zzanp(7, 128);
    private final zzanp zzd = new zzanp(8, 128);
    private final zzanp zze = new zzanp(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzane(zzaob zzaobVar, boolean z2, boolean z10, String str) {
        this.zza = zzaobVar;
    }

    private final void zzf(long j, int i10, int i11, long j4) {
        if (!this.zzk) {
            zzanp zzanpVar = this.zzc;
            zzanpVar.zzd(i11);
            zzanp zzanpVar2 = this.zzd;
            zzanpVar2.zzd(i11);
            if (this.zzk) {
                if (zzanpVar.zze()) {
                    zzfu zzfuVarZzg = zzfv.zzg(zzanpVar.zza, 4, zzanpVar.zzb);
                    this.zza.zzf(zzfuVarZzg.zzm);
                    this.zzj.zzb(zzfuVarZzg);
                    zzanpVar.zzb();
                } else if (zzanpVar2.zze()) {
                    this.zzj.zza(zzfv.zzf(zzanpVar2.zza, 4, zzanpVar2.zzb));
                    zzanpVar2.zzb();
                }
            } else if (zzanpVar.zze() && zzanpVar2.zze()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzanpVar.zza, zzanpVar.zzb));
                arrayList.add(Arrays.copyOf(zzanpVar2.zza, zzanpVar2.zzb));
                zzfu zzfuVarZzg2 = zzfv.zzg(zzanpVar.zza, 4, zzanpVar.zzb);
                zzft zzftVarZzf = zzfv.zzf(zzanpVar2.zza, 4, zzanpVar2.zzb);
                String strZzc = zzdk.zzc(zzfuVarZzg2.zza, zzfuVarZzg2.zzb, zzfuVarZzg2.zzc);
                zzaez zzaezVar = this.zzi;
                zzx zzxVar = new zzx();
                zzxVar.zzS(this.zzh);
                zzxVar.zzG(this.zzb);
                zzxVar.zzah("video/avc");
                zzxVar.zzE(strZzc);
                zzxVar.zzam(zzfuVarZzg2.zze);
                zzxVar.zzQ(zzfuVarZzg2.zzf);
                zzi zziVar = new zzi();
                zziVar.zzc(zzfuVarZzg2.zzj);
                zziVar.zzb(zzfuVarZzg2.zzk);
                zziVar.zzd(zzfuVarZzg2.zzl);
                zziVar.zzf(zzfuVarZzg2.zzh + 8);
                zziVar.zza(zzfuVarZzg2.zzi + 8);
                zzxVar.zzF(zziVar.zzg());
                zzxVar.zzad(zzfuVarZzg2.zzg);
                zzxVar.zzT(arrayList);
                int i12 = zzfuVarZzg2.zzm;
                zzxVar.zzY(i12);
                zzaezVar.zzm(zzxVar.zzan());
                this.zzk = true;
                this.zza.zzf(i12);
                this.zzj.zzb(zzfuVarZzg2);
                this.zzj.zza(zzftVarZzf);
                zzanpVar.zzb();
                zzanpVar2.zzb();
            }
        }
        zzanp zzanpVar3 = this.zze;
        if (zzanpVar3.zzd(i11)) {
            int iZzc = zzfv.zzc(zzanpVar3.zza, zzanpVar3.zzb);
            zzen zzenVar = this.zzn;
            zzenVar.zzJ(zzanpVar3.zza, iZzc);
            zzenVar.zzL(4);
            this.zza.zzc(j4, zzenVar);
        }
        if (this.zzj.zze(j, i10, this.zzk)) {
            this.zzm = false;
        }
    }

    private final void zzg(byte[] bArr, int i10, int i11) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i10, i11);
            this.zzd.zza(bArr, i10, i11);
        }
        this.zze.zza(bArr, i10, i11);
    }

    private final void zzh(long j, int i10, long j4) {
        if (!this.zzk) {
            this.zzc.zzc(i10);
            this.zzd.zzc(i10);
        }
        this.zze.zzc(i10);
        this.zzj.zzd(j, i10, j4, this.zzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // com.google.android.gms.internal.ads.zzamx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzaez r1 = r14.zzi
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
            int r1 = r15.zzc()
            int r7 = r15.zzd()
            byte[] r8 = r15.zzN()
            long r2 = r14.zzf
            int r4 = r15.zza()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.zzf = r2
            com.google.android.gms.internal.ads.zzaez r2 = r14.zzi
            int r3 = r15.zza()
            r2.zzr(r15, r3)
        L26:
            boolean[] r2 = r14.zzg
            int r2 = com.google.android.gms.internal.ads.zzfv.zza(r8, r1, r7, r2)
            if (r2 == r7) goto L68
            int r3 = r2 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r2 <= 0) goto L41
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L41
            r3 = 4
            r11 = r3
            r10 = r4
            goto L43
        L41:
            r10 = r2
            r11 = r3
        L43:
            int r2 = r10 - r1
            if (r2 <= 0) goto L4a
            r14.zzg(r8, r1, r10)
        L4a:
            int r3 = r7 - r10
            long r4 = r14.zzf
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L55
            int r1 = -r2
        L53:
            r12 = r4
            goto L57
        L55:
            r1 = 0
            goto L53
        L57:
            long r5 = r14.zzl
            r0 = r14
            r4 = r1
            r1 = r12
            r0.zzf(r1, r3, r4, r5)
            long r4 = r14.zzl
            r3 = r9
            r0.zzh(r1, r3, r4)
            int r1 = r10 + r11
            goto L26
        L68:
            r14.zzg(r8, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzane.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzh = zzaolVar.zzb();
        zzaez zzaezVarZzw = zzadwVar.zzw(zzaolVar.zza(), 2);
        this.zzi = zzaezVarZzw;
        this.zzj = new zzand(zzaezVarZzw, false, false);
        this.zza.zzd(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
        zzdd.zzb(this.zzi);
        String str = zzex.zza;
        if (z2) {
            this.zza.zze();
            zzf(this.zzf, 0, 0, this.zzl);
            zzh(this.zzf, 9, this.zzl);
            zzf(this.zzf, 0, 0, this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzl = j;
        int i11 = i10 & 2;
        this.zzm = (i11 != 0) | this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfv.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzand zzandVar = this.zzj;
        if (zzandVar != null) {
            zzandVar.zzc();
        }
    }
}

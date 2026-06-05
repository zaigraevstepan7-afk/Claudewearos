package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzwy implements zzaez {
    private boolean zzA;
    private zzsi zzB;
    private final zzws zza;
    private final zzsh zzd;
    private final zzsc zze;
    private zzww zzf;
    private zzz zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzz zzy;
    private final zzwu zzb = new zzwu();
    private int zzh = zzbch.zzq.zzf;
    private long[] zzi = new long[zzbch.zzq.zzf];
    private long[] zzj = new long[zzbch.zzq.zzf];
    private long[] zzm = new long[zzbch.zzq.zzf];
    private int[] zzl = new int[zzbch.zzq.zzf];
    private int[] zzk = new int[zzbch.zzq.zzf];
    private zzaey[] zzn = new zzaey[zzbch.zzq.zzf];
    private final zzxf zzc = new zzxf(new zzdn() { // from class: com.google.android.gms.internal.ads.zzwt
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            zzsg zzsgVar = ((zzwv) obj).zzb;
        }
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;
    private boolean zzz = true;

    public zzwy(zzzm zzzmVar, zzsh zzshVar, zzsc zzscVar) {
        this.zzd = zzshVar;
        this.zze = zzscVar;
        this.zza = new zzws(zzzmVar);
    }

    private final int zzB(int i10, int i11, long j, boolean z2) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j4 = this.zzm[i10];
            if (j4 > j) {
                break;
            }
            if (!z2 || (this.zzl[i10] & 1) != 0) {
                if (j4 == j) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    private final int zzC(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzD(zzkv zzkvVar, zzhs zzhsVar, boolean z2, boolean z10, zzwu zzwuVar) {
        try {
            zzhsVar.zzd = false;
            if (!zzL()) {
                if (!z10 && !this.zzv) {
                    zzz zzzVar = this.zzy;
                    if (zzzVar == null || (!z2 && zzzVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzzVar, zzkvVar);
                    return -5;
                }
                zzhsVar.zzc(4);
                zzhsVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzz zzzVar2 = ((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza;
            if (!z2 && zzzVar2 == this.zzg) {
                int iZzC = zzC(this.zzr);
                if (!zzM(iZzC)) {
                    zzhsVar.zzd = true;
                    return -3;
                }
                zzhsVar.zzc(this.zzl[iZzC]);
                if (this.zzr == this.zzo - 1 && (z10 || this.zzv)) {
                    zzhsVar.zza(536870912);
                }
                zzhsVar.zze = this.zzm[iZzC];
                zzwuVar.zza = this.zzk[iZzC];
                zzwuVar.zzb = this.zzj[iZzC];
                zzwuVar.zzc = this.zzn[iZzC];
                return -4;
            }
            zzI(zzzVar2, zzkvVar);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized long zzE(long r8, boolean r10, boolean r11) throws java.lang.Throwable {
        /*
            r7 = this;
            monitor-enter(r7)
            int r10 = r7.zzo     // Catch: java.lang.Throwable -> L32
            if (r10 == 0) goto Lf
            long[] r0 = r7.zzm     // Catch: java.lang.Throwable -> L32
            int r2 = r7.zzq     // Catch: java.lang.Throwable -> L32
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L32
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L11
        Lf:
            r1 = r7
            goto L35
        L11:
            if (r11 == 0) goto L19
            int r11 = r7.zzr     // Catch: java.lang.Throwable -> L1b
            if (r11 == r10) goto L19
            int r10 = r11 + 1
        L19:
            r3 = r10
            goto L1f
        L1b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L39
        L1f:
            r6 = 0
            r1 = r7
            r4 = r8
            int r8 = r1.zzB(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2f
            r9 = -1
            if (r8 == r9) goto L35
            long r8 = r7.zzG(r8)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r7)
            return r8
        L2f:
            r0 = move-exception
        L30:
            r8 = r0
            goto L39
        L32:
            r0 = move-exception
            r1 = r7
            goto L30
        L35:
            monitor-exit(r7)
            r8 = -1
            return r8
        L39:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwy.zzE(long, boolean, boolean):long");
    }

    private final synchronized long zzF() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzG(i10);
    }

    private final long zzG(int i10) {
        long j = this.zzt;
        long jMax = Long.MIN_VALUE;
        if (i10 != 0) {
            int iZzC = zzC(i10 - 1);
            for (int i11 = 0; i11 < i10; i11++) {
                jMax = Math.max(jMax, this.zzm[iZzC]);
                if ((this.zzl[iZzC] & 1) != 0) {
                    break;
                }
                iZzC--;
                if (iZzC == -1) {
                    iZzC = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j, jMax);
        this.zzo -= i10;
        int i12 = this.zzp + i10;
        this.zzp = i12;
        int i13 = this.zzq + i10;
        this.zzq = i13;
        int i14 = this.zzh;
        if (i13 >= i14) {
            this.zzq = i13 - i14;
        }
        int i15 = this.zzr - i10;
        this.zzr = i15;
        if (i15 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i12);
        if (this.zzo != 0) {
            return this.zzj[this.zzq];
        }
        int i16 = this.zzq;
        if (i16 == 0) {
            i16 = this.zzh;
        }
        return this.zzj[i16 - 1] + this.zzk[r12];
    }

    private final synchronized void zzH(long j, int i10, long j4, int i11, zzaey zzaeyVar) {
        try {
            int i12 = this.zzo;
            if (i12 > 0) {
                int iZzC = zzC(i12 - 1);
                zzdd.zzd(this.zzj[iZzC] + ((long) this.zzk[iZzC]) <= j4);
            }
            this.zzv = (536870912 & i10) != 0;
            this.zzu = Math.max(this.zzu, j);
            int iZzC2 = zzC(this.zzo);
            this.zzm[iZzC2] = j;
            this.zzj[iZzC2] = j4;
            this.zzk[iZzC2] = i11;
            this.zzl[iZzC2] = i10;
            this.zzn[iZzC2] = zzaeyVar;
            this.zzi[iZzC2] = 0;
            zzxf zzxfVar = this.zzc;
            if (zzxfVar.zzf() || !((zzwv) zzxfVar.zzb()).zza.equals(this.zzy)) {
                zzz zzzVar = this.zzy;
                if (zzzVar == null) {
                    throw null;
                }
                zzxfVar.zzc(this.zzp + this.zzo, new zzwv(zzzVar, this.zzd.zzb(this.zze, zzzVar), null));
            }
            int i13 = this.zzo + 1;
            this.zzo = i13;
            int i14 = this.zzh;
            if (i13 == i14) {
                int i15 = i14 + zzbch.zzq.zzf;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                zzaey[] zzaeyVarArr = new zzaey[i15];
                int i16 = this.zzq;
                int i17 = i14 - i16;
                System.arraycopy(this.zzj, i16, jArr2, 0, i17);
                System.arraycopy(this.zzm, this.zzq, jArr3, 0, i17);
                System.arraycopy(this.zzl, this.zzq, iArr, 0, i17);
                System.arraycopy(this.zzk, this.zzq, iArr2, 0, i17);
                System.arraycopy(this.zzn, this.zzq, zzaeyVarArr, 0, i17);
                System.arraycopy(this.zzi, this.zzq, jArr, 0, i17);
                int i18 = this.zzq;
                System.arraycopy(this.zzj, 0, jArr2, i17, i18);
                System.arraycopy(this.zzm, 0, jArr3, i17, i18);
                System.arraycopy(this.zzl, 0, iArr, i17, i18);
                System.arraycopy(this.zzk, 0, iArr2, i17, i18);
                System.arraycopy(this.zzn, 0, zzaeyVarArr, i17, i18);
                System.arraycopy(this.zzi, 0, jArr, i17, i18);
                this.zzj = jArr2;
                this.zzm = jArr3;
                this.zzl = iArr;
                this.zzk = iArr2;
                this.zzn = zzaeyVarArr;
                this.zzi = jArr;
                this.zzq = 0;
                this.zzh = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void zzI(zzz zzzVar, zzkv zzkvVar) {
        zzz zzzVar2 = this.zzg;
        zzs zzsVar = zzzVar2 == null ? null : zzzVar2.zzs;
        this.zzg = zzzVar;
        zzs zzsVar2 = zzzVar.zzs;
        zzsh zzshVar = this.zzd;
        zzkvVar.zza = zzzVar.zzc(zzshVar.zza(zzzVar));
        zzkvVar.zzb = this.zzB;
        if (zzzVar2 == null || !Objects.equals(zzsVar, zzsVar2)) {
            zzsi zzsiVarZzc = zzshVar.zzc(this.zze, zzzVar);
            this.zzB = zzsiVarZzc;
            zzkvVar.zzb = zzsiVarZzc;
        }
    }

    private final void zzJ() {
        if (this.zzB != null) {
            this.zzB = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzK() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzL() {
        return this.zzr != this.zzo;
    }

    private final boolean zzM(int i10) {
        if (this.zzB == null) {
            return true;
        }
        int i11 = this.zzl[i10];
        return false;
    }

    private final synchronized boolean zzN(zzz zzzVar) {
        try {
            this.zzx = false;
            if (Objects.equals(zzzVar, this.zzy)) {
                return false;
            }
            zzxf zzxfVar = this.zzc;
            if (zzxfVar.zzf() || !((zzwv) zzxfVar.zzb()).zza.equals(zzzVar)) {
                this.zzy = zzzVar;
            } else {
                this.zzy = ((zzwv) zzxfVar.zzb()).zza;
            }
            boolean z2 = this.zzz;
            zzz zzzVar2 = this.zzy;
            this.zzz = z2 & zzay.zzf(zzzVar2.zzo, zzzVar2.zzk);
            this.zzA = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzA(long j, boolean z2) throws Throwable {
        Throwable th2;
        zzwy zzwyVar;
        long j4;
        int iZzB;
        try {
            try {
                zzK();
                int i10 = this.zzr;
                int iZzC = zzC(i10);
                if (zzL() && j >= this.zzm[iZzC]) {
                    if (j > this.zzu) {
                        if (z2) {
                            z2 = true;
                        }
                    }
                    if (this.zzz) {
                        try {
                            int i11 = this.zzo - i10;
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    if (this.zzm[iZzC] >= j) {
                                        zzwyVar = this;
                                        j4 = j;
                                        iZzB = i12;
                                        break;
                                    }
                                    iZzC++;
                                    if (iZzC == this.zzh) {
                                        iZzC = 0;
                                    }
                                    i12++;
                                } else if (z2) {
                                    j4 = j;
                                    iZzB = i11;
                                    zzwyVar = this;
                                } else {
                                    zzwyVar = this;
                                    j4 = j;
                                    iZzB = -1;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } else {
                        zzwyVar = this;
                        j4 = j;
                        iZzB = zzwyVar.zzB(iZzC, this.zzo - i10, j4, true);
                    }
                    if (iZzB != -1) {
                        zzwyVar.zzs = j4;
                        zzwyVar.zzr += iZzB;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int zza() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzc(long j, boolean z2) {
        Throwable th2;
        try {
            try {
                int i10 = this.zzr;
                int iZzC = zzC(i10);
                if (!zzL() || j < this.zzm[iZzC]) {
                    return 0;
                }
                if (j <= this.zzu || !z2) {
                    int iZzB = zzB(iZzC, this.zzo - i10, j, true);
                    if (iZzB == -1) {
                        return 0;
                    }
                    return iZzB;
                }
                try {
                    return this.zzo - i10;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final int zzd() {
        return this.zzp + this.zzo;
    }

    public final int zze(zzkv zzkvVar, zzhs zzhsVar, int i10, boolean z2) {
        boolean z10 = (i10 & 2) != 0;
        zzwu zzwuVar = this.zzb;
        int iZzD = zzD(zzkvVar, zzhsVar, z10, z2, zzwuVar);
        if (iZzD != -4) {
            return iZzD;
        }
        if (!zzhsVar.zzf()) {
            int i11 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i11 != 0) {
                    this.zza.zzd(zzhsVar, zzwuVar);
                    return -4;
                }
                this.zza.zze(zzhsVar, zzwuVar);
            } else if (i11 != 0) {
                return -4;
            }
            this.zzr++;
        }
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ int zzf(zzl zzlVar, int i10, boolean z2) {
        return zzaex.zza(this, zzlVar, i10, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final int zzg(zzl zzlVar, int i10, boolean z2, int i11) {
        return this.zza.zza(zzlVar, i10, z2);
    }

    public final synchronized long zzh() {
        return this.zzu;
    }

    public final synchronized zzz zzi() {
        if (this.zzx) {
            return null;
        }
        return this.zzy;
    }

    public final void zzj(long j, boolean z2, boolean z10) {
        this.zza.zzc(zzE(j, false, z10));
    }

    public final void zzk() {
        this.zza.zzc(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzm(zzz zzzVar) {
        boolean zZzN = zzN(zzzVar);
        zzww zzwwVar = this.zzf;
        if (zzwwVar == null || !zZzN) {
            return;
        }
        zzwwVar.zzN(zzzVar);
    }

    public final void zzn() throws zzsa {
        zzsi zzsiVar = this.zzB;
        if (zzsiVar != null) {
            throw zzsiVar.zza();
        }
    }

    public final void zzo() {
        zzk();
        zzJ();
    }

    public final void zzp() {
        zzq(true);
        zzJ();
    }

    public final void zzq(boolean z2) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z2) {
            this.zzy = null;
            this.zzx = true;
            this.zzz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzr(zzen zzenVar, int i10) {
        zzaex.zzb(this, zzenVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzs(zzen zzenVar, int i10, int i11) {
        this.zza.zzh(zzenVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final void zzt(long j, int i10, int i11, int i12, zzaey zzaeyVar) {
        if (this.zzw) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.zzw = false;
            }
        }
        if (this.zzz) {
            if (j < this.zzs) {
                return;
            }
            if ((i10 & 1) == 0) {
                if (!this.zzA) {
                    zzea.zzf("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzy)));
                    this.zzA = true;
                }
                i10 |= 1;
            }
        }
        zzH(j, i10, (this.zza.zzb() - i11) - i12, i11, zzaeyVar);
    }

    public final void zzu(long j) {
        this.zzs = j;
    }

    public final void zzv(zzww zzwwVar) {
        this.zzf = zzwwVar;
    }

    public final synchronized void zzw(int i10) {
        boolean z2 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z2 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzdd.zzd(z2);
        this.zzr += i10;
    }

    public final synchronized boolean zzx() {
        return this.zzv;
    }

    public final synchronized boolean zzy(boolean z2) {
        boolean z10 = true;
        if (zzL()) {
            if (((zzwv) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzM(zzC(this.zzr));
        }
        if (!z2 && !this.zzv) {
            zzz zzzVar = this.zzy;
            if (zzzVar == null) {
                z10 = false;
            } else if (zzzVar == this.zzg) {
                return false;
            }
        }
        return z10;
    }

    public final synchronized boolean zzz(int i10) {
        zzK();
        int i11 = this.zzp;
        if (i10 >= i11 && i10 <= this.zzo + i11) {
            this.zzs = Long.MIN_VALUE;
            this.zzr = i10 - i11;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaez
    public final /* synthetic */ void zzl(long j) {
    }
}

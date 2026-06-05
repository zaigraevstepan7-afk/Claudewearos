package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzanr implements zzaom {
    private final zzamx zza;
    private final zzem zzb = new zzem(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzeu zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzanr(zzamx zzamxVar) {
        this.zza = zzamxVar;
    }

    private final void zze(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zzf(zzen zzenVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzenVar.zza(), i10 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzenVar.zzM(iMin);
        } else {
            zzenVar.zzH(bArr, this.zzd, iMin);
        }
        int i11 = this.zzd + iMin;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zza(zzen zzenVar, int i10) {
        int i11;
        int i12;
        int i13;
        long jZzb;
        long j;
        zzdd.zzb(this.zze);
        int i14 = -1;
        int i15 = 2;
        if ((i10 & 1) != 0) {
            int i16 = this.zzc;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    int i17 = this.zzj;
                    if (i17 != -1) {
                        zzea.zzf("PesReader", "Unexpected start indicator: expected " + i17 + " more bytes");
                    }
                    this.zza.zzc(zzenVar.zzd() == 0);
                } else {
                    zzea.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i18 = i10;
        while (zzenVar.zza() > 0) {
            int i19 = this.zzc;
            if (i19 == 0) {
                i11 = i15;
                i12 = i14;
                zzenVar.zzM(zzenVar.zza());
            } else if (i19 != 1) {
                if (i19 != i15) {
                    int iZza = zzenVar.zza();
                    int i20 = this.zzj;
                    int i21 = i20 == i14 ? 0 : iZza - i20;
                    if (i21 > 0) {
                        iZza -= i21;
                        zzenVar.zzK(zzenVar.zzc() + iZza);
                    }
                    zzamx zzamxVar = this.zza;
                    zzamxVar.zza(zzenVar);
                    int i22 = this.zzj;
                    if (i22 != i14) {
                        int i23 = i22 - iZza;
                        this.zzj = i23;
                        if (i23 == 0) {
                            zzamxVar.zzc(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzem zzemVar = this.zzb;
                    if (zzf(zzenVar, zzemVar.zza, iMin) && zzf(zzenVar, null, this.zzi)) {
                        zzemVar.zzl(0);
                        if (this.zzf) {
                            zzemVar.zzn(4);
                            long jZzd = zzemVar.zzd(3);
                            zzemVar.zzn(1);
                            int iZzd = zzemVar.zzd(15) << 15;
                            zzemVar.zzn(1);
                            long jZzd2 = zzemVar.zzd(15);
                            zzemVar.zzn(1);
                            if (this.zzh || !this.zzg) {
                                j = jZzd;
                            } else {
                                zzemVar.zzn(4);
                                j = jZzd;
                                zzemVar.zzn(1);
                                int iZzd2 = zzemVar.zzd(15) << 15;
                                zzemVar.zzn(1);
                                long jZzd3 = zzemVar.zzd(15);
                                zzemVar.zzn(1);
                                this.zze.zzb((zzemVar.zzd(3) << 30) | iZzd2 | jZzd3);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb(jZzd2 | (j << 30) | iZzd);
                        } else {
                            jZzb = -9223372036854775807L;
                        }
                        i18 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i18);
                        zze(3);
                        i14 = -1;
                        i15 = 2;
                    }
                }
                i11 = i15;
                i12 = i14;
            } else {
                zzem zzemVar2 = this.zzb;
                if (zzf(zzenVar, zzemVar2.zza, 9)) {
                    zzemVar2.zzl(0);
                    int iZzd3 = zzemVar2.zzd(24);
                    if (iZzd3 != 1) {
                        m6.a.n(iZzd3, "Unexpected start code prefix: ", "PesReader");
                        this.zzj = -1;
                        i12 = -1;
                        i13 = 0;
                        i11 = 2;
                    } else {
                        zzemVar2.zzn(8);
                        int iZzd4 = zzemVar2.zzd(16);
                        zzemVar2.zzn(5);
                        this.zzk = zzemVar2.zzp();
                        i11 = 2;
                        zzemVar2.zzn(2);
                        this.zzf = zzemVar2.zzp();
                        this.zzg = zzemVar2.zzp();
                        zzemVar2.zzn(6);
                        int iZzd5 = zzemVar2.zzd(8);
                        this.zzi = iZzd5;
                        i12 = -1;
                        if (iZzd4 == 0) {
                            this.zzj = -1;
                        } else {
                            int i24 = (iZzd4 - 3) - iZzd5;
                            this.zzj = i24;
                            if (i24 < 0) {
                                m6.a.n(i24, "Found negative packet payload size: ", "PesReader");
                                this.zzj = -1;
                            }
                        }
                        i13 = 2;
                    }
                    zze(i13);
                } else {
                    i12 = -1;
                    i11 = 2;
                }
            }
            i14 = i12;
            i15 = i11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzb(zzeu zzeuVar, zzadw zzadwVar, zzaol zzaolVar) {
        this.zze = zzeuVar;
        this.zza.zzb(zzadwVar, zzaolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z2) {
        return this.zzc == 3 && this.zzj == -1;
    }
}

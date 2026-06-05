package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzani implements zzamx {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzen zzd;
    private final zzem zze;
    private zzaez zzf;
    private String zzg;
    private zzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzani(String str, int i10, String str2) {
        this.zza = str;
        this.zzb = i10;
        zzen zzenVar = new zzen(1024);
        this.zzd = zzenVar;
        byte[] bArrZzN = zzenVar.zzN();
        this.zze = new zzem(bArrZzN, bArrZzN.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzem zzemVar) throws zzaz {
        int iZza = zzemVar.zza();
        zzaco zzacoVarZzb = zzacq.zzb(zzemVar, true);
        this.zzw = zzacoVarZzb.zzc;
        this.zzt = zzacoVarZzb.zza;
        this.zzv = zzacoVarZzb.zzb;
        return iZza - zzemVar.zza();
    }

    private static long zzg(zzem zzemVar) {
        return zzemVar.zzd((zzemVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zza(zzen zzenVar) throws zzaz {
        int i10;
        int i11;
        int iZzd;
        boolean zZzp;
        zzdd.zzb(this.zzf);
        while (zzenVar.zza() > 0) {
            int i12 = this.zzi;
            if (i12 != 0) {
                if (i12 == 1) {
                    int iZzm = zzenVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzl = iZzm;
                        this.zzi = 2;
                    } else if (iZzm != 86) {
                        this.zzi = 0;
                    }
                } else if (i12 != 2) {
                    int iMin = Math.min(zzenVar.zza(), this.zzk - this.zzj);
                    zzem zzemVar = this.zze;
                    zzenVar.zzH(zzemVar.zza, this.zzj, iMin);
                    int i13 = this.zzj + iMin;
                    this.zzj = i13;
                    if (i13 == this.zzk) {
                        zzemVar.zzl(0);
                        if (zzemVar.zzp()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzd2 = zzemVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzemVar.zzd(1);
                                i11 = 1;
                            } else {
                                i11 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzo = iZzd;
                            if (iZzd != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i11 == 1) {
                                zzg(zzemVar);
                                i11 = 1;
                            }
                            if (!zzemVar.zzp()) {
                                throw zzaz.zza(null, null);
                            }
                            this.zzp = zzemVar.zzd(6);
                            int iZzd3 = zzemVar.zzd(4);
                            int iZzd4 = zzemVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i11 == 0) {
                                int iZzc = zzemVar.zzc();
                                int iZzf = zzf(zzemVar);
                                zzemVar.zzl(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzemVar.zzh(bArr, 0, iZzf);
                                zzx zzxVar = new zzx();
                                zzxVar.zzS(this.zzg);
                                zzxVar.zzG(this.zzc);
                                zzxVar.zzah("audio/mp4a-latm");
                                zzxVar.zzE(this.zzw);
                                zzxVar.zzD(this.zzv);
                                zzxVar.zzai(this.zzt);
                                zzxVar.zzT(Collections.singletonList(bArr));
                                zzxVar.zzW(this.zza);
                                zzxVar.zzaf(this.zzb);
                                zzz zzzVarZzan = zzxVar.zzan();
                                if (!zzzVarZzan.equals(this.zzh)) {
                                    this.zzh = zzzVarZzan;
                                    this.zzu = 1024000000 / zzzVarZzan.zzH;
                                    this.zzf.zzm(zzzVarZzan);
                                }
                            } else {
                                zzemVar.zzn(((int) zzg(zzemVar)) - zzf(zzemVar));
                            }
                            int iZzd5 = zzemVar.zzd(3);
                            this.zzq = iZzd5;
                            if (iZzd5 == 0) {
                                zzemVar.zzn(8);
                            } else if (iZzd5 == 1) {
                                zzemVar.zzn(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzemVar.zzn(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzemVar.zzn(1);
                            }
                            boolean zZzp2 = zzemVar.zzp();
                            this.zzr = zZzp2;
                            this.zzs = 0L;
                            if (zZzp2) {
                                if (i11 != 1) {
                                    do {
                                        zZzp = zzemVar.zzp();
                                        this.zzs = (this.zzs << 8) + zzemVar.zzd(8);
                                    } while (zZzp);
                                } else {
                                    this.zzs = zzg(zzemVar);
                                }
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzn(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzaz.zza(null, null);
                        }
                        int i14 = 0;
                        while (true) {
                            int iZzd6 = zzemVar.zzd(8);
                            i10 = i14 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i14 = i10;
                            }
                        }
                        int iZzc2 = zzemVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzd.zzL(iZzc2 >> 3);
                        } else {
                            zzen zzenVar2 = this.zzd;
                            zzemVar.zzh(zzenVar2.zzN(), 0, i10 * 8);
                            zzenVar2.zzL(0);
                        }
                        this.zzf.zzr(this.zzd, i10);
                        zzdd.zzf(this.zzm != -9223372036854775807L);
                        this.zzf.zzt(this.zzm, 1, i10, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzemVar.zzn((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzl & (-225)) << 8) | zzenVar.zzm();
                    this.zzk = iZzm2;
                    zzen zzenVar3 = this.zzd;
                    if (iZzm2 > zzenVar3.zzN().length) {
                        zzenVar3.zzI(iZzm2);
                        zzem zzemVar2 = this.zze;
                        byte[] bArrZzN = zzenVar3.zzN();
                        zzemVar2.zzk(bArrZzN, bArrZzN.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzenVar.zzm() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzb(zzadw zzadwVar, zzaol zzaolVar) {
        zzaolVar.zzc();
        this.zzf = zzadwVar.zzw(zzaolVar.zza(), 1);
        this.zzg = zzaolVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzd(long j, int i10) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamx
    public final void zzc(boolean z2) {
    }
}

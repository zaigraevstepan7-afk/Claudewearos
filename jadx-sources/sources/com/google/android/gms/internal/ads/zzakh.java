package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzakh extends zzakf {
    private zzakg zza;
    private int zzb;
    private boolean zzc;
    private zzafe zzd;
    private zzafc zze;

    @Override // com.google.android.gms.internal.ads.zzakf
    public final long zza(zzen zzenVar) {
        if ((zzenVar.zzN()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzenVar.zzN()[0];
        zzakg zzakgVar = this.zza;
        zzdd.zzb(zzakgVar);
        int i10 = !zzakgVar.zzd[(b10 >> 1) & (255 >>> (8 - zzakgVar.zze))].zza ? zzakgVar.zza.zze : zzakgVar.zza.zzf;
        int i11 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzenVar.zzb() < zzenVar.zzd() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd() + 4);
            zzenVar.zzJ(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzenVar.zzK(zzenVar.zzd() + 4);
        }
        long j = i11;
        byte[] bArrZzN = zzenVar.zzN();
        bArrZzN[zzenVar.zzd() - 4] = (byte) (j & 255);
        bArrZzN[zzenVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzN[zzenVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzN[zzenVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzb(boolean z2) {
        super.zzb(z2);
        if (z2) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final boolean zzc(zzen zzenVar, long j, zzakc zzakcVar) throws zzaz {
        zzakg zzakgVar;
        int i10;
        int iZzb;
        int i11;
        int[] iArr;
        int i12;
        long jFloor;
        if (this.zza != null) {
            zzakcVar.zza.getClass();
            return false;
        }
        zzafe zzafeVar = this.zzd;
        int i13 = 1;
        if (zzafeVar == null) {
            zzaff.zzd(1, zzenVar, false);
            int iZzj = zzenVar.zzj();
            int iZzm = zzenVar.zzm();
            int iZzj2 = zzenVar.zzj();
            int iZzi = zzenVar.zzi();
            int i14 = iZzi <= 0 ? -1 : iZzi;
            int iZzi2 = zzenVar.zzi();
            int i15 = iZzi2 <= 0 ? -1 : iZzi2;
            int iZzi3 = zzenVar.zzi();
            int i16 = iZzi3 <= 0 ? -1 : iZzi3;
            int iZzm2 = zzenVar.zzm();
            this.zzd = new zzafe(iZzj, iZzm, iZzj2, i14, i15, i16, (int) Math.pow(2.0d, iZzm2 & 15), (int) Math.pow(2.0d, (iZzm2 & 240) >> 4), 1 == (zzenVar.zzm() & 1), Arrays.copyOf(zzenVar.zzN(), zzenVar.zzd()));
        } else {
            int i17 = 4;
            zzafc zzafcVar = this.zze;
            if (zzafcVar == null) {
                this.zze = zzaff.zzc(zzenVar, true, true);
            } else {
                byte[] bArr = new byte[zzenVar.zzd()];
                System.arraycopy(zzenVar.zzN(), 0, bArr, 0, zzenVar.zzd());
                int i18 = zzafeVar.zza;
                int i19 = 5;
                zzaff.zzd(5, zzenVar, false);
                int iZzm3 = zzenVar.zzm() + 1;
                zzafb zzafbVar = new zzafb(zzenVar.zzN());
                zzafbVar.zzc(zzenVar.zzc() * 8);
                int i20 = 0;
                while (true) {
                    int i21 = 2;
                    int i22 = 16;
                    if (i20 >= iZzm3) {
                        int i23 = i13;
                        int i24 = 6;
                        int iZzb2 = zzafbVar.zzb(6) + i23;
                        for (int i25 = 0; i25 < iZzb2; i25++) {
                            if (zzafbVar.zzb(16) != 0) {
                                throw zzaz.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzafbVar.zzb(6) + i23;
                        int i26 = 0;
                        while (true) {
                            int i27 = 3;
                            if (i26 < iZzb3) {
                                int iZzb4 = zzafbVar.zzb(i22);
                                if (iZzb4 == 0) {
                                    int i28 = 8;
                                    zzafbVar.zzc(8);
                                    zzafbVar.zzc(16);
                                    zzafbVar.zzc(16);
                                    zzafbVar.zzc(6);
                                    zzafbVar.zzc(8);
                                    int iZzb5 = zzafbVar.zzb(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iZzb5) {
                                        zzafbVar.zzc(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i23) {
                                        throw zzaz.zza("floor type greater than 1 not decodable: " + iZzb4, null);
                                    }
                                    int iZzb6 = zzafbVar.zzb(5);
                                    int[] iArr2 = new int[iZzb6];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iZzb6; i31++) {
                                        int iZzb7 = zzafbVar.zzb(4);
                                        iArr2[i31] = iZzb7;
                                        if (iZzb7 > i30) {
                                            i30 = iZzb7;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        int i34 = 1;
                                        iArr3[i33] = zzafbVar.zzb(i27) + 1;
                                        int iZzb8 = zzafbVar.zzb(2);
                                        if (iZzb8 > 0) {
                                            i11 = 8;
                                            zzafbVar.zzc(8);
                                        } else {
                                            i11 = 8;
                                        }
                                        int i35 = i32;
                                        int i36 = 0;
                                        while (true) {
                                            int i37 = i34 << iZzb8;
                                            iArr = iArr2;
                                            if (i36 < i37) {
                                                zzafbVar.zzc(i11);
                                                i36++;
                                                iArr2 = iArr;
                                                i11 = 8;
                                                i34 = 1;
                                            }
                                        }
                                        i33++;
                                        iArr2 = iArr;
                                        i32 = i35;
                                        i27 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzafbVar.zzc(2);
                                    int iZzb9 = zzafbVar.zzb(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iZzb6; i40++) {
                                        i38 += iArr3[iArr4[i40]];
                                        while (i39 < i38) {
                                            zzafbVar.zzc(iZzb9);
                                            i39++;
                                        }
                                    }
                                }
                                i26++;
                                i24 = 6;
                                i22 = 16;
                                i23 = 1;
                            } else {
                                int i41 = 1;
                                int iZzb10 = zzafbVar.zzb(i24) + 1;
                                int i42 = 0;
                                while (i42 < iZzb10) {
                                    if (zzafbVar.zzb(16) > 2) {
                                        throw zzaz.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzafbVar.zzc(24);
                                    zzafbVar.zzc(24);
                                    zzafbVar.zzc(24);
                                    int iZzb11 = zzafbVar.zzb(i24) + i41;
                                    int i43 = 8;
                                    zzafbVar.zzc(8);
                                    int[] iArr5 = new int[iZzb11];
                                    for (int i44 = 0; i44 < iZzb11; i44++) {
                                        iArr5[i44] = ((zzafbVar.zzd() ? zzafbVar.zzb(5) : 0) * 8) + zzafbVar.zzb(3);
                                    }
                                    int i45 = 0;
                                    while (i45 < iZzb11) {
                                        int i46 = 0;
                                        while (i46 < i43) {
                                            if ((iArr5[i45] & (1 << i46)) != 0) {
                                                zzafbVar.zzc(i43);
                                            }
                                            i46++;
                                            i43 = 8;
                                        }
                                        i45++;
                                        i43 = 8;
                                    }
                                    i42++;
                                    i24 = 6;
                                    i41 = 1;
                                }
                                int iZzb12 = zzafbVar.zzb(i24) + 1;
                                for (int i47 = 0; i47 < iZzb12; i47++) {
                                    int iZzb13 = zzafbVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb13);
                                    } else {
                                        if (zzafbVar.zzd()) {
                                            i10 = 1;
                                            iZzb = zzafbVar.zzb(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iZzb = 1;
                                        }
                                        if (zzafbVar.zzd()) {
                                            int iZzb14 = zzafbVar.zzb(8) + i10;
                                            for (int i48 = 0; i48 < iZzb14; i48++) {
                                                int i49 = i18 - 1;
                                                zzafbVar.zzc(zzaff.zza(i49));
                                                zzafbVar.zzc(zzaff.zza(i49));
                                            }
                                        }
                                        if (zzafbVar.zzb(2) != 0) {
                                            throw zzaz.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i50 = 0; i50 < i18; i50++) {
                                                zzafbVar.zzc(4);
                                            }
                                        }
                                        for (int i51 = 0; i51 < iZzb; i51++) {
                                            zzafbVar.zzc(8);
                                            zzafbVar.zzc(8);
                                            zzafbVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzafbVar.zzb(6);
                                int i52 = iZzb15 + 1;
                                zzafd[] zzafdVarArr = new zzafd[i52];
                                for (int i53 = 0; i53 < i52; i53++) {
                                    zzafdVarArr[i53] = new zzafd(zzafbVar.zzd(), zzafbVar.zzb(16), zzafbVar.zzb(16), zzafbVar.zzb(8));
                                }
                                if (!zzafbVar.zzd()) {
                                    throw zzaz.zza("framing bit after modes not set as expected", null);
                                }
                                zzakgVar = new zzakg(zzafeVar, zzafcVar, bArr, zzafdVarArr, zzaff.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzafbVar.zzb(24) != 5653314) {
                            throw zzaz.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzafbVar.zza(), null);
                        }
                        int iZzb16 = zzafbVar.zzb(16);
                        int iZzb17 = zzafbVar.zzb(24);
                        if (zzafbVar.zzd()) {
                            zzafbVar.zzc(i19);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzafbVar.zzb(zzaff.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzafbVar.zzd();
                            for (int i54 = 0; i54 < iZzb17; i54++) {
                                if (!zZzd) {
                                    zzafbVar.zzc(i19);
                                } else if (zzafbVar.zzd()) {
                                    zzafbVar.zzc(i19);
                                }
                            }
                        }
                        int i55 = i17;
                        int iZzb19 = zzafbVar.zzb(i55);
                        if (iZzb19 > 2) {
                            throw zzaz.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != i13) {
                            if (iZzb19 != 2) {
                                i12 = i13;
                            }
                            i20++;
                            i13 = i12;
                            i17 = 4;
                            i19 = 5;
                        } else {
                            i21 = iZzb19;
                        }
                        zzafbVar.zzc(32);
                        zzafbVar.zzc(32);
                        int iZzb20 = zzafbVar.zzb(i55) + i13;
                        zzafbVar.zzc(i13);
                        if (i21 != i13) {
                            i12 = i13;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            i12 = i13;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            i12 = i13;
                            jFloor = 0;
                        }
                        zzafbVar.zzc((int) (jFloor * iZzb20));
                        i20++;
                        i13 = i12;
                        i17 = 4;
                        i19 = 5;
                    }
                }
            }
        }
        zzakgVar = null;
        this.zza = zzakgVar;
        if (zzakgVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzafe zzafeVar2 = zzakgVar.zza;
        arrayList.add(zzafeVar2.zzg);
        arrayList.add(zzakgVar.zzc);
        zzav zzavVarZzb = zzaff.zzb(zzfyf.zzm(zzakgVar.zzb.zza));
        zzx zzxVar = new zzx();
        zzxVar.zzG("audio/ogg");
        zzxVar.zzah("audio/vorbis");
        zzxVar.zzC(zzafeVar2.zzd);
        zzxVar.zzac(zzafeVar2.zzc);
        zzxVar.zzD(zzafeVar2.zza);
        zzxVar.zzai(zzafeVar2.zzb);
        zzxVar.zzT(arrayList);
        zzxVar.zzaa(zzavVarZzb);
        zzakcVar.zza = zzxVar.zzan();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzafe zzafeVar = this.zzd;
        this.zzb = zzafeVar != null ? zzafeVar.zze : 0;
    }
}

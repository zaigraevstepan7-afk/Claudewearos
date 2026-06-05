package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaif extends zzaic {
    private final byte[] zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final byte zzv() throws zzajk {
        int i10 = this.zzi;
        if (i10 == this.zzg) {
            throw zzajk.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() throws zzajk {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            throw zzajk.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private final int zzx() {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return i10;
            }
        }
        return (int) zzm();
    }

    private final long zzy() throws zzajk {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            throw zzajk.zzi();
        }
        byte[] bArr = this.zze;
        this.zzi = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    private final long zzz() {
        long j;
        long j4;
        long j10;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j11 = (-2080896) ^ i18;
                            i13 = i17;
                            j = j11;
                        } else {
                            long j12 = i18;
                            i13 = i10 + 5;
                            long j13 = j12 ^ (bArr[i17] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j14 = j13 ^ (bArr[i13] << 35);
                                if (j14 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j13 = j14 ^ (bArr[i19] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j14 = j13 ^ (bArr[i13] << 49);
                                        if (j14 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j15 = (j14 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j = j14 ^ j4;
                                i13 = i19;
                            }
                            j = j13 ^ j10;
                        }
                    }
                }
                this.zzi = i13;
                return j;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzc() {
        return this.zzi - this.zzj;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzd() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzg() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzh() {
        return zzaic.zza(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzi() throws zzajk {
        if (zzt()) {
            this.zzk = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzk = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw zzajk.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzk() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzl() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzm() throws zzajk {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzv() & 128) == 0) {
                return j;
            }
        }
        throw zzajk.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzn() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzo() {
        return zzaic.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final long zzp() {
        return zzz();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzaho zzq() throws com.google.android.gms.internal.p002firebaseauthapi.zzajk {
        /*
            r3 = this;
            int r0 = r3.zzx()
            if (r0 <= 0) goto L19
            int r1 = r3.zzg
            int r2 = r3.zzi
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zze
            com.google.android.gms.internal.firebase-auth-api.zzaho r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaho.zza(r1, r2, r0)
            int r2 = r3.zzi
            int r2 = r2 + r0
            r3.zzi = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzaho r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaho.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zzg
            int r2 = r3.zzi
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzi = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.p002firebaseauthapi.zzajh.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzaho r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaho.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzajk r0 = com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzajk r0 = com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzi()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaif.zzq():com.google.android.gms.internal.firebase-auth-api.zzaho");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final String zzr() throws zzajk {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String str = new String(this.zze, i11, iZzx, zzajh.zza);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw zzajk.zzf();
        }
        throw zzajk.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final String zzs() throws zzajk {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String strZzb = zzamn.zzb(this.zze, i11, iZzx);
                this.zzi += iZzx;
                return strZzb;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx <= 0) {
            throw zzajk.zzf();
        }
        throw zzajk.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final boolean zzt() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final boolean zzu() {
        return zzz() != 0;
    }

    private zzaif(byte[] bArr, int i10, int i11, boolean z2) {
        super();
        this.zzl = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
        this.zzf = z2;
    }

    private final void zzf(int i10) throws zzajk {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzajk.zzi();
        }
        throw zzajk.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final int zzb(int i10) throws zzajk {
        if (i10 < 0) {
            throw zzajk.zzf();
        }
        int iZzc = i10 + zzc();
        if (iZzc < 0) {
            throw zzajk.zzg();
        }
        int i11 = this.zzl;
        if (iZzc > i11) {
            throw zzajk.zzi();
        }
        this.zzl = iZzc;
        zzaa();
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final void zzc(int i10) throws zzajk {
        if (this.zzk != i10) {
            throw zzajk.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final void zzd(int i10) {
        this.zzl = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaic
    public final boolean zze(int i10) throws zzajk {
        int iZzi;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzv() < 0) {
                        i12++;
                    }
                }
                throw zzajk.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzajk.zze();
            return true;
        }
        if (i11 == 1) {
            zzf(8);
            return true;
        }
        if (i11 == 2) {
            zzf(zzx());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzajk.zza();
            }
            zzf(4);
            return true;
        }
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                break;
            }
        } while (zze(iZzi));
        zzc(((i10 >>> 3) << 3) | 4);
        return true;
    }
}

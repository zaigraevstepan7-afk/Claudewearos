package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzen {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfyk zzc = zzfyk.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzen(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
    }

    private final char zzO(ByteOrder byteOrder, int i10) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zzd;
            int i11 = this.zze + i10;
            return zzgbf.zza(bArr[i11], bArr[i11 + 1]);
        }
        byte[] bArr2 = this.zzd;
        int i12 = this.zze + i10;
        return zzgbf.zza(bArr2[i12 + 1], bArr2[i12]);
    }

    private final char zzP(Charset charset, char[] cArr) {
        int iZzS;
        if (zza() >= zzR(charset) && (iZzS = zzS(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(i)) {
                long j = i;
                char c6 = (char) j;
                zzfve.zzh(((long) c6) == j, "Out of range: %s", j);
                for (char c10 : cArr) {
                    if (c10 == c6) {
                        this.zze = zzgbi.zzb(iZzS & 255) + this.zze;
                        return c6;
                    }
                }
            }
        }
        return (char) 0;
    }

    private static int zzQ(int i10, int i11, int i12, int i13) {
        return zzgbi.zze((byte) 0, zzgbl.zza(((i10 & 7) << 2) | ((i11 & 48) >> 4)), zzgbl.zza(((i12 & 60) >> 2) | ((i11 & 15) << 4)), zzgbl.zza((i13 & 63) | ((i12 & 3) << 6)));
    }

    private static int zzR(Charset charset) {
        zzdd.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final int zzS(Charset charset) {
        int codePoint;
        int i10;
        int iZzQ;
        zzdd.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (zza() < zzR(charset)) {
            throw new IndexOutOfBoundsException(gk.b.l(this.zze, this.zzf, "position=", ", limit="));
        }
        int i11 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b10 = this.zzd[this.zze];
            if ((b10 & 128) == 0) {
                codePoint = b10 & 255;
                return (codePoint << 8) | i11;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b11 = this.zzd[this.zze];
            if ((b11 & 128) == 0) {
                i10 = 1;
            } else if ((b11 & 224) == 192 && zza() >= 2 && zzT(this.zzd[this.zze + 1])) {
                i10 = 2;
            } else {
                if ((this.zzd[this.zze] & 240) == 224 && zza() >= 3) {
                    byte[] bArr = this.zzd;
                    int i12 = this.zze;
                    if (zzT(bArr[i12 + 1]) && zzT(bArr[i12 + 2])) {
                        i10 = 3;
                    }
                }
                if ((this.zzd[this.zze] & 248) == 240 && zza() >= 4) {
                    byte[] bArr2 = this.zzd;
                    int i13 = this.zze;
                    if (zzT(bArr2[i13 + 1]) && zzT(bArr2[i13 + 2]) && zzT(bArr2[i13 + 3])) {
                        i10 = 4;
                    }
                }
                i10 = 0;
            }
            if (i10 == 1) {
                iZzQ = this.zzd[this.zze] & 255;
            } else if (i10 == 2) {
                byte[] bArr3 = this.zzd;
                int i14 = this.zze;
                iZzQ = zzQ(0, 0, bArr3[i14], bArr3[i14 + 1]);
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        byte[] bArr4 = this.zzd;
                        int i15 = this.zze;
                        iZzQ = zzQ(bArr4[i15], bArr4[i15 + 1], bArr4[i15 + 2], bArr4[i15 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zzd;
                int i16 = this.zze;
                iZzQ = zzQ(0, bArr5[i16] & 15, bArr5[i16 + 1], bArr5[i16 + 2]);
            }
            i11 = i10;
            codePoint = iZzQ;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cZzO = zzO(byteOrder, 0);
            if (!Character.isHighSurrogate(cZzO) || zza() < 4) {
                codePoint = cZzO;
                i11 = 2;
            } else {
                codePoint = Character.toCodePoint(cZzO, zzO(byteOrder, 2));
                i11 = 4;
            }
        }
        return (codePoint << 8) | i11;
    }

    private static boolean zzT(byte b10) {
        return (b10 & 192) == 128;
    }

    public final String zzA(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zze;
        int i12 = (i11 + i10) - 1;
        String strZzC = zzex.zzC(this.zzd, i11, (i12 >= this.zzf || this.zzd[i12] != 0) ? i10 : i10 - 1);
        this.zze += i10;
        return strZzC;
    }

    public final String zzB(int i10, Charset charset) {
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        String str = new String(bArr, i11, i10, charset);
        this.zze = i11 + i10;
        return str;
    }

    public final Charset zzC() {
        if (zza() >= 3) {
            byte[] bArr = this.zzd;
            int i10 = this.zze;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.zze = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (zza() < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        int i11 = this.zze;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.zze = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.zze = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        this.zze = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        this.zze = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final void zzF(int i10) {
        byte[] bArr = this.zzd;
        if (i10 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i10);
        }
    }

    public final void zzG(zzem zzemVar, int i10) {
        zzH(zzemVar.zza, 0, i10);
        zzemVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzd, this.zze, bArr, i10, i11);
        this.zze += i11;
    }

    public final void zzI(int i10) {
        byte[] bArr = this.zzd;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzJ(bArr, i10);
    }

    public final void zzJ(byte[] bArr, int i10) {
        this.zzd = bArr;
        this.zzf = i10;
        this.zze = 0;
    }

    public final void zzK(int i10) {
        boolean z2 = false;
        if (i10 >= 0 && i10 <= this.zzd.length) {
            z2 = true;
        }
        zzdd.zzd(z2);
        this.zzf = i10;
    }

    public final void zzL(int i10) {
        boolean z2 = false;
        if (i10 >= 0 && i10 <= this.zzf) {
            z2 = true;
        }
        zzdd.zzd(z2);
        this.zze = i10;
    }

    public final void zzM(int i10) {
        zzL(this.zze + i10);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final int zza() {
        return Math.max(this.zzf - this.zze, 0);
    }

    public final int zzb() {
        return this.zzd.length;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final int zze(Charset charset) {
        if (zzS(charset) != 0) {
            return zzgbi.zzb(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zze = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.zze = i15;
        int i16 = bArr[i13] & 255;
        this.zze = i10 + 4;
        return (bArr[i15] & 255) | (i12 << 24) | (i14 << 16) | (i16 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zze = i13;
        int i14 = bArr[i11] & 255;
        this.zze = i10 + 3;
        return (bArr[i13] & 255) | ((i12 << 24) >> 8) | (i14 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zze = i13;
        int i14 = bArr[i11] & 255;
        int i15 = i10 + 3;
        this.zze = i15;
        int i16 = bArr[i13] & 255;
        this.zze = i10 + 4;
        return ((bArr[i15] & 255) << 24) | (i14 << 8) | i12 | (i16 << 16);
    }

    public final int zzj() {
        int iZzi = zzi();
        if (iZzi >= 0) {
            return iZzi;
        }
        throw new IllegalStateException(m6.a.d(iZzi, "Top bit not zero: "));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        this.zze = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        this.zze = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        this.zze = i10 + 2;
        int i13 = bArr[i11] & 255;
        this.zze = i10 + 4;
        return i13 | (i12 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.zze = i13;
        int i14 = bArr[i11] & 255;
        this.zze = i10 + 3;
        return (bArr[i13] & 255) | (i12 << 16) | (i14 << 8);
    }

    public final int zzp() {
        int iZzg = zzg();
        if (iZzg >= 0) {
            return iZzg;
        }
        throw new IllegalStateException(m6.a.d(iZzg, "Top bit not zero: "));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        int i12 = bArr[i10] & 255;
        this.zze = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j = bArr[i10];
        int i12 = i10 + 2;
        this.zze = i12;
        long j4 = bArr[i11];
        int i13 = i10 + 3;
        this.zze = i13;
        long j10 = bArr[i12];
        int i14 = i10 + 4;
        this.zze = i14;
        long j11 = bArr[i13];
        int i15 = i10 + 5;
        this.zze = i15;
        long j12 = bArr[i14];
        int i16 = i10 + 6;
        this.zze = i16;
        long j13 = bArr[i15];
        this.zze = i10 + 7;
        long j14 = bArr[i16];
        this.zze = i10 + 8;
        return ((bArr[r3] & 255) << 56) | (255 & j) | ((j4 & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((j12 & 255) << 32) | ((j13 & 255) << 40) | ((j14 & 255) << 48);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j = bArr[i10];
        int i12 = i10 + 2;
        this.zze = i12;
        long j4 = bArr[i11];
        this.zze = i10 + 3;
        long j10 = bArr[i12];
        this.zze = i10 + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j4 & 255) << 8) | ((j10 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j = bArr[i10];
        int i12 = i10 + 2;
        this.zze = i12;
        long j4 = bArr[i11];
        int i13 = i10 + 3;
        this.zze = i13;
        long j10 = bArr[i12];
        int i14 = i10 + 4;
        this.zze = i14;
        long j11 = bArr[i13];
        int i15 = i10 + 5;
        this.zze = i15;
        long j12 = bArr[i14];
        int i16 = i10 + 6;
        this.zze = i16;
        long j13 = bArr[i15];
        this.zze = i10 + 7;
        long j14 = bArr[i16];
        this.zze = i10 + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j4 & 255) << 48) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16) | ((j14 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i10 = this.zze;
        int i11 = i10 + 1;
        this.zze = i11;
        long j = bArr[i10];
        int i12 = i10 + 2;
        this.zze = i12;
        long j4 = bArr[i11];
        this.zze = i10 + 3;
        long j10 = bArr[i12];
        this.zze = i10 + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j4 & 255) << 16) | ((j10 & 255) << 8);
    }

    public final long zzv() {
        long j = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jZzm = zzm();
            j |= (127 & jZzm) << (i10 * 7);
            if ((jZzm & 128) == 0) {
                return j;
            }
        }
        return j;
    }

    public final long zzw() {
        long jZzt = zzt();
        if (jZzt >= 0) {
            return jZzt;
        }
        throw new IllegalStateException(m1.g(jZzt, "Top bit not zero: "));
    }

    public final long zzx() {
        int i10;
        int i11;
        long j = this.zzd[this.zze];
        int i12 = 7;
        while (true) {
            i10 = 0;
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j) != 0) {
                i12--;
            } else if (i12 < 6) {
                j &= r7 - 1;
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException(m1.g(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((this.zzd[this.zze + i11] & 192) != 128) {
                throw new NumberFormatException(m1.g(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | (r2 & 63);
        }
        this.zze += i10;
        return j;
    }

    public final String zzy(char c6) {
        if (zza() == 0) {
            return null;
        }
        int i10 = this.zze;
        while (i10 < this.zzf && this.zzd[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.zzd;
        int i11 = this.zze;
        String strZzC = zzex.zzC(bArr, i11, i10 - i11);
        this.zze = i10;
        if (i10 < this.zzf) {
            this.zze = i10 + 1;
        }
        return strZzC;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zzz(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfyk r0 = com.google.android.gms.internal.ads.zzen.zzc
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unsupported charset: "
            java.lang.String r1 = r2.concat(r1)
            com.google.android.gms.internal.ads.zzdd.zze(r0, r1)
            int r0 = r4.zza()
            if (r0 != 0) goto L1b
            r5 = 0
            return r5
        L1b:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r0)
            if (r1 != 0) goto L26
            r4.zzC()
        L26:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            r3 = 1
            if (r1 != 0) goto L5e
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L36
            goto L5e
        L36:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r3 = 2
            if (r0 != 0) goto L5e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L50
            goto L5e
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r2.concat(r5)
            r0.<init>(r5)
            throw r0
        L5e:
            int r0 = r4.zze
        L60:
            int r1 = r4.zzf
            int r2 = r3 + (-1)
            int r2 = r1 - r2
            if (r0 >= r2) goto Lbd
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L78
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L82
        L78:
            byte[] r1 = r4.zzd
            r1 = r1[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 != 0) goto Lbe
        L82:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L92
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La2
        L92:
            byte[] r1 = r4.zzd
            r2 = r1[r0]
            if (r2 != 0) goto La2
            int r2 = r0 + 1
            r1 = r1[r2]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 != 0) goto Lbe
        La2:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto Lbb
            int r1 = r0 + 1
            byte[] r2 = r4.zzd
            r1 = r2[r1]
            if (r1 != 0) goto Lbb
            r1 = r2[r0]
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzM(r1)
            if (r1 == 0) goto Lbb
            goto Lbe
        Lbb:
            int r0 = r0 + r3
            goto L60
        Lbd:
            r0 = r1
        Lbe:
            int r1 = r4.zze
            int r0 = r0 - r1
            java.lang.String r0 = r4.zzB(r0, r5)
            int r1 = r4.zze
            int r2 = r4.zzf
            if (r1 == r2) goto Lda
            char[] r1 = com.google.android.gms.internal.ads.zzen.zza
            char r1 = r4.zzP(r5, r1)
            r2 = 13
            if (r1 != r2) goto Lda
            char[] r1 = com.google.android.gms.internal.ads.zzen.zzb
            r4.zzP(r5, r1)
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.zzz(java.nio.charset.Charset):java.lang.String");
    }

    public zzen() {
        this.zzd = zzex.zzb;
    }

    public zzen(int i10) {
        this.zzd = new byte[i10];
        this.zzf = i10;
    }

    public zzen(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}

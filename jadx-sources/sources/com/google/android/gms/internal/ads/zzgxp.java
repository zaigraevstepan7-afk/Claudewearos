package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgxp extends zzgxt {
    private final Iterable zza;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgxp(Iterable iterable, int i10, boolean z2, zzgxs zzgxsVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzh = i10;
        this.zza = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i10 != 0) {
            zzM();
            return;
        }
        this.zzg = zzgzi.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgzk {
        if (!this.zzf.hasNext()) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i10, int i11) throws zzgzk {
        if (i11 > zzI()) {
            if (i11 > 0) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i12 = i11;
        while (i12 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int iMin = Math.min(i12, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzhbs.zzo(this.zzm, bArr, i11 - i12, j);
            i12 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzL() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzi = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzi = i12;
        this.zzh = i10 - i12;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzhbs.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzA() {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final boolean zzB() {
        return zzr() != 0;
    }

    public final long zzC() throws zzgzk {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzh() & 128) == 0) {
                return j;
            }
        }
        throw new zzgzk("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final double zza() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final float zzb() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzc() {
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzd(int i10) throws zzgzk {
        if (i10 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i10 + zzc();
        int i11 = this.zzj;
        if (iZzc > i11) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = iZzc;
        zzL();
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zze() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzf() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzg() {
        return zzp();
    }

    public final byte zzh() throws zzgzk {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzhbs.zza(j);
    }

    public final int zzi() {
        long j = this.zzo;
        long j4 = this.zzm;
        if (j - j4 < 4) {
            int iZzh = zzh() & 255;
            int iZzh2 = (zzh() & 255) << 8;
            return iZzh | iZzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j4;
        int iZza = zzhbs.zza(j4) & 255;
        int iZza2 = (zzhbs.zza(1 + j4) & 255) << 8;
        return iZza | iZza2 | ((zzhbs.zza(2 + j4) & 255) << 16) | ((zzhbs.zza(j4 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzj() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzk() {
        return zzgxt.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzl() throws zzgzk {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int iZzp = zzp();
        this.zzk = iZzp;
        if ((iZzp >>> 3) != 0) {
            return iZzp;
        }
        throw new zzgzk("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final int zzm() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzn() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzo() {
        return zzr();
    }

    public final int zzp() {
        int i10;
        long j = this.zzm;
        if (this.zzo != j) {
            long j4 = j + 1;
            byte bZza = zzhbs.zza(j);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j10 = 2 + j;
                int iZza = (zzhbs.zza(j4) << 7) ^ bZza;
                if (iZza < 0) {
                    i10 = iZza ^ (-128);
                } else {
                    long j11 = 3 + j;
                    int iZza2 = (zzhbs.zza(j10) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        i10 = iZza2 ^ 16256;
                    } else {
                        long j12 = 4 + j;
                        int iZza3 = iZza2 ^ (zzhbs.zza(j11) << 21);
                        if (iZza3 < 0) {
                            i10 = (-2080896) ^ iZza3;
                        } else {
                            j11 = 5 + j;
                            byte bZza2 = zzhbs.zza(j12);
                            int i11 = (iZza3 ^ (bZza2 << 28)) ^ 266354560;
                            if (bZza2 < 0) {
                                j12 = 6 + j;
                                if (zzhbs.zza(j11) < 0) {
                                    j11 = 7 + j;
                                    if (zzhbs.zza(j12) < 0) {
                                        j12 = 8 + j;
                                        if (zzhbs.zza(j11) < 0) {
                                            j11 = 9 + j;
                                            if (zzhbs.zza(j12) < 0) {
                                                long j13 = j + 10;
                                                if (zzhbs.zza(j11) >= 0) {
                                                    i10 = i11;
                                                    j10 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            i10 = i11;
                        }
                        j10 = j12;
                    }
                    j10 = j11;
                }
                this.zzm = j10;
                return i10;
            }
        }
        return (int) zzC();
    }

    public final long zzq() {
        long j = this.zzo;
        long j4 = this.zzm;
        if (j - j4 < 8) {
            return ((zzh() & 255) << 56) | (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48);
        }
        this.zzm = 8 + j4;
        long jZza = zzhbs.zza(j4) & 255;
        long jZza2 = (zzhbs.zza(1 + j4) & 255) << 8;
        return jZza | jZza2 | ((zzhbs.zza(j4 + 2) & 255) << 16) | ((zzhbs.zza(3 + j4) & 255) << 24) | ((zzhbs.zza(j4 + 4) & 255) << 32) | ((zzhbs.zza(j4 + 5) & 255) << 40) | ((zzhbs.zza(j4 + 6) & 255) << 48) | ((zzhbs.zza(j4 + 7) & 255) << 56);
    }

    public final long zzr() {
        long j;
        long j4;
        long j10 = this.zzm;
        if (this.zzo != j10) {
            long j11 = j10 + 1;
            byte bZza = zzhbs.zza(j10);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j12 = 2 + j10;
                int iZza = (zzhbs.zza(j11) << 7) ^ bZza;
                if (iZza < 0) {
                    j = iZza ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iZza2 = (zzhbs.zza(j12) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        j = iZza2 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int iZza3 = iZza2 ^ (zzhbs.zza(j13) << 21);
                        if (iZza3 < 0) {
                            j = (-2080896) ^ iZza3;
                            j12 = j14;
                        } else {
                            j13 = 5 + j10;
                            long jZza = (zzhbs.zza(j14) << 28) ^ iZza3;
                            if (jZza >= 0) {
                                j = 266354560 ^ jZza;
                            } else {
                                long j15 = 6 + j10;
                                long jZza2 = jZza ^ (zzhbs.zza(j13) << 35);
                                if (jZza2 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    long j16 = 7 + j10;
                                    long jZza3 = jZza2 ^ (zzhbs.zza(j15) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j15 = 8 + j10;
                                        jZza2 = jZza3 ^ (zzhbs.zza(j16) << 49);
                                        if (jZza2 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j10;
                                            long jZza4 = (jZza2 ^ (zzhbs.zza(j15) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j17 = j10 + 10;
                                                if (zzhbs.zza(j16) >= 0) {
                                                    j12 = j17;
                                                    j = jZza4;
                                                }
                                            } else {
                                                j = jZza4;
                                            }
                                        }
                                    }
                                    j12 = j16;
                                }
                                j = j4 ^ jZza2;
                                j12 = j15;
                            }
                        }
                    }
                    j12 = j13;
                }
                this.zzm = j12;
                return j;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzs() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzt() {
        return zzgxt.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final long zzu() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final zzgxn zzv() throws zzgzk {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j4 = this.zzm;
            long j10 = iZzp;
            if (j10 <= j - j4) {
                byte[] bArr = new byte[iZzp];
                zzhbs.zzo(j4, bArr, 0L, j10);
                this.zzm += j10;
                zzgxn zzgxnVar = zzgxn.zzb;
                return new zzgxk(bArr);
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            zzgxn zzgxnVar2 = zzgxn.zzb;
            return new zzgxk(bArr2);
        }
        if (iZzp == 0) {
            return zzgxn.zzb;
        }
        if (iZzp < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzw() throws zzgzk {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j4 = this.zzm;
            long j10 = iZzp;
            if (j10 <= j - j4) {
                byte[] bArr = new byte[iZzp];
                zzhbs.zzo(j4, bArr, 0L, j10);
                String str = new String(bArr, zzgzi.zza);
                this.zzm += j10;
                return str;
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            return new String(bArr2, zzgzi.zza);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final String zzx() throws zzgzk {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j4 = this.zzm;
            long j10 = iZzp;
            if (j10 <= j - j4) {
                String strZzg = zzhbx.zzg(this.zzg, (int) (j4 - this.zzn), iZzp);
                this.zzm += j10;
                return strZzg;
            }
        }
        if (iZzp >= 0 && iZzp <= zzI()) {
            byte[] bArr = new byte[iZzp];
            zzK(bArr, 0, iZzp);
            return zzhbx.zzh(bArr, 0, iZzp);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp <= 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzy(int i10) throws zzgzk {
        if (this.zzk != i10) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxt
    public final void zzz(int i10) {
        this.zzj = i10;
        zzL();
    }
}

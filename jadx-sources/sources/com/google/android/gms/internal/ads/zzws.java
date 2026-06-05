package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzws {
    private final zzen zza = new zzen(32);
    private zzwr zzb;
    private zzwr zzc;
    private zzwr zzd;
    private long zze;
    private final zzzm zzf;

    public zzws(zzzm zzzmVar) {
        this.zzf = zzzmVar;
        zzwr zzwrVar = new zzwr(0L, 65536);
        this.zzb = zzwrVar;
        this.zzc = zzwrVar;
        this.zzd = zzwrVar;
    }

    private final int zzi(int i10) {
        zzwr zzwrVar = this.zzd;
        if (zzwrVar.zzc == null) {
            zzzf zzzfVarZzb = this.zzf.zzb();
            zzwr zzwrVar2 = new zzwr(this.zzd.zzb, 65536);
            zzwrVar.zzc = zzzfVarZzb;
            zzwrVar.zzd = zzwrVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwr zzj(zzwr zzwrVar, long j) {
        while (j >= zzwrVar.zzb) {
            zzwrVar = zzwrVar.zzd;
        }
        return zzwrVar;
    }

    private static zzwr zzk(zzwr zzwrVar, long j, ByteBuffer byteBuffer, int i10) {
        zzwr zzwrVarZzj = zzj(zzwrVar, j);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (zzwrVarZzj.zzb - j));
            byteBuffer.put(zzwrVarZzj.zzc.zza, zzwrVarZzj.zza(j), iMin);
            i10 -= iMin;
            j += iMin;
            if (j == zzwrVarZzj.zzb) {
                zzwrVarZzj = zzwrVarZzj.zzd;
            }
        }
        return zzwrVarZzj;
    }

    private static zzwr zzl(zzwr zzwrVar, long j, byte[] bArr, int i10) {
        zzwr zzwrVarZzj = zzj(zzwrVar, j);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (zzwrVarZzj.zzb - j));
            System.arraycopy(zzwrVarZzj.zzc.zza, zzwrVarZzj.zza(j), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j += iMin;
            if (j == zzwrVarZzj.zzb) {
                zzwrVarZzj = zzwrVarZzj.zzd;
            }
        }
        return zzwrVarZzj;
    }

    private static zzwr zzm(zzwr zzwrVar, zzhs zzhsVar, zzwu zzwuVar, zzen zzenVar) {
        zzwr zzwrVarZzl;
        if (zzhsVar.zzl()) {
            long j = zzwuVar.zzb;
            int iZzq = 1;
            zzenVar.zzI(1);
            zzwr zzwrVarZzl2 = zzl(zzwrVar, j, zzenVar.zzN(), 1);
            long j4 = j + 1;
            byte b10 = zzenVar.zzN()[0];
            int i10 = b10 & 128;
            int i11 = b10 & Byte.MAX_VALUE;
            zzhp zzhpVar = zzhsVar.zzb;
            byte[] bArr = zzhpVar.zza;
            if (bArr == null) {
                zzhpVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z2 = i10 != 0;
            zzwrVarZzl = zzl(zzwrVarZzl2, j4, zzhpVar.zza, i11);
            long j10 = j4 + i11;
            if (z2) {
                zzenVar.zzI(2);
                zzwrVarZzl = zzl(zzwrVarZzl, j10, zzenVar.zzN(), 2);
                j10 += 2;
                iZzq = zzenVar.zzq();
            }
            int i12 = iZzq;
            int[] iArr = zzhpVar.zzd;
            if (iArr == null || iArr.length < i12) {
                iArr = new int[i12];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhpVar.zze;
            if (iArr3 == null || iArr3.length < i12) {
                iArr3 = new int[i12];
            }
            int[] iArr4 = iArr3;
            if (z2) {
                int i13 = i12 * 6;
                zzenVar.zzI(i13);
                zzwrVarZzl = zzl(zzwrVarZzl, j10, zzenVar.zzN(), i13);
                j10 += i13;
                zzenVar.zzL(0);
                for (int i14 = 0; i14 < i12; i14++) {
                    iArr2[i14] = zzenVar.zzq();
                    iArr4[i14] = zzenVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwuVar.zza - ((int) (j10 - zzwuVar.zzb));
            }
            zzaey zzaeyVar = zzwuVar.zzc;
            String str = zzex.zza;
            zzhpVar.zzc(i12, iArr2, iArr4, zzaeyVar.zzb, zzhpVar.zza, zzaeyVar.zza, zzaeyVar.zzc, zzaeyVar.zzd);
            long j11 = zzwuVar.zzb;
            int i15 = (int) (j10 - j11);
            zzwuVar.zzb = j11 + i15;
            zzwuVar.zza -= i15;
        } else {
            zzwrVarZzl = zzwrVar;
        }
        if (!zzhsVar.zze()) {
            zzhsVar.zzj(zzwuVar.zza);
            return zzk(zzwrVarZzl, zzwuVar.zzb, zzhsVar.zzc, zzwuVar.zza);
        }
        zzenVar.zzI(4);
        zzwr zzwrVarZzl3 = zzl(zzwrVarZzl, zzwuVar.zzb, zzenVar.zzN(), 4);
        int iZzp = zzenVar.zzp();
        zzwuVar.zzb += 4;
        zzwuVar.zza -= 4;
        zzhsVar.zzj(iZzp);
        zzwr zzwrVarZzk = zzk(zzwrVarZzl3, zzwuVar.zzb, zzhsVar.zzc, iZzp);
        zzwuVar.zzb += iZzp;
        int i16 = zzwuVar.zza - iZzp;
        zzwuVar.zza = i16;
        ByteBuffer byteBuffer = zzhsVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            zzhsVar.zzf = ByteBuffer.allocate(i16);
        } else {
            zzhsVar.zzf.clear();
        }
        return zzk(zzwrVarZzk, zzwuVar.zzb, zzhsVar.zzf, zzwuVar.zza);
    }

    private final void zzn(int i10) {
        long j = this.zze + i10;
        this.zze = j;
        zzwr zzwrVar = this.zzd;
        if (j == zzwrVar.zzb) {
            this.zzd = zzwrVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i10, boolean z2) throws EOFException {
        int iZzi = zzi(i10);
        zzwr zzwrVar = this.zzd;
        int iZza = zzlVar.zza(zzwrVar.zzc.zza, zzwrVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzwr zzwrVar;
        if (j != -1) {
            while (true) {
                zzwrVar = this.zzb;
                if (j < zzwrVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwrVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwrVar.zza) {
                this.zzc = zzwrVar;
            }
        }
    }

    public final void zzd(zzhs zzhsVar, zzwu zzwuVar) {
        zzm(this.zzc, zzhsVar, zzwuVar, this.zza);
    }

    public final void zze(zzhs zzhsVar, zzwu zzwuVar) {
        this.zzc = zzm(this.zzc, zzhsVar, zzwuVar, this.zza);
    }

    public final void zzf() {
        zzwr zzwrVar = this.zzb;
        if (zzwrVar.zzc != null) {
            this.zzf.zzd(zzwrVar);
            zzwrVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwr zzwrVar2 = this.zzb;
        this.zzc = zzwrVar2;
        this.zzd = zzwrVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzen zzenVar, int i10) {
        while (i10 > 0) {
            int iZzi = zzi(i10);
            zzwr zzwrVar = this.zzd;
            zzenVar.zzH(zzwrVar.zzc.zza, zzwrVar.zza(this.zze), iZzi);
            i10 -= iZzi;
            zzn(iZzi);
        }
    }
}

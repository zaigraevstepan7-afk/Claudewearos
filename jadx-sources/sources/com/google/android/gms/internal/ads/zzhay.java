package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhay extends zzgxn {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgxn zzd;
    private final zzgxn zze;
    private final int zzf;
    private final int zzg;

    public static zzgxn zzC(zzgxn zzgxnVar, zzgxn zzgxnVar2) {
        if (zzgxnVar2.zzd() == 0) {
            return zzgxnVar;
        }
        if (zzgxnVar.zzd() == 0) {
            return zzgxnVar2;
        }
        int iZzd = zzgxnVar2.zzd() + zzgxnVar.zzd();
        if (iZzd < 128) {
            return zzD(zzgxnVar, zzgxnVar2);
        }
        if (zzgxnVar instanceof zzhay) {
            zzhay zzhayVar = (zzhay) zzgxnVar;
            zzgxn zzgxnVar3 = zzhayVar.zze;
            if (zzgxnVar2.zzd() + zzgxnVar3.zzd() < 128) {
                return new zzhay(zzhayVar.zzd, zzD(zzgxnVar3, zzgxnVar2));
            }
            zzgxn zzgxnVar4 = zzhayVar.zzd;
            if (zzgxnVar4.zzf() > zzgxnVar3.zzf() && zzhayVar.zzg > zzgxnVar2.zzf()) {
                return new zzhay(zzgxnVar4, new zzhay(zzgxnVar3, zzgxnVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgxnVar.zzf(), zzgxnVar2.zzf()) + 1) ? new zzhay(zzgxnVar, zzgxnVar2) : zzhav.zza(new zzhav(null), zzgxnVar, zzgxnVar2);
    }

    private static zzgxn zzD(zzgxn zzgxnVar, zzgxn zzgxnVar2) {
        int iZzd = zzgxnVar.zzd();
        int iZzd2 = zzgxnVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgxnVar.zzz(bArr, 0, 0, iZzd);
        zzgxnVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgxk(bArr);
    }

    public static int zzc(int i10) {
        int[] iArr = zza;
        int length = iArr.length;
        return i10 >= 47 ? f.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgxn)) {
            return false;
        }
        zzgxn zzgxnVar = (zzgxn) obj;
        int i10 = this.zzc;
        if (i10 != zzgxnVar.zzd()) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgxnVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzhax zzhaxVar = null;
        zzhaw zzhawVar = new zzhaw(this, zzhaxVar);
        zzgxj zzgxjVarZza = zzhawVar.next();
        zzhaw zzhawVar2 = new zzhaw(zzgxnVar, zzhaxVar);
        zzgxj zzgxjVarZza2 = zzhawVar2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int iZzd = zzgxjVarZza.zzd() - i11;
            int iZzd2 = zzgxjVarZza2.zzd() - i12;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i11 == 0 ? zzgxjVarZza.zzg(zzgxjVarZza2, i12, iMin) : zzgxjVarZza2.zzg(zzgxjVarZza, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            if (i13 >= i10) {
                if (i13 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgxjVarZza = zzhawVar.next();
                i11 = 0;
            } else {
                i11 += iMin;
                zzgxjVarZza = zzgxjVarZza;
            }
            if (iMin == iZzd2) {
                zzgxjVarZza2 = zzhawVar2.next();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxn, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhau(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final byte zza(int i10) {
        zzgxn.zzy(i10, this.zzc);
        return zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final byte zzb(int i10) {
        int i11 = this.zzf;
        return i10 < i11 ? this.zzd.zzb(i10) : this.zze.zzb(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            this.zzd.zze(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.zze.zze(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.zzd.zze(bArr, i10, i11, i15);
            this.zze.zze(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzi(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzi(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzi(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzi(this.zzd.zzi(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final int zzj(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.zzf;
        if (i13 <= i14) {
            return this.zzd.zzj(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.zze.zzj(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.zze.zzj(this.zzd.zzj(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxn zzk(int i10, int i11) {
        int i12 = this.zzc;
        int iZzq = zzgxn.zzq(i10, i11, i12);
        if (iZzq == 0) {
            return zzgxn.zzb;
        }
        if (iZzq == i12) {
            return this;
        }
        int i13 = this.zzf;
        if (i11 <= i13) {
            return this.zzd.zzk(i10, i11);
        }
        int i14 = i11 - i13;
        if (i10 >= i13) {
            return this.zze.zzk(i10 - i13, i14);
        }
        zzgxn zzgxnVar = this.zzd;
        return new zzhay(zzgxnVar.zzk(i10, zzgxnVar.zzd()), this.zze.zzk(0, i14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgxn
    public final zzgxt zzl() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = 0;
        zzhaw zzhawVar = new zzhaw(this, null);
        while (zzhawVar.hasNext()) {
            arrayList.add(zzhawVar.next().zzn());
        }
        int size = arrayList.size();
        int i10 = 0;
        int iRemaining = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new zzgxp(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgxt.zzG(new zzgzl(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final void zzo(zzgxe zzgxeVar) {
        this.zzd.zzo(zzgxeVar);
        this.zze.zzo(zzgxeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    public final boolean zzp() {
        zzgxn zzgxnVar = this.zzd;
        zzgxn zzgxnVar2 = this.zze;
        return zzgxnVar2.zzj(zzgxnVar.zzj(0, 0, this.zzf), 0, zzgxnVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxn
    /* renamed from: zzs */
    public final zzgxi iterator() {
        return new zzhau(this);
    }

    private zzhay(zzgxn zzgxnVar, zzgxn zzgxnVar2) {
        this.zzd = zzgxnVar;
        this.zze = zzgxnVar2;
        int iZzd = zzgxnVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzgxnVar2.zzd() + iZzd;
        this.zzg = Math.max(zzgxnVar.zzf(), zzgxnVar2.zzf()) + 1;
    }
}

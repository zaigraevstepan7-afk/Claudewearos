package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgxn implements Iterable<Byte>, Serializable {
    public static final zzgxn zzb = new zzgxk(zzgzi.zzb);
    private int zza = 0;

    static {
        int i10 = zzgxa.zza;
    }

    private static zzgxn zzc(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(m6.a.e(i10, "length (", ") must be >= 1"));
        }
        if (i10 == 1) {
            return (zzgxn) it.next();
        }
        int i11 = i10 >>> 1;
        zzgxn zzgxnVarZzc = zzc(it, i11);
        zzgxn zzgxnVarZzc2 = zzc(it, i10 - i11);
        if (f.API_PRIORITY_OTHER - zzgxnVarZzc.zzd() >= zzgxnVarZzc2.zzd()) {
            return zzhay.zzC(zzgxnVarZzc, zzgxnVarZzc2);
        }
        throw new IllegalArgumentException(gk.b.l(zzgxnVarZzc.zzd(), zzgxnVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzq(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(m6.a.e(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(gk.b.l(i11, i12, "End index: ", " >= "));
    }

    public static zzgxl zzt() {
        return new zzgxl(128);
    }

    public static zzgxn zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgxn zzv(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgxk(bArr2);
    }

    public static zzgxn zzw(String str) {
        return new zzgxk(str.getBytes(zzgzi.zza));
    }

    public static void zzy(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 >= 0) {
                throw new ArrayIndexOutOfBoundsException(gk.b.l(i10, i11, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(m6.a.d(i10, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strZza = zzd() <= 50 ? zzhbj.zza(this) : zzhbj.zza(zzk(0, 47)).concat("...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzd);
        sb2.append(" contents=\"");
        return m6.a.j(sb2, strZza, "\">");
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgzi.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgxn zzk(int i10, int i11);

    public abstract zzgxt zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgxe zzgxeVar);

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgxi iterator() {
        return new zzgxf(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgzi.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}

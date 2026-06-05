package com.google.android.gms.internal.p002firebaseauthapi;

import gk.b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import m6.a;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzaho implements Serializable, Iterable<Byte> {
    public static final zzaho zza = new zzaib(zzajh.zzb);
    private static final zzahv zzb = new zzaia();
    private static final Comparator<zzaho> zzc = new zzahq();
    private int zzd = 0;

    public static /* synthetic */ int zza(byte b10) {
        return b10 & 255;
    }

    public static zzaho zzb(byte[] bArr) {
        return new zzaib(bArr);
    }

    public static zzahx zzc(int i10) {
        return new zzahx(i10);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzd;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzd = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzahr(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        String strZza = zzb() <= 50 ? zzaly.zza(this) : m1.v(zzaly.zza(zza(0, 47)), "...");
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iZzb);
        sb2.append(" contents=\"");
        return a.j(sb2, strZza, "\">");
    }

    public abstract byte zza(int i10);

    public abstract zzaho zza(int i10, int i11);

    public abstract String zza(Charset charset);

    public abstract void zza(zzahp zzahpVar);

    public abstract void zza(byte[] bArr, int i10, int i11, int i12);

    public abstract byte zzb(int i10);

    public abstract int zzb();

    public abstract int zzb(int i10, int i11, int i12);

    public abstract zzaic zzc();

    public final String zzd() {
        return zzb() == 0 ? "" : zza(zzajh.zza);
    }

    public abstract boolean zze();

    public final byte[] zzf() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzajh.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static int zza(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(a.e(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(b.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(b.l(i11, i12, "End index: ", " >= "));
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzaho zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaho zza(byte[] bArr, int i10, int i11) {
        zza(i10, i10 + i11, bArr.length);
        return new zzaib(zzb.zza(bArr, i10, i11));
    }

    public static zzaho zza(String str) {
        return new zzaib(str.getBytes(zzajh.zza));
    }
}

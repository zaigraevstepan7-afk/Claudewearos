package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgas {
    private static final zzgas zza;

    static {
        new zzgap("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzgap("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzgar("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgar("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzgao("base16()", "0123456789ABCDEF");
    }

    public static zzgas zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzc(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract int zzd(int i10);

    public abstract int zze(int i10);

    public abstract zzgas zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i10, int i11) {
        zzfve.zzk(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zze(i11));
        try {
            zzc(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzd = zzd(charSequenceZzg.length());
            byte[] bArr = new byte[iZzd];
            int iZza = zza(bArr, charSequenceZzg);
            if (iZza == iZzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzgaq e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

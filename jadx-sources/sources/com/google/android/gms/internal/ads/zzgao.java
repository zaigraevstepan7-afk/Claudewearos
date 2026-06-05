package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgao extends zzgar {
    final char[] zza;

    private zzgao(zzgan zzganVar) {
        super(zzganVar, null);
        this.zza = new char[512];
        zzfve.zze(zzganVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzganVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzganVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        if (charSequence.length() % 2 == 1) {
            throw new zzgaq(m6.a.d(charSequence.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            zzgan zzganVar = this.zzb;
            bArr[i11] = (byte) (zzganVar.zzb(charSequence.charAt(i10 + 1)) | (zzganVar.zzb(charSequence.charAt(i10)) << 4));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgas zzb(zzgan zzganVar, Character ch2) {
        return new zzgao(zzganVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzfve.zzk(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | 256]);
        }
    }

    public zzgao(String str, String str2) {
        this(new zzgan("base16()", "0123456789ABCDEF".toCharArray()));
    }
}

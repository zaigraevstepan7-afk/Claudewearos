package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgap extends zzgar {
    private zzgap(zzgan zzganVar, Character ch2) {
        super(zzganVar, ch2);
        zzfve.zze(zzganVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgan zzganVar = this.zzb;
        if (!zzganVar.zzd(length)) {
            throw new zzgaq(m6.a.d(charSequenceZzg.length(), "Invalid input length "));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceZzg.length()) {
            int i12 = i11 + 1;
            int iZzb = (zzganVar.zzb(charSequenceZzg.charAt(i10 + 1)) << 12) | (zzganVar.zzb(charSequenceZzg.charAt(i10)) << 18);
            bArr[i11] = (byte) (iZzb >>> 16);
            int i13 = i10 + 2;
            if (i13 < charSequenceZzg.length()) {
                int i14 = i10 + 3;
                int iZzb2 = iZzb | (zzganVar.zzb(charSequenceZzg.charAt(i13)) << 6);
                int i15 = i11 + 2;
                bArr[i12] = (byte) ((iZzb2 >>> 8) & 255);
                if (i14 < charSequenceZzg.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iZzb2 | zzganVar.zzb(charSequenceZzg.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i10 = i13;
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgas zzb(zzgan zzganVar, Character ch2) {
        return new zzgap(zzganVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgar, com.google.android.gms.internal.ads.zzgas
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzfve.zzk(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = bArr[i12 + 1] & 255;
            int i16 = bArr[i12 + 2] & 255;
            zzgan zzganVar = this.zzb;
            int i17 = (i15 << 8) | (i14 << 16) | i16;
            appendable.append(zzganVar.zza(i17 >>> 18));
            appendable.append(zzganVar.zza((i17 >>> 12) & 63));
            appendable.append(zzganVar.zza((i17 >>> 6) & 63));
            appendable.append(zzganVar.zza(i17 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            zzh(appendable, bArr, i12, i11 - i12);
        }
    }

    public zzgap(String str, String str2, Character ch2) {
        this(new zzgan(str, str2.toCharArray()), ch2);
    }
}

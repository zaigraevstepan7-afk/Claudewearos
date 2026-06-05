package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
class zzgar extends zzgas {
    private volatile zzgas zza;
    final zzgan zzb;
    final Character zzc;

    public zzgar(zzgan zzganVar, Character ch2) {
        this.zzb = zzganVar;
        boolean z2 = true;
        if (ch2 != null && zzganVar.zze('=')) {
            z2 = false;
        }
        zzfve.zzi(z2, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgar) {
            zzgar zzgarVar = (zzgar) obj;
            if (this.zzb.equals(zzgarVar.zzb) && Objects.equals(this.zzc, zzgarVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgan zzganVar = this.zzb;
        sb2.append(zzganVar);
        if (8 % zzganVar.zzb != 0) {
            Character ch2 = this.zzc;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public int zza(byte[] bArr, CharSequence charSequence) throws zzgaq {
        int i10;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgan zzganVar = this.zzb;
        if (!zzganVar.zzd(length)) {
            throw new zzgaq(m6.a.d(charSequenceZzg.length(), "Invalid input length "));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < charSequenceZzg.length()) {
            long jZzb = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = zzganVar.zzc;
                if (i13 >= i10) {
                    break;
                }
                jZzb <<= zzganVar.zzb;
                if (i11 + i13 < charSequenceZzg.length()) {
                    jZzb |= zzganVar.zzb(charSequenceZzg.charAt(i14 + i11));
                    i14++;
                }
                i13++;
            }
            int i15 = zzganVar.zzd;
            int i16 = i14 * zzganVar.zzb;
            int i17 = (i15 - 1) * 8;
            while (i17 >= (i15 * 8) - i16) {
                bArr[i12] = (byte) ((jZzb >>> i17) & 255);
                i17 -= 8;
                i12++;
            }
            i11 += i10;
        }
        return i12;
    }

    public zzgas zzb(zzgan zzganVar, Character ch2) {
        return new zzgar(zzganVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public void zzc(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzfve.zzk(0, i11, bArr.length);
        while (i12 < i11) {
            int i13 = this.zzb.zzd;
            zzh(appendable, bArr, i12, Math.min(i13, i11 - i12));
            i12 += i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzd(int i10) {
        return (int) (((this.zzb.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zze(int i10) {
        zzgan zzganVar = this.zzb;
        return zzganVar.zzc * zzgbb.zzb(i10, zzganVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgas zzf() {
        zzgas zzgasVarZzb = this.zza;
        if (zzgasVarZzb == null) {
            zzgan zzganVar = this.zzb;
            zzgan zzganVarZzc = zzganVar.zzc();
            zzgasVarZzb = zzganVarZzc == zzganVar ? this : zzb(zzganVarZzc, this.zzc);
            this.zza = zzgasVarZzb;
        }
        return zzgasVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzh(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzfve.zzk(i10, i10 + i11, bArr.length);
        zzgan zzganVar = this.zzb;
        int i12 = zzganVar.zzd;
        int i13 = 0;
        zzfve.zze(i11 <= i12);
        long j = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j = (j | (bArr[i10 + i14] & 255)) << 8;
        }
        int i15 = (i11 + 1) * 8;
        int i16 = zzganVar.zzb;
        while (i13 < i11 * 8) {
            appendable.append(zzganVar.zza(zzganVar.zza & ((int) (j >>> ((i15 - i16) - i13)))));
            i13 += i16;
        }
        if (this.zzc != null) {
            while (i13 < i12 * 8) {
                appendable.append('=');
                i13 += i16;
            }
        }
    }

    public zzgar(String str, String str2, Character ch2) {
        this(new zzgan(str, str2.toCharArray()), ch2);
    }
}

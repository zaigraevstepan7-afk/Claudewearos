package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzalw implements zzakr {
    private final zzen zza = new zzen();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalw(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzex.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.zzg = i10;
        boolean z2 = (bArr[0] & 32) != 0;
        this.zzb = z2;
        if (z2) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z2 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z2 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z2 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i10, int i11, zzakq zzakqVar, zzdn zzdnVar) {
        String strZzB;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i10 + i11);
        zzenVar.zzL(i10);
        int i21 = 1;
        int i22 = 0;
        int i23 = 2;
        zzdd.zzd(zzenVar.zza() >= 2);
        int iZzq = zzenVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzc = zzenVar.zzc();
            Charset charsetZzC = zzenVar.zzC();
            int iZzc2 = zzenVar.zzc() - iZzc;
            if (charsetZzC == null) {
                charsetZzC = StandardCharsets.UTF_8;
            }
            strZzB = zzenVar.zzB(iZzq - iZzc2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzdnVar.zza(new zzakj(zzfyf.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzB);
        int i24 = this.zzc;
        zzc(spannableStringBuilder, i24, 0, 0, spannableStringBuilder.length(), 16711680);
        int i25 = i24;
        int i26 = this.zzd;
        zzb(spannableStringBuilder, i26, -1, 0, spannableStringBuilder.length(), 16711680);
        int i27 = i26;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzenVar.zza() >= 8) {
            int iZzc3 = zzenVar.zzc();
            int iZzg = zzenVar.zzg();
            int iZzg2 = zzenVar.zzg();
            if (iZzg2 == 1937013100) {
                zzdd.zzd(zzenVar.zza() >= i23 ? i21 : i22);
                int iZzq2 = zzenVar.zzq();
                int i28 = i22;
                while (i28 < iZzq2) {
                    zzdd.zzd(zzenVar.zza() >= 12 ? i21 : i22);
                    int iZzq3 = zzenVar.zzq();
                    int iZzq4 = zzenVar.zzq();
                    zzenVar.zzM(i23);
                    int i29 = iZzq2;
                    int iZzm = zzenVar.zzm();
                    zzenVar.zzM(i21);
                    int iZzg3 = zzenVar.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        i15 = i25;
                        i16 = i27;
                        zzea.zzf("Tx3gParser", m6.a.f("Truncating styl end (", iZzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                        iZzq4 = spannableStringBuilder.length();
                    } else {
                        i15 = i25;
                        i16 = i27;
                    }
                    if (iZzq3 >= iZzq4) {
                        zzea.zzf("Tx3gParser", m6.a.f("Ignoring styl with start (", iZzq3, ") >= end (", iZzq4, ")."));
                        i19 = i15;
                        i18 = i28;
                        i17 = i29;
                        i20 = i16;
                    } else {
                        i17 = i29;
                        i18 = i28;
                        int i30 = i15;
                        zzc(spannableStringBuilder, iZzm, i30, iZzq3, iZzq4, 0);
                        i19 = i30;
                        i20 = i16;
                        zzb(spannableStringBuilder, iZzg3, i20, iZzq3, iZzq4, 0);
                    }
                    iZzq2 = i17;
                    i25 = i19;
                    i27 = i20;
                    i21 = 1;
                    i23 = 2;
                    i28 = i18 + 1;
                    i22 = 0;
                }
                i12 = i25;
                i13 = i27;
                i14 = i23;
            } else {
                i12 = i25;
                i13 = i27;
                if (iZzg2 == 1952608120 && this.zzb) {
                    i14 = 2;
                    zzdd.zzd(zzenVar.zza() >= 2);
                    float fZzq = zzenVar.zzq();
                    int i31 = this.zzg;
                    String str2 = zzex.zza;
                    fMax = Math.max(0.0f, Math.min(fZzq / i31, 0.95f));
                } else {
                    i14 = 2;
                }
            }
            zzenVar.zzL(iZzc3 + iZzg);
            i25 = i12;
            i23 = i14;
            i27 = i13;
            i21 = 1;
            i22 = 0;
        }
        zzcs zzcsVar = new zzcs();
        zzcsVar.zzl(spannableStringBuilder);
        zzcsVar.zze(fMax, 0);
        zzcsVar.zzf(0);
        zzdnVar.zza(new zzakj(zzfyf.zzo(zzcsVar.zzq()), -9223372036854775807L, -9223372036854775807L));
    }
}

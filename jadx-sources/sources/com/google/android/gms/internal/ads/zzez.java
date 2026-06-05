package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzez {
    public final String zza;

    private zzez(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzez zza(zzen zzenVar) {
        String str;
        zzenVar.zzM(2);
        int iZzm = zzenVar.zzm();
        int i10 = iZzm >> 1;
        int i11 = iZzm & 1;
        int iZzm2 = zzenVar.zzm() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iZzm2 | (i11 << 5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10 < 10 ? ".0" : ".");
        sb2.append(i10);
        sb2.append(i12 < 10 ? ".0" : ".");
        sb2.append(i12);
        return new zzez(i10, i12, sb2.toString());
    }
}

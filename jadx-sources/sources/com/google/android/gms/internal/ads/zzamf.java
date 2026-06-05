package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzamf {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzamf(String str, int i10, String str2, Set set) {
        this.zzb = i10;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzamf zza(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        zzdd.zzd(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzex.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new zzamf(str4, i10, str2, hashSet);
    }

    public static zzamf zzb() {
        return new zzamf("", 0, "", Collections.EMPTY_SET);
    }
}

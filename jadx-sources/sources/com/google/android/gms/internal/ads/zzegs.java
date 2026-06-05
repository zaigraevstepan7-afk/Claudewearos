package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzegs {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzegs(String str, String str2, int i10, long j, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String strW = this.zza + "." + this.zzc + "." + this.zzd;
        String str = this.zzb;
        if (!TextUtils.isEmpty(str)) {
            strW = m1.w(strW, ".", str);
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbM)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str)) {
            return strW;
        }
        return strW + "." + num;
    }
}

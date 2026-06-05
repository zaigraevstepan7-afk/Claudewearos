package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfuy {
    private final String zza;
    private final zzfux zzb;
    private zzfux zzc;

    public /* synthetic */ zzfuy(String str, zzfuz zzfuzVar) {
        zzfux zzfuxVar = new zzfux();
        this.zzb = zzfuxVar;
        this.zzc = zzfuxVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfux zzfuxVar = this.zzb.zzb;
        String str = "";
        while (zzfuxVar != null) {
            Object obj = zzfuxVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzfuxVar = zzfuxVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfuy zza(Object obj) {
        zzfux zzfuxVar = new zzfux();
        this.zzc.zzb = zzfuxVar;
        this.zzc = zzfuxVar;
        zzfuxVar.zza = obj;
        return this;
    }
}

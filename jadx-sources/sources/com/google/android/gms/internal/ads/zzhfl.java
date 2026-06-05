package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhfl extends zzhfq {
    final String zza;

    public zzhfl(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhfq
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str);
        Log.d("isoparser", sb2.toString());
    }
}

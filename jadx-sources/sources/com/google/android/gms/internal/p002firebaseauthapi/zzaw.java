package com.google.android.gms.internal.p002firebaseauthapi;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaw {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzaw(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        String strValueOf3 = String.valueOf(this.zza);
        String strValueOf4 = String.valueOf(this.zzc);
        StringBuilder sbM = m1.m("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and ");
        sbM.append(strValueOf3);
        sbM.append("=");
        sbM.append(strValueOf4);
        return new IllegalArgumentException(sbM.toString());
    }
}

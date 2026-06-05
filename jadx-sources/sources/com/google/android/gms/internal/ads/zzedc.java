package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzedc {
    private final Context zza;

    public zzedc(Context context) {
        this.zza = context;
    }

    public final mf.a zza(boolean z2) {
        try {
            q6.a aVar = new q6.a(z2);
            o6.a aVarA = o6.a.a(this.zza);
            return aVarA != null ? aVarA.b(aVar) : zzgdb.zzg(new IllegalStateException());
        } catch (Exception e10) {
            return zzgdb.zzg(e10);
        }
    }
}

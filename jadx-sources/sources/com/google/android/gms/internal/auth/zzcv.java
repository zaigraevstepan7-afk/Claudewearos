package com.google.android.gms.internal.auth;

import android.util.Log;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z2) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbK = a.k("Invalid long value for ", this.zzc, ": ");
            sbK.append((String) obj);
            Log.e("PhenotypeFlag", sbK.toString());
            return null;
        }
    }
}

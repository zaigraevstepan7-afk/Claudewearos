package com.google.android.gms.internal.auth;

import android.util.Log;
import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z2) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbK = a.k("Invalid double value for ", this.zzc, ": ");
            sbK.append((String) obj);
            Log.e("PhenotypeFlag", sbK.toString());
            return null;
        }
    }
}

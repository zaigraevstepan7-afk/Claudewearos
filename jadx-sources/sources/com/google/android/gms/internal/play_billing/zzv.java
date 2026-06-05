package com.google.android.gms.internal.play_billing;

import w8.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzv {
    public static zzeu zza(n nVar) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = nVar.getClass();
        try {
            nVar.a(zzrVar);
            zzrVar.zza = "billingOverrideService.getBillingOverride";
            return zzuVar;
        } catch (Exception e10) {
            zzuVar.zzc(e10);
            return zzuVar;
        }
    }
}

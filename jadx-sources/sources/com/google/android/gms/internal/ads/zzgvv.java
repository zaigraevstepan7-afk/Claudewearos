package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgvv implements zzgvy {
    private final zzgwi zza;

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final Object zza(String str) {
        Iterator it = zzgwa.zzb("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}

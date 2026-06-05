package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzed {
    private static final zzdz zza = new zzeb();
    private static final zzdy zzb = new zzec();

    public static zzdv zza(Set set) {
        zzdv zzdvVar = new zzdv(zza, null);
        zzdvVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdvVar.zzg((zzdk) it.next());
        }
        return zzdvVar;
    }
}

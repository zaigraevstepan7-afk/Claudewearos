package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxx extends zzayi {
    public zzaxx(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "4HRSTLOwWZkuNJXWodn1qJJgWaIIvv19EC2kc5Tc35PPh8H51LV3J7XsfwYf6N8B", "x59qZ2C8s/H9o8A43vx+gBO6K2fFzzXR0hkzA9nrVNs=", zzasrVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasr zzasrVar = this.zzd;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzasrVar.zzac(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzac(3);
        }
    }
}

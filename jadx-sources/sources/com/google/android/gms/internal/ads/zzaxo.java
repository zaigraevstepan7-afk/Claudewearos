package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxo extends zzayi {
    private final zzaww zzh;

    public zzaxo(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, zzaww zzawwVar) {
        super(zzawvVar, "L3kNtlg7QY6D9Xl7pPswVVS/MCBOYXcB4vflYd8GjH187tfdUwj4wLKq5xN70kha", "7KShiw4CrXn9e1sAZ1bf68KLoTIikFllvC3ALPO42ag=", zzasrVar, i10, 85);
        this.zzh = zzawwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        Method method = this.zze;
        zzaww zzawwVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzawwVar.zzd()), Long.valueOf(zzawwVar.zzh()), Long.valueOf(zzawwVar.zzb()), Long.valueOf(zzawwVar.zzf()));
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            zzasrVar.zzt(jArr[0]);
            zzasrVar.zzs(jArr[1]);
        }
    }
}

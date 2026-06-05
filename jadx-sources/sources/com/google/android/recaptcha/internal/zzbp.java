package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbp {
    public static final zzbp zza = new zzbp();

    private zzbp() {
    }

    public static final zzno zza(zzz zzzVar, zzz zzzVar2) {
        zznn zznnVarZzf = zzno.zzf();
        zznnVarZzf.zzp(zzmg.zzb(zzzVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zznnVarZzf.zzq(zzme.zza(zzzVar.zza(timeUnit)));
        zznnVarZzf.zzd(zzmg.zzb(zzzVar2.zzb()));
        zznnVarZzf.zze(zzme.zza(zzzVar2.zza(timeUnit)));
        return (zzno) zznnVarZzf.zzj();
    }
}

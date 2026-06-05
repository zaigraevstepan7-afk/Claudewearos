package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaxn implements Callable {
    private final zzawv zza;
    private final zzasr zzb;

    public zzaxn(zzawv zzawvVar, zzasr zzasrVar) {
        this.zza = zzawvVar;
        this.zzb = zzasrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        zzawv zzawvVar = this.zza;
        if (zzawvVar.zzk() != null) {
            zzawvVar.zzk().get();
        }
        zzato zzatoVarZzc = zzawvVar.zzc();
        if (zzatoVarZzc == null) {
            return null;
        }
        try {
            zzasr zzasrVar = this.zzb;
            synchronized (zzasrVar) {
                zzasrVar.zzaY(zzatoVarZzc.zzaV(), zzgyf.zza());
            }
            return null;
        } catch (zzgzk | NullPointerException unused) {
            return null;
        }
    }
}

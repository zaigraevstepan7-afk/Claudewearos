package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzabk implements zzca {
    private final zzby zza = new zzabj(false);

    public zzabk(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzca
    public final zzcc zza(Context context, zzk zzkVar, zzn zznVar, zzcb zzcbVar, Executor executor, zzbv zzbvVar, List list, long j, boolean z2) {
        try {
            return ((zzca) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzby.class).newInstance(this.zza)).zza(context, zzkVar, zznVar, zzcbVar, executor, zzbvVar, list, 0L, false);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}

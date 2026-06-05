package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import nd.g;
import nd.h;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbzg implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcai zzb;

    public zzbzg(zzbzh zzbzhVar, Context context, zzcai zzcaiVar) {
        this.zza = context;
        this.zzb = zzcaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(kc.b.a(this.zza));
        } catch (IOException | IllegalStateException | g | h e10) {
            this.zzb.zzd(e10);
            k.e("Exception while getting advertising Id info", e10);
        }
    }
}

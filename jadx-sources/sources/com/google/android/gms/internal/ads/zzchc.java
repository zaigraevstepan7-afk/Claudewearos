package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import mc.i;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzchc {
    private final rc.a zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzchc(zzcha zzchaVar, zzchb zzchbVar) {
        this.zza = zzchaVar.zza;
        this.zzb = zzchaVar.zzb;
        this.zzd = zzchaVar.zzd;
        this.zzc = zzchaVar.zzc;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final i zzc() {
        return new i(this.zzb, this.zza);
    }

    public final zzbfv zzd() {
        return new zzbfv(this.zzb);
    }

    public final rc.a zze() {
        return this.zza;
    }

    public final String zzf() {
        return n.D.f11577c.y(this.zzb, this.zza.f14321a);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}

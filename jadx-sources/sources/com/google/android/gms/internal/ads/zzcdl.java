package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzcdl {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcdl(zzcbz zzcbzVar) {
        Context context = zzcbzVar.getContext();
        this.zza = context;
        this.zzb = n.D.f11577c.y(context, zzcbzVar.zzm().f14321a);
        this.zzc = new WeakReference(zzcbzVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcdl zzcdlVar, String str, Map map) {
        zzcbz zzcbzVar = (zzcbz) zzcdlVar.zzc.get();
        if (zzcbzVar != null) {
            zzcbzVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        rc.e.f14331b.post(new zzcdk(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i10) {
        rc.e.f14331b.post(new zzcdi(this, str, str2, i10));
    }

    public final void zzj(String str, String str2, long j) {
        rc.e.f14331b.post(new zzcdj(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j, long j4, boolean z2, int i12, int i13) {
        rc.e.f14331b.post(new zzcdh(this, str, str2, i10, i11, j, j4, z2, i12, i13));
    }

    public final void zzo(String str, String str2, long j, long j4, boolean z2, long j10, long j11, long j12, int i10, int i11) {
        rc.e.f14331b.post(new zzcdg(this, str, str2, j, j4, j10, j11, j12, z2, i10, i11));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcdd zzcddVar) {
        return zzt(str);
    }

    public void release() {
    }

    public void zzp(int i10) {
    }

    public void zzq(int i10) {
    }

    public void zzr(int i10) {
    }

    public void zzs(int i10) {
    }
}

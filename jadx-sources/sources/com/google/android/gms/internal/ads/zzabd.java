package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzabd extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabb zzd;
    private boolean zze;

    public /* synthetic */ zzabd(zzabb zzabbVar, SurfaceTexture surfaceTexture, boolean z2, zzabc zzabcVar) {
        super(surfaceTexture);
        this.zzd = zzabbVar;
        this.zza = z2;
    }

    public static zzabd zza(Context context, boolean z2) {
        boolean z10 = true;
        if (z2 && !zzb(context)) {
            z10 = false;
        }
        zzdd.zzf(z10);
        return new zzabb().zza(z2 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        try {
            if (!zzc) {
                zzb = zzdr.zzd(context) ? zzdr.zze() ? 1 : 2 : 0;
                zzc = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzabb zzabbVar = this.zzd;
        synchronized (zzabbVar) {
            try {
                if (!this.zze) {
                    zzabbVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

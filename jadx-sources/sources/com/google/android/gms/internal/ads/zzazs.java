package com.google.android.gms.internal.ads;

import java.util.Iterator;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzazs implements Runnable {
    final /* synthetic */ zzazt zza;

    public zzazs(zzazt zzaztVar) {
        this.zza = zzaztVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzazt zzaztVar = this.zza;
        synchronized (zzaztVar.zzc) {
            if (zzaztVar.zzd && zzaztVar.zze) {
                zzaztVar.zzd = false;
                int i10 = l0.f13401b;
                k.b("App went background");
                Iterator it = zzaztVar.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzazu) it.next()).zza(false);
                    } catch (Exception e10) {
                        k.e("", e10);
                    }
                }
            } else {
                int i11 = l0.f13401b;
                k.b("App is still foreground");
            }
        }
    }
}

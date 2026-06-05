package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzzj {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzk zzzkVar) {
        zzc(zzzkVar);
        this.zza.add(new zzzi(handler, zzzkVar));
    }

    public final void zzb(final int i10, final long j, final long j4) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzi zzziVar = (zzzi) it.next();
            if (!zzziVar.zzc) {
                zzziVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzziVar.zzb.zzZ(i10, j, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzzk zzzkVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzzi zzziVar = (zzzi) it.next();
            if (zzziVar.zzb == zzzkVar) {
                zzziVar.zzc();
                copyOnWriteArrayList.remove(zzziVar);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import mc.n;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdbm {
    protected final Map zza = new HashMap();

    public zzdbm(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzddo zzddoVar) {
        zzo(zzddoVar.zza, zzddoVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzddo) it.next());
        }
    }

    public final synchronized void zzq(final zzdbl zzdblVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdblVar.zza(key);
                    } catch (Throwable th2) {
                        n.D.f11582h.zzv(th2, "EventEmitter.notify");
                        l0.l("Event emitter exception.", th2);
                    }
                }
            });
        }
    }
}

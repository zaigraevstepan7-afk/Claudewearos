package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzsc {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    private zzsc(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzvh zzvhVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvhVar;
    }

    public final zzsc zza(int i10, zzvh zzvhVar) {
        return new zzsc(this.zzc, 0, zzvhVar);
    }

    public final void zzb(Handler handler, zzsd zzsdVar) {
        this.zzc.add(new zzsb(handler, zzsdVar));
    }

    public final void zzc(zzsd zzsdVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzsb zzsbVar = (zzsb) it.next();
            if (zzsbVar.zza == zzsdVar) {
                copyOnWriteArrayList.remove(zzsbVar);
            }
        }
    }

    public zzsc() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}

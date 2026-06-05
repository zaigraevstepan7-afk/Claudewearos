package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mc.n;
import qc.l0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzazr {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    String str = "Queue is full, current size = " + list.size();
                    int i10 = l0.f13401b;
                    k.b(str);
                    list.remove(0);
                }
                int i11 = this.zza;
                this.zza = i11 + 1;
                zzazqVar.zzg(i11);
                zzazqVar.zzk();
                list.add(zzazqVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzazq zzazqVar2 = (zzazq) it.next();
                    n nVar = n.D;
                    if (((o0) nVar.f11582h.zzi()).i()) {
                        if (!((o0) nVar.f11582h.zzi()).j() && !zzazqVar.equals(zzazqVar2) && zzazqVar2.zzd().equals(zzazqVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzazqVar.equals(zzazqVar2) && zzazqVar2.zzc().equals(zzazqVar.zzc())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzazqVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import mc.n;
import nc.t;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfex {
    private final zzfeb zza;
    private final zzfev zzb;
    private final zzfdx zzc;
    private zzffd zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfex(zzfeb zzfebVar, zzfdx zzfdxVar, zzfev zzfevVar) {
        this.zza = zzfebVar;
        this.zzc = zzfdxVar;
        this.zzb = zzfevVar;
        zzfdxVar.zzb(new zzfes(this));
    }

    public static /* synthetic */ void zzc(zzfex zzfexVar) {
        synchronized (zzfexVar) {
            zzfexVar.zzf = 1;
            zzfexVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        zzfew zzfewVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgt)).booleanValue() && !((o0) n.D.f11582h.zzi()).n().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (true) {
                ArrayDeque arrayDeque = this.zzd;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                zzfewVar = (zzfew) arrayDeque.pollFirst();
                if (zzfewVar == null || (zzfewVar.zza() != null && this.zza.zze(zzfewVar.zza()))) {
                    break;
                }
            }
            zzffd zzffdVar = new zzffd(this.zza, this.zzb, zzfewVar);
            this.zze = zzffdVar;
            zzffdVar.zzd(new zzfet(this, zzfewVar));
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized mf.a zza(zzfew zzfewVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zzc(zzfewVar);
    }

    public final synchronized void zzf(zzfew zzfewVar) {
        this.zzd.add(zzfewVar);
    }
}

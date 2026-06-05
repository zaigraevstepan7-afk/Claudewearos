package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfnm {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfnl zzd = null;

    public zzfnm() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfnl zzfnlVar = (zzfnl) this.zzc.poll();
        this.zzd = zzfnlVar;
        if (zzfnlVar != null) {
            zzfnlVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfnl zzfnlVar) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfnl zzfnlVar) {
        zzfnlVar.zzb(this);
        this.zzc.add(zzfnlVar);
        if (this.zzd == null) {
            zzc();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaqe {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzapl zze;
    private final zzapu zzf;
    private final zzapv[] zzg;
    private zzapn zzh;
    private final List zzi;
    private final List zzj;
    private final zzaps zzk;

    public zzaqe(zzapl zzaplVar, zzapu zzapuVar, int i10) {
        zzaps zzapsVar = new zzaps(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaplVar;
        this.zzf = zzapuVar;
        this.zzg = new zzapv[4];
        this.zzk = zzapsVar;
    }

    public final zzaqb zza(zzaqb zzaqbVar) {
        zzaqbVar.zzf(this);
        Set set = this.zzb;
        synchronized (set) {
            set.add(zzaqbVar);
        }
        zzaqbVar.zzg(this.zza.incrementAndGet());
        zzaqbVar.zzm("add-to-queue");
        zzc(zzaqbVar, 0);
        this.zzc.add(zzaqbVar);
        return zzaqbVar;
    }

    public final void zzb(zzaqb zzaqbVar) {
        Set set = this.zzb;
        synchronized (set) {
            set.remove(zzaqbVar);
        }
        List list = this.zzi;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzaqd) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzc(zzaqbVar, 5);
    }

    public final void zzc(zzaqb zzaqbVar, int i10) {
        List list = this.zzj;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zzaqc) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd() {
        zzapn zzapnVar = this.zzh;
        if (zzapnVar != null) {
            zzapnVar.zzb();
        }
        zzapv[] zzapvVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzapv zzapvVar = zzapvVarArr[i10];
            if (zzapvVar != null) {
                zzapvVar.zza();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = this.zzc;
        PriorityBlockingQueue priorityBlockingQueue2 = this.zzd;
        zzapl zzaplVar = this.zze;
        zzaps zzapsVar = this.zzk;
        zzapn zzapnVar2 = new zzapn(priorityBlockingQueue, priorityBlockingQueue2, zzaplVar, zzapsVar);
        this.zzh = zzapnVar2;
        zzapnVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzapv zzapvVar2 = new zzapv(priorityBlockingQueue2, this.zzf, zzaplVar, zzapsVar);
            zzapvVarArr[i11] = zzapvVar2;
            zzapvVar2.start();
        }
    }
}

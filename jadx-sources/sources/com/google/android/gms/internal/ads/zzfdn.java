package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfdn {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgdm zzc;

    public zzfdn(Callable callable, zzgdm zzgdmVar) {
        this.zzb = callable;
        this.zzc = zzgdmVar;
    }

    public final synchronized mf.a zza() {
        zzc(1);
        return (mf.a) this.zza.poll();
    }

    public final synchronized void zzb(mf.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.zzb(this.zzb));
        }
    }
}

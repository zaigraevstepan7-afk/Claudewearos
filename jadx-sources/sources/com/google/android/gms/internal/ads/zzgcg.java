package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbp;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgcg extends zzgbp.zzf {
    private static final zzgcc zzbg;
    private static final zzgdk zzbh = new zzgdk(zzgcg.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzgcc zzgceVar;
        zzgcf zzgcfVar = null;
        try {
            zzgceVar = new zzgcd(zzgcfVar);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzgceVar = new zzgce(zzgcfVar);
        }
        zzbg = zzgceVar;
        if (th2 != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public zzgcg(int i10) {
        this.remainingField = i10;
    }

    public final int zzB() {
        return zzbg.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzw(setNewSetFromMap);
        zzbg.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public abstract void zzw(Set set);
}

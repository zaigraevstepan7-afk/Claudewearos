package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgcb extends zzgcg {
    private static final zzgdk zza = new zzgdk(zzgcb.class);
    private zzfya zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgcb(zzfya zzfyaVar, boolean z2, boolean z10) {
        super(zzfyaVar.size());
        this.zzb = zzfyaVar;
        this.zzc = z2;
        this.zzd = z10;
    }

    private final void zzD(int i10, Future future) {
        try {
            zzx(i10, zzgee.zza(future));
        } catch (ExecutionException e10) {
            zzF(e10.getCause());
        } catch (Throwable th2) {
            zzF(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzE(zzfya zzfyaVar) {
        int iZzB = zzB();
        int i10 = 0;
        zzfve.zzm(iZzB >= 0, "Less than 0 remaining futures");
        if (iZzB == 0) {
            if (zzfyaVar != null) {
                zzgal it = zzfyaVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzD(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzy();
            zzA(2);
        }
    }

    private final void zzF(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzd(th2) && zzI(zzC(), th2)) {
            zzG(th2);
        } else if (th2 instanceof Error) {
            zzG(th2);
        }
    }

    private static void zzG(Throwable th2) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th2 instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzH(int i10, mf.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzD(i10, aVar);
            }
            zzE(null);
        } catch (Throwable th2) {
            zzE(null);
            throw th2;
        }
    }

    private static boolean zzI(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    public void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        zzfya zzfyaVar = this.zzb;
        return zzfyaVar != null ? "futures=".concat(zzfyaVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzfya zzfyaVar = this.zzb;
        zzA(1);
        if ((zzfyaVar != null) && isCancelled()) {
            boolean zZzo = zzo();
            zzgal it = zzfyaVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzo);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final void zzw(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzi = zzi();
        Objects.requireNonNull(thZzi);
        zzI(set, thZzi);
    }

    public abstract void zzx(int i10, Object obj);

    public abstract void zzy();

    public final void zzz() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzy();
            return;
        }
        if (this.zzc) {
            zzgal it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final mf.a aVar = (mf.a) it.next();
                int i11 = i10 + 1;
                if (aVar.isDone()) {
                    zzH(i10, aVar);
                } else {
                    aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzH(i10, aVar);
                        }
                    }, zzgcp.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzfya zzfyaVar = this.zzb;
        final zzfya zzfyaVar2 = true != this.zzd ? null : zzfyaVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgca
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE(zzfyaVar2);
            }
        };
        zzgal it2 = zzfyaVar.iterator();
        while (it2.hasNext()) {
            mf.a aVar2 = (mf.a) it2.next();
            if (aVar2.isDone()) {
                zzE(zzfyaVar2);
            } else {
                aVar2.addListener(runnable, zzgcp.INSTANCE);
            }
        }
    }
}

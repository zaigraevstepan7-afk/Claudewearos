package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgbp<V> extends zzgbq<V> {

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgbq.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z2, Throwable th2) {
            this.zzc = z2;
            this.zzd = th2;
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzb<V> implements Runnable {
        final zzgbp<V> zza;
        final mf.a zzb;

        public zzb(zzgbp zzgbpVar, mf.a aVar) {
            this.zza = zzgbpVar;
            this.zzb = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzgbq.zzv(this.zza, this, zzgbp.zze(this.zzb))) {
                zzgbp.zzx(this.zza, false);
            }
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgbp.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th2) {
            th2.getClass();
            this.zzb = th2;
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    interface zze<V> extends mf.a {
        @Override // mf.a
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    abstract class zzf<V> extends zzgbp<V> implements zze<V> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(mf.a aVar) {
        Throwable thZzi;
        if (aVar instanceof zze) {
            Object zzaVar = ((zzgbp) aVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th2 = zzaVar2.zzd;
                    zzaVar = th2 != null ? new zza(false, th2) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((aVar instanceof zzgef) && (thZzi = ((zzgef) aVar).zzi()) != null) {
            return new zzc(thZzi);
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!zzgbq.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(aVar);
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)))) : objZzf == null ? zzgbq.zze : objZzf;
        } catch (Error | Exception e10) {
            return new zzc(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e11)) : new zza(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e12)) : new zzc(e12.getCause());
        }
    }

    private static Object zzf(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zzh(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th2 = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzgbq.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzm(Object obj) {
        return !(obj instanceof zzb);
    }

    private final void zzw(StringBuilder sb2) {
        try {
            Object objZzf = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb2.append("null");
            } else if (objZzf == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzf.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (Exception e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzgbp zzgbpVar, boolean z2) {
        zzd zzdVar = null;
        while (true) {
            zzgbpVar.zzt();
            if (z2) {
                zzgbpVar.zzk();
            }
            zzgbpVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzp = zzgbpVar.zzp(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzp != null) {
                zzd zzdVar4 = zzdVarZzp.next;
                zzdVarZzp.next = zzdVar3;
                zzdVar3 = zzdVarZzp;
                zzdVarZzp = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgbpVar = zzbVar.zza;
                    if (zzgbpVar.valueField != zzbVar || !zzgbq.zzv(zzgbpVar, zzbVar, zze(zzbVar.zzb))) {
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z2 = false;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzgbq.zzf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", f.b("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbq, mf.a
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfve.zzc(runnable, "Runnable was null.");
        zzfve.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzu(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgbp.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzgbq.zzg
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzgbp$zza r1 = new com.google.android.gms.internal.ads.zzgbp$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzgbp$zza r1 = com.google.android.gms.internal.ads.zzgbp.zza.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzgbp$zza r1 = com.google.android.gms.internal.ads.zzgbp.zza.zzb
        L26:
            java.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.ads.zzgbq.zzv(r4, r0, r1)
            if (r6 == 0) goto L56
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgbp.zzb
            if (r4 == 0) goto L55
            com.google.android.gms.internal.ads.zzgbp$zzb r0 = (com.google.android.gms.internal.ads.zzgbp.zzb) r0
            mf.a r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgbp.zze
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.ads.zzgbp r4 = (com.google.android.gms.internal.ads.zzgbp) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgbp.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzm(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbp.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return zzq();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzm(obj);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzw(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                mf.a aVar = ((zzb) obj).zzb;
                try {
                    if (aVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(aVar);
                    }
                } catch (Throwable th2) {
                    zzgdu.zzb(th2);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th2.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = zzfvv.zza(zza());
                } catch (Throwable th3) {
                    zzgdu.zzb(th3);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
                }
                if (strConcat != null) {
                    sb2.append(", info=[");
                    sb2.append(strConcat);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzw(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzgbq.zze;
        }
        if (!zzgbq.zzv(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th2) {
        th2.getClass();
        if (!zzgbq.zzv(this, null, new zzc(th2))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgef
    public final Throwable zzi() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzl(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzo());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzn(mf.a r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.valueField
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r5.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            java.lang.Object r5 = zze(r5)
            boolean r5 = com.google.android.gms.internal.ads.zzgbq.zzv(r4, r3, r5)
            if (r5 == 0) goto L49
            zzx(r4, r1)
            return r2
        L1e:
            com.google.android.gms.internal.ads.zzgbp$zzb r0 = new com.google.android.gms.internal.ads.zzgbp$zzb
            r0.<init>(r4, r5)
            boolean r3 = com.google.android.gms.internal.ads.zzgbq.zzv(r4, r3, r0)
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.zzgcp r1 = com.google.android.gms.internal.ads.zzgcp.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r5.addListener(r0, r1)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzgbp$zzc r1 = new com.google.android.gms.internal.ads.zzgbp$zzc     // Catch: java.lang.Throwable -> L36
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            com.google.android.gms.internal.ads.zzgbp$zzc r1 = com.google.android.gms.internal.ads.zzgbp.zzc.zza
        L38:
            com.google.android.gms.internal.ads.zzgbq.zzv(r4, r0, r1)
            return r2
        L3c:
            java.lang.Object r0 = r4.valueField
        L3e:
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzgbp.zza
            if (r2 == 0) goto L49
            com.google.android.gms.internal.ads.zzgbp$zza r0 = (com.google.android.gms.internal.ads.zzgbp.zza) r0
            boolean r0 = r0.zzc
            r5.cancel(r0)
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgbp.zzn(mf.a):boolean");
    }

    public final boolean zzo() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return zzr(j, timeUnit);
    }

    public void zzb() {
    }

    public void zzk() {
    }
}

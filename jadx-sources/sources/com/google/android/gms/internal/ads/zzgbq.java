package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgbq;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgbq<V> extends zzgef implements mf.a {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgdk zzf = new zzgdk(zzgbp.class);
    static final boolean zzg;
    volatile zzgbp.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    abstract class zza {
        public /* synthetic */ zza(zzgbu zzgbuVar) {
        }

        public abstract zzgbp.zzd zza(zzgbq zzgbqVar, zzgbp.zzd zzdVar);

        public abstract zze zzb(zzgbq zzgbqVar, zze zzeVar);

        public abstract void zzc(zze zzeVar, zze zzeVar2);

        public abstract void zzd(zze zzeVar, Thread thread);

        public abstract boolean zze(zzgbq zzgbqVar, zzgbp.zzd zzdVar, zzgbp.zzd zzdVar2);

        public abstract boolean zzf(zzgbq zzgbqVar, Object obj, Object obj2);

        public abstract boolean zzg(zzgbq zzgbqVar, zze zzeVar, zze zzeVar2);
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgbq<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgbq.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgbq<?>, zzgbp.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgbq.class, zzgbp.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgbq<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgbq.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zzgbp.zzd zza(zzgbq zzgbqVar, zzgbp.zzd zzdVar) {
            return zzd.getAndSet(zzgbqVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zze zzb(zzgbq zzgbqVar, zze zzeVar) {
            return zzc.getAndSet(zzgbqVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zze(zzgbq zzgbqVar, zzgbp.zzd zzdVar, zzgbp.zzd zzdVar2) {
            return zzgbr.zza(zzd, zzgbqVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzf(zzgbq zzgbqVar, Object obj, Object obj2) {
            return zzgbr.zza(zze, zzgbqVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzg(zzgbq zzgbqVar, zze zzeVar, zze zzeVar2) {
            return zzgbr.zza(zzc, zzgbqVar, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzb(zzgbu zzgbuVar) {
            super(null);
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zzgbp.zzd zza(zzgbq zzgbqVar, zzgbp.zzd zzdVar) {
            zzgbp.zzd zzdVar2;
            synchronized (zzgbqVar) {
                try {
                    zzdVar2 = zzgbqVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzgbqVar.listenersField = zzdVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zze zzb(zzgbq zzgbqVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgbqVar) {
                try {
                    zzeVar2 = zzgbqVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzgbqVar.waitersField = zzeVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zze(zzgbq zzgbqVar, zzgbp.zzd zzdVar, zzgbp.zzd zzdVar2) {
            synchronized (zzgbqVar) {
                try {
                    if (zzgbqVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzgbqVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzf(zzgbq zzgbqVar, Object obj, Object obj2) {
            synchronized (zzgbqVar) {
                try {
                    if (zzgbqVar.valueField != obj) {
                        return false;
                    }
                    zzgbqVar.valueField = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzg(zzgbq zzgbqVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgbqVar) {
                try {
                    if (zzgbqVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzgbqVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public /* synthetic */ zzc(zzgbu zzgbuVar) {
            super(null);
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e10) {
                    throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzgbt
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                        int i10 = zzgbq.zzd.zzg;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzgbq.class.getDeclaredField("waitersField"));
                zzb = unsafe.objectFieldOffset(zzgbq.class.getDeclaredField("listenersField"));
                zzd = unsafe.objectFieldOffset(zzgbq.class.getDeclaredField("valueField"));
                zze = unsafe.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e11) {
                throw new RuntimeException(e11);
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zzgbp.zzd zza(zzgbq zzgbqVar, zzgbp.zzd zzdVar) {
            zzgbp.zzd zzdVar2;
            do {
                zzdVar2 = zzgbqVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgbqVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final zze zzb(zzgbq zzgbqVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgbqVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzgbqVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zze(zzgbq zzgbqVar, zzgbp.zzd zzdVar, zzgbp.zzd zzdVar2) {
            return zzgbs.zza(zza, zzgbqVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzf(zzgbq zzgbqVar, Object obj, Object obj2) {
            return zzgbs.zza(zza, zzgbqVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbq.zza
        public final boolean zzg(zzgbq zzgbqVar, zze zzeVar, zze zzeVar2) {
            return zzgbs.zza(zza, zzgbqVar, zzc, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzd(zzgbu zzgbuVar) {
            super(null);
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z2) {
        }

        public zze() {
            zzgbq.zzs(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        Throwable th2;
        Throwable th3;
        zza zzcVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        zzg = z2;
        String property = System.getProperty("java.runtime.name", "");
        zzgbu zzgbuVar = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(zzgbuVar);
            } catch (Error | Exception e10) {
                try {
                    zzcVar = new zzb(zzgbuVar);
                    th2 = null;
                    th3 = e10;
                } catch (Error | Exception e11) {
                    th2 = e11;
                    th3 = e10;
                    zzcVar = new zzc(zzgbuVar);
                }
            }
        } else {
            try {
                zzcVar = new zzb(zzgbuVar);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(zzgbuVar);
            }
        }
        th2 = null;
        th3 = null;
        zzbi = zzcVar;
        if (th2 != null) {
            zzgdk zzgdkVar = zzf;
            Logger loggerZza = zzgdkVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            zzgdkVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbi.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static /* synthetic */ void zzs(zze zzeVar, Thread thread) {
        zzbi.zzd(zzeVar, thread);
    }

    public static boolean zzv(zzgbq zzgbqVar, Object obj, Object obj2) {
        return zzbi.zzf(zzgbqVar, obj, obj2);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final zzgbp.zzd zzp(zzgbp.zzd zzdVar) {
        return zzbi.zza(this, zzdVar);
    }

    public final Object zzq() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzgbp.zzm(obj2)) {
            return zzgbp.zzh(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbi;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzgbp.zzm(obj)));
                    return zzgbp.zzh(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzgbp.zzh(obj3);
    }

    public final Object zzr(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z2 = true;
        if ((obj != null) && zzgbp.zzm(obj)) {
            return zzgbp.zzh(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbi;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzgbp.zzm(obj2)) {
                                return zzgbp.zzh(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzgbp.zzh(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzgbp.zzm(obj4)) {
                return zzgbp.zzh(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z2 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z2) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(m1.w(strConcat, " for ", string));
    }

    public final void zzt() {
        for (zze zzeVarZzb = zzbi.zzb(this, zze.zza); zzeVarZzb != null; zzeVarZzb = zzeVarZzb.next) {
            Thread thread = zzeVarZzb.thread;
            if (thread != null) {
                zzeVarZzb.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean zzu(zzgbp.zzd zzdVar, zzgbp.zzd zzdVar2) {
        return zzbi.zze(this, zzdVar, zzdVar2);
    }
}

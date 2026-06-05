package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzamm {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzc zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzc {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j) {
            return zzamm.zza ? zzamm.zzf(obj, j) : zzamm.zzg(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, boolean z2) {
            if (zzamm.zza) {
                zzamm.zza(obj, j, z2);
            } else {
                zzamm.zzb(obj, j, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, byte b10) {
            if (!zzamm.zza) {
                zzamm.zzd(obj, j, b10);
            } else {
                zzamm.zzc(obj, j, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, double d10) {
            zza(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, float f10) {
            zza(obj, j, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zzb extends zzc {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final double zza(Object obj, long j) {
            return Double.longBitsToDouble(zze(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final float zzb(Object obj, long j) {
            return Float.intBitsToFloat(zzd(obj, j));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final boolean zzc(Object obj, long j) {
            return zzamm.zza ? zzamm.zzf(obj, j) : zzamm.zzg(obj, j);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, boolean z2) {
            if (zzamm.zza) {
                zzamm.zza(obj, j, z2);
            } else {
                zzamm.zzb(obj, j, z2);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, byte b10) {
            if (!zzamm.zza) {
                zzamm.zzd(obj, j, b10);
            } else {
                zzamm.zzc(obj, j, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, double d10) {
            zza(obj, j, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamm.zzc
        public final void zza(Object obj, long j, float f10) {
            zza(obj, j, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static abstract class zzc {
        Unsafe zza;

        public zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b10);

        public abstract void zza(Object obj, long j, double d10);

        public abstract void zza(Object obj, long j, float f10);

        public final void zza(Object obj, long j, int i10) {
            this.zza.putInt(obj, j, i10);
        }

        public abstract void zza(Object obj, long j, boolean z2);

        public abstract float zzb(Object obj, long j);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamm.zze() != null;
            } catch (Throwable th2) {
                zzamm.zza(th2);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j);

        public final int zzd(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final long zze(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j4) {
            this.zza.putLong(obj, j, j4);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                zzamm.zza(th2);
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzahl.zza()
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzamm$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzamm$zza
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.firebase-auth-api.zzamm$zzb r1 = new com.google.android.gms.internal.firebase-auth-api.zzamm$zzb
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzi = r2
            java.lang.Class<boolean[]> r4 = boolean[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzj = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzk = r4
            java.lang.Class<int[]> r4 = int[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzl = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzm = r4
            java.lang.Class<long[]> r4 = long[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzn = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzo = r4
            java.lang.Class<float[]> r4 = float[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzp = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzq = r4
            java.lang.Class<double[]> r4 = double[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzr = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzs = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzt = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzu = r4
            java.lang.reflect.Field r4 = zze()
            if (r4 == 0) goto Lbf
            if (r1 != 0) goto Lb8
            goto Lbf
        Lb8:
            sun.misc.Unsafe r1 = r1.zza
            long r4 = r1.objectFieldOffset(r4)
            goto Lc1
        Lbf:
            r4 = -1
        Lc1:
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzv = r4
            r4 = 7
            long r1 = r2 & r4
            int r1 = (int) r1
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zzw = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Ld3
            r0 = 1
        Ld3:
            com.google.android.gms.internal.p002firebaseauthapi.zzamm.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamm.<clinit>():void");
    }

    private zzamm() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j) {
        return zzf.zze(obj, j);
    }

    public static Object zze(Object obj, long j) {
        return zzf.zza.getObject(obj, j);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) != 0;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j) {
        return ((byte) (zzc(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) != 0;
    }

    public static boolean zzh(Object obj, long j) {
        return zzf.zzc(obj, j);
    }

    public static float zzb(Object obj, long j) {
        return zzf.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b10) {
        long j4 = (-4) & j;
        int i10 = (((int) j) & 3) << 3;
        zza(obj, j4, ((255 & b10) << i10) | (zzc(obj, j4) & (~(255 << i10))));
    }

    public static double zza(Object obj, long j) {
        return zzf.zza(obj, j);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j) {
        return zzf.zzd(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field fieldZza = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (fieldZza != null) {
            return fieldZza;
        }
        Field fieldZza2 = zza((Class<?>) Buffer.class, "address");
        if (fieldZza2 == null || fieldZza2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZza2;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void zzc(Object obj, long j, boolean z2) {
        zzf.zza(obj, j, z2);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzaml());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b10) {
        long j4 = (-4) & j;
        int iZzc = zzc(obj, j4);
        int i10 = ((~((int) j)) & 3) << 3;
        zza(obj, j4, ((255 & b10) << i10) | (iZzc & (~(255 << i10))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th2) {
        Logger.getLogger(zzamm.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th2)));
    }

    public static /* synthetic */ void zzb(Object obj, long j, boolean z2) {
        zzd(obj, j, z2 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j, boolean z2) {
        zzc(obj, j, z2 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j, byte b10) {
        zzf.zza((Object) bArr, zzi + j, b10);
    }

    public static void zza(Object obj, long j, double d10) {
        zzf.zza(obj, j, d10);
    }

    public static void zza(Object obj, long j, float f10) {
        zzf.zza(obj, j, f10);
    }

    public static void zza(Object obj, long j, int i10) {
        zzf.zza(obj, j, i10);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j, long j4) {
        zzf.zza(obj, j, j4);
    }

    public static void zza(Object obj, long j, Object obj2) {
        zzf.zza.putObject(obj, j, obj2);
    }
}

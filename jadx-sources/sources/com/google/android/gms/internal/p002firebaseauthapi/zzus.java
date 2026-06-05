package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzus extends zzaje<zzus, zza> implements zzakr {
    private static final zzus zzc;
    private static volatile zzaky<zzus> zzd;
    private int zze;
    private int zzf;
    private zzuv zzg;
    private zzaho zzh = zzaho.zza;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzus, zza> implements zzakr {
        private zza() {
            super(zzus.zzc);
        }

        public final zza zza(zzaho zzahoVar) {
            zzi();
            ((zzus) this.zza).zza(zzahoVar);
            return this;
        }

        public /* synthetic */ zza(zzut zzutVar) {
            this();
        }

        public final zza zza(zzuv zzuvVar) {
            zzi();
            ((zzus) this.zza).zza(zzuvVar);
            return this;
        }

        public final zza zza(int i10) {
            zzi();
            ((zzus) this.zza).zza(0);
            return this;
        }
    }

    static {
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzaje.zza((Class<zzus>) zzus.class, zzusVar);
    }

    private zzus() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzaky<zzus> zzf() {
        return (zzaky) zzc.zza(zzaje.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzuv zzd() {
        zzuv zzuvVar = this.zzg;
        return zzuvVar == null ? zzuv.zze() : zzuvVar;
    }

    public final zzaho zze() {
        return this.zzh;
    }

    public static zzus zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzus) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzut zzutVar = null;
        switch (zzut.zza[i10 - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza(zzutVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzus> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzus.class) {
                    try {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzaje.zzc(zzc);
                            zzd = zzcVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzaho zzahoVar) {
        zzahoVar.getClass();
        this.zzh = zzahoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuv zzuvVar) {
        zzuvVar.getClass();
        this.zzg = zzuvVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = 0;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzry extends zzaje<zzry, zza> implements zzakr {
    private static final zzry zzc;
    private static volatile zzaky<zzry> zzd;
    private int zze;
    private int zzf;
    private zzsb zzg;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzry, zza> implements zzakr {
        private zza() {
            super(zzry.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzry) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzrz zzrzVar) {
            this();
        }

        public final zza zza(zzsb zzsbVar) {
            zzi();
            ((zzry) this.zza).zza(zzsbVar);
            return this;
        }
    }

    static {
        zzry zzryVar = new zzry();
        zzc = zzryVar;
        zzaje.zza((Class<zzry>) zzry.class, zzryVar);
    }

    private zzry() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsb zzd() {
        zzsb zzsbVar = this.zzg;
        return zzsbVar == null ? zzsb.zzd() : zzsbVar;
    }

    public static zzry zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzry) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzrz zzrzVar = null;
        switch (zzrz.zza[i10 - 1]) {
            case 1:
                return new zzry();
            case 2:
                return new zza(zzrzVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzry> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzry.class) {
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
    public final void zza(int i10) {
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsb zzsbVar) {
        zzsbVar.getClass();
        this.zzg = zzsbVar;
        this.zze |= 1;
    }
}

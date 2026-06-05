package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzue extends zzaje<zzue, zza> implements zzakr {
    private static final zzue zzc;
    private static volatile zzaky<zzue> zzd;
    private int zze;
    private zzuh zzf;
    private int zzg;
    private int zzh;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzue, zza> implements zzakr {
        private zza() {
            super(zzue.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzue) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzuf zzufVar) {
            this();
        }

        public final zza zza(zzuh zzuhVar) {
            zzi();
            ((zzue) this.zza).zza(zzuhVar);
            return this;
        }
    }

    static {
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzaje.zza((Class<zzue>) zzue.class, zzueVar);
    }

    private zzue() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzue zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzuh zzf() {
        zzuh zzuhVar = this.zzf;
        return zzuhVar == null ? zzuh.zze() : zzuhVar;
    }

    public static zzue zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzue) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzuf zzufVar = null;
        switch (zzuf.zza[i10 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza(zzufVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzue> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzue.class) {
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
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuh zzuhVar) {
        zzuhVar.getClass();
        this.zzf = zzuhVar;
        this.zze |= 1;
    }
}

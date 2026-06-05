package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzte extends zzaje<zzte, zza> implements zzakr {
    private static final zzte zzc;
    private static volatile zzaky<zzte> zzd;
    private int zze;
    private zzaho zzf = zzaho.zza;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzte, zza> implements zzakr {
        private zza() {
            super(zzte.zzc);
        }

        public final zza zza(zzaho zzahoVar) {
            zzi();
            ((zzte) this.zza).zza(zzahoVar);
            return this;
        }

        public /* synthetic */ zza(zztf zztfVar) {
            this();
        }
    }

    static {
        zzte zzteVar = new zzte();
        zzc = zzteVar;
        zzaje.zza((Class<zzte>) zzte.class, zzteVar);
    }

    private zzte() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzaky<zzte> zze() {
        return (zzaky) zzc.zza(zzaje.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzaho zzd() {
        return this.zzf;
    }

    public static zzte zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzte) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zztf zztfVar = null;
        switch (zztf.zza[i10 - 1]) {
            case 1:
                return new zzte();
            case 2:
                return new zza(zztfVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzte> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzte.class) {
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
        this.zzf = zzahoVar;
    }
}

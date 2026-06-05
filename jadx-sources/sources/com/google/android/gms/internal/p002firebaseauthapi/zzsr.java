package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzsr extends zzaje<zzsr, zza> implements zzakr {
    private static final zzsr zzc;
    private static volatile zzaky<zzsr> zzd;
    private int zze;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzsr, zza> implements zzakr {
        private zza() {
            super(zzsr.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsr) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsq zzsqVar) {
            this();
        }
    }

    static {
        zzsr zzsrVar = new zzsr();
        zzc = zzsrVar;
        zzaje.zza((Class<zzsr>) zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsr zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzsq zzsqVar = null;
        switch (zzsq.zza[i10 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza(zzsqVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsr> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzsr.class) {
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
        this.zze = i10;
    }
}

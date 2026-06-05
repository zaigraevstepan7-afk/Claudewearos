package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzun extends zzaje<zzun, zza> implements zzakr {
    private static final zzun zzc;
    private static volatile zzaky<zzun> zzd;
    private int zze;
    private zzur zzf;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzun, zza> implements zzakr {
        private zza() {
            super(zzun.zzc);
        }

        public final zza zza(zzur zzurVar) {
            zzi();
            ((zzun) this.zza).zza(zzurVar);
            return this;
        }

        public /* synthetic */ zza(zzup zzupVar) {
            this();
        }
    }

    static {
        zzun zzunVar = new zzun();
        zzc = zzunVar;
        zzaje.zza((Class<zzun>) zzun.class, zzunVar);
    }

    private zzun() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzur zzc() {
        zzur zzurVar = this.zzf;
        return zzurVar == null ? zzur.zzf() : zzurVar;
    }

    public static zzun zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzun) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzup zzupVar = null;
        switch (zzup.zza[i10 - 1]) {
            case 1:
                return new zzun();
            case 2:
                return new zza(zzupVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzun> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzun.class) {
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
    public final void zza(zzur zzurVar) {
        zzurVar.getClass();
        this.zzf = zzurVar;
        this.zze |= 1;
    }
}

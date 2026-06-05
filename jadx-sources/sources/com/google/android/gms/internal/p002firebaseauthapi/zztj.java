package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zztj extends zzaje<zztj, zza> implements zzakr {
    private static final zztj zzc;
    private static volatile zzaky<zztj> zzd;
    private int zze;
    private zzvc zzf;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zztj, zza> implements zzakr {
        private zza() {
            super(zztj.zzc);
        }

        public final zza zza(zzvc zzvcVar) {
            zzi();
            ((zztj) this.zza).zza(zzvcVar);
            return this;
        }

        public /* synthetic */ zza(zztl zztlVar) {
            this();
        }
    }

    static {
        zztj zztjVar = new zztj();
        zzc = zztjVar;
        zzaje.zza((Class<zztj>) zztj.class, zztjVar);
    }

    private zztj() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zztj zzc() {
        return zzc;
    }

    public final zzvc zzd() {
        zzvc zzvcVar = this.zzf;
        return zzvcVar == null ? zzvc.zzc() : zzvcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zztl zztlVar = null;
        switch (zztl.zza[i10 - 1]) {
            case 1:
                return new zztj();
            case 2:
                return new zza(zztlVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zztj> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zztj.class) {
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
    public final void zza(zzvc zzvcVar) {
        zzvcVar.getClass();
        this.zzf = zzvcVar;
        this.zze |= 1;
    }
}

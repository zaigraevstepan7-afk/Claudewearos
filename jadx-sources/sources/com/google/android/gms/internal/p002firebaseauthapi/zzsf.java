package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzsf extends zzaje<zzsf, zza> implements zzakr {
    private static final zzsf zzc;
    private static volatile zzaky<zzsf> zzd;
    private int zze;
    private zzsj zzf;
    private zzue zzg;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzsf, zza> implements zzakr {
        private zza() {
            super(zzsf.zzc);
        }

        public final zza zza(zzsj zzsjVar) {
            zzi();
            ((zzsf) this.zza).zza(zzsjVar);
            return this;
        }

        public /* synthetic */ zza(zzse zzseVar) {
            this();
        }

        public final zza zza(zzue zzueVar) {
            zzi();
            ((zzsf) this.zza).zza(zzueVar);
            return this;
        }
    }

    static {
        zzsf zzsfVar = new zzsf();
        zzc = zzsfVar;
        zzaje.zza((Class<zzsf>) zzsf.class, zzsfVar);
    }

    private zzsf() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzsj zzc() {
        zzsj zzsjVar = this.zzf;
        return zzsjVar == null ? zzsj.zzd() : zzsjVar;
    }

    public final zzue zzd() {
        zzue zzueVar = this.zzg;
        return zzueVar == null ? zzue.zze() : zzueVar;
    }

    public static zzsf zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzsf) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzse zzseVar = null;
        switch (zzse.zza[i10 - 1]) {
            case 1:
                return new zzsf();
            case 2:
                return new zza(zzseVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsf> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzsf.class) {
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
    public final void zza(zzsj zzsjVar) {
        zzsjVar.getClass();
        this.zzf = zzsjVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzue zzueVar) {
        zzueVar.getClass();
        this.zzg = zzueVar;
        this.zze |= 2;
    }
}

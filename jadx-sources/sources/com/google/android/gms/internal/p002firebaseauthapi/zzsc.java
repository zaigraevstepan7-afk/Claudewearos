package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzsc extends zzaje<zzsc, zza> implements zzakr {
    private static final zzsc zzc;
    private static volatile zzaky<zzsc> zzd;
    private int zze;
    private int zzf;
    private zzsg zzg;
    private zzud zzh;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzsc, zza> implements zzakr {
        private zza() {
            super(zzsc.zzc);
        }

        public final zza zza(zzsg zzsgVar) {
            zzi();
            ((zzsc) this.zza).zza(zzsgVar);
            return this;
        }

        public /* synthetic */ zza(zzsd zzsdVar) {
            this();
        }

        public final zza zza(zzud zzudVar) {
            zzi();
            ((zzsc) this.zza).zza(zzudVar);
            return this;
        }
    }

    static {
        zzsc zzscVar = new zzsc();
        zzc = zzscVar;
        zzaje.zza((Class<zzsc>) zzsc.class, zzscVar);
    }

    private zzsc() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzaky<zzsc> zzf() {
        return (zzaky) zzc.zza(zzaje.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsg zzd() {
        zzsg zzsgVar = this.zzg;
        return zzsgVar == null ? zzsg.zzd() : zzsgVar;
    }

    public final zzud zze() {
        zzud zzudVar = this.zzh;
        return zzudVar == null ? zzud.zzd() : zzudVar;
    }

    public static zzsc zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzsc) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzsd zzsdVar = null;
        switch (zzsd.zza[i10 - 1]) {
            case 1:
                return new zzsc();
            case 2:
                return new zza(zzsdVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\u1009\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsc> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzsc.class) {
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
    public final void zza(zzsg zzsgVar) {
        zzsgVar.getClass();
        this.zzg = zzsgVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzud zzudVar) {
        zzudVar.getClass();
        this.zzh = zzudVar;
        this.zze |= 2;
    }
}

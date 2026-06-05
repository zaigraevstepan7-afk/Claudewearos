package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzsb extends zzaje<zzsb, zza> implements zzakr {
    private static final zzsb zzc;
    private static volatile zzaky<zzsb> zzd;
    private int zze;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzsb, zza> implements zzakr {
        private zza() {
            super(zzsb.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzsb) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsa zzsaVar) {
            this();
        }
    }

    static {
        zzsb zzsbVar = new zzsb();
        zzc = zzsbVar;
        zzaje.zza((Class<zzsb>) zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsb zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzsa zzsaVar = null;
        switch (zzsa.zza[i10 - 1]) {
            case 1:
                return new zzsb();
            case 2:
                return new zza(zzsaVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzsb> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzsb.class) {
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

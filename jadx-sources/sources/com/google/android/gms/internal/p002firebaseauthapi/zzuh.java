package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzuh extends zzaje<zzuh, zza> implements zzakr {
    private static final zzuh zzc;
    private static volatile zzaky<zzuh> zzd;
    private int zze;
    private int zzf;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzuh, zza> implements zzakr {
        private zza() {
            super(zzuh.zzc);
        }

        public final zza zza(zzub zzubVar) {
            zzi();
            ((zzuh) this.zza).zza(zzubVar);
            return this;
        }

        public /* synthetic */ zza(zzug zzugVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzuh) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzuh zzuhVar = new zzuh();
        zzc = zzuhVar;
        zzaje.zza((Class<zzuh>) zzuh.class, zzuhVar);
    }

    private zzuh() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuh zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzub zzb() {
        zzub zzubVarZza = zzub.zza(this.zze);
        return zzubVarZza == null ? zzub.UNRECOGNIZED : zzubVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzug zzugVar = null;
        switch (zzug.zza[i10 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza(zzugVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzuh> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzuh.class) {
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
    public final void zza(zzub zzubVar) {
        this.zze = zzubVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzf = i10;
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzso extends zzaje<zzso, zza> implements zzakr {
    private static final zzso zzc;
    private static volatile zzaky<zzso> zzd;
    private int zze;
    private zzsr zzf;
    private int zzg;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzso, zza> implements zzakr {
        private zza() {
            super(zzso.zzc);
        }

        public final zza zza(int i10) {
            zzi();
            ((zzso) this.zza).zza(i10);
            return this;
        }

        public /* synthetic */ zza(zzsp zzspVar) {
            this();
        }

        public final zza zza(zzsr zzsrVar) {
            zzi();
            ((zzso) this.zza).zza(zzsrVar);
            return this;
        }
    }

    static {
        zzso zzsoVar = new zzso();
        zzc = zzsoVar;
        zzaje.zza((Class<zzso>) zzso.class, zzsoVar);
    }

    private zzso() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzsr zzd() {
        zzsr zzsrVar = this.zzf;
        return zzsrVar == null ? zzsr.zzd() : zzsrVar;
    }

    public static zzso zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzso) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzsp zzspVar = null;
        switch (zzsp.zza[i10 - 1]) {
            case 1:
                return new zzso();
            case 2:
                return new zza(zzspVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzso> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzso.class) {
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
    public final void zza(zzsr zzsrVar) {
        zzsrVar.getClass();
        this.zzf = zzsrVar;
        this.zze |= 1;
    }
}

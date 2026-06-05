package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzvl extends zzaje<zzvl, zza> implements zzakr {
    private static final zzvl zzc;
    private static volatile zzaky<zzvl> zzd;
    private String zze = "";

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzvl, zza> implements zzakr {
        private zza() {
            super(zzvl.zzc);
        }

        public final zza zza(String str) {
            zzi();
            ((zzvl) this.zza).zza(str);
            return this;
        }

        public /* synthetic */ zza(zzvm zzvmVar) {
            this();
        }
    }

    static {
        zzvl zzvlVar = new zzvl();
        zzc = zzvlVar;
        zzaje.zza((Class<zzvl>) zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzvl zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzvl zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zzvl) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzvm zzvmVar = null;
        switch (zzvm.zza[i10 - 1]) {
            case 1:
                return new zzvl();
            case 2:
                return new zza(zzvmVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzaky<zzvl> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzvl.class) {
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
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }
}

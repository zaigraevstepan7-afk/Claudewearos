package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zztn extends zzaje<zztn, zza> implements zzakr {
    private static final zztn zzc;
    private static volatile zzaky<zztn> zzd;
    private int zze;
    private zzto zzf;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zztn, zza> implements zzakr {
        private zza() {
            super(zztn.zzc);
        }

        public final zza zza(zzto zztoVar) {
            zzi();
            ((zztn) this.zza).zza(zztoVar);
            return this;
        }

        public /* synthetic */ zza(zztm zztmVar) {
            this();
        }
    }

    static {
        zztn zztnVar = new zztn();
        zzc = zztnVar;
        zzaje.zza((Class<zztn>) zztn.class, zztnVar);
    }

    private zztn() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzto zzc() {
        zzto zztoVar = this.zzf;
        return zztoVar == null ? zzto.zze() : zztoVar;
    }

    public static zztn zza(zzaho zzahoVar, zzaiq zzaiqVar) {
        return (zztn) zzaje.zza(zzc, zzahoVar, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zztm zztmVar = null;
        switch (zztm.zza[i10 - 1]) {
            case 1:
                return new zztn();
            case 2:
                return new zza(zztmVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzaky<zztn> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zztn.class) {
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
    public final void zza(zzto zztoVar) {
        zztoVar.getClass();
        this.zzf = zztoVar;
        this.zze |= 1;
    }
}

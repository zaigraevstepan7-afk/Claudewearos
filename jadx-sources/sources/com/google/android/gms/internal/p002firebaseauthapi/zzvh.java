package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzvh extends zzaje<zzvh, zza> implements zzakr {
    private static final zzvh zzc;
    private static volatile zzaky<zzvh> zzd;
    private int zze;
    private zzajl<zzb> zzf = zzaje.zzp();

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje.zza<zzvh, zza> implements zzakr {
        private zza() {
            super(zzvh.zzc);
        }

        public final zza zza(zzb zzbVar) {
            zzi();
            ((zzvh) this.zza).zza(zzbVar);
            return this;
        }

        public /* synthetic */ zza(zzvi zzviVar) {
            this();
        }

        public final zza zza(int i10) {
            zzi();
            ((zzvh) this.zza).zzc(i10);
            return this;
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zzb extends zzaje<zzb, zza> implements zzakr {
        private static final zzb zzc;
        private static volatile zzaky<zzb> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
        public static final class zza extends zzaje.zza<zzb, zza> implements zzakr {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(int i10) {
                zzi();
                ((zzb) this.zza).zza(i10);
                return this;
            }

            public /* synthetic */ zza(zzvi zzviVar) {
                this();
            }

            public final zza zza(zzvs zzvsVar) {
                zzi();
                ((zzb) this.zza).zza(zzvsVar);
                return this;
            }

            public final zza zza(zzva zzvaVar) {
                zzi();
                ((zzb) this.zza).zza(zzvaVar);
                return this;
            }

            public final zza zza(String str) {
                zzi();
                ((zzb) this.zza).zza(str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzaje.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzb() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        public final Object zza(int i10, Object obj, Object obj2) {
            zzaky zzcVar;
            zzvi zzviVar = null;
            switch (zzvi.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(zzviVar);
                case 3:
                    return zzaje.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzaky<zzb> zzakyVar = zzd;
                    if (zzakyVar != null) {
                        return zzakyVar;
                    }
                    synchronized (zzb.class) {
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
        public final void zza(zzvs zzvsVar) {
            this.zzh = zzvsVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzva zzvaVar) {
            this.zzf = zzvaVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zze = str;
        }
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzaje.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    private zzvh() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zzb zza(int i10) {
        return this.zzf.get(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzvi zzviVar = null;
        switch (zzvi.zza[i10 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza(zzviVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzaky<zzvh> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzvh.class) {
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
    public final void zza(zzb zzbVar) {
        zzbVar.getClass();
        zzajl<zzb> zzajlVar = this.zzf;
        if (!zzajlVar.zzc()) {
            this.zzf = zzaje.zza(zzajlVar);
        }
        this.zzf.add(zzbVar);
    }
}

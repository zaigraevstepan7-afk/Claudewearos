package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzvg extends zzaje<zzvg, zzb> implements zzakr {
    private static final zzvg zzc;
    private static volatile zzaky<zzvg> zzd;
    private int zze;
    private zzajl<zza> zzf = zzaje.zzp();

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza extends zzaje<zza, C0006zza> implements zzakr {
        private static final zza zzc;
        private static volatile zzaky<zza> zzd;
        private int zze;
        private zzuw zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvg$zza$zza, reason: collision with other inner class name */
        public static final class C0006zza extends zzaje.zza<zza, C0006zza> implements zzakr {
            private C0006zza() {
                super(zza.zzc);
            }

            public final C0006zza zza(zzuw.zza zzaVar) {
                zzi();
                ((zza) this.zza).zza((zzuw) ((zzaje) zzaVar.zzf()));
                return this;
            }

            public /* synthetic */ C0006zza(zzvf zzvfVar) {
                this();
            }

            public final C0006zza zza(zzuw zzuwVar) {
                zzi();
                ((zza) this.zza).zza(zzuwVar);
                return this;
            }

            public final C0006zza zza(int i10) {
                zzi();
                ((zza) this.zza).zza(i10);
                return this;
            }

            public final C0006zza zza(zzvs zzvsVar) {
                zzi();
                ((zza) this.zza).zza(zzvsVar);
                return this;
            }

            public final C0006zza zza(zzva zzvaVar) {
                zzi();
                ((zza) this.zza).zza(zzvaVar);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzaje.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C0006zza zzd() {
            return zzc.zzm();
        }

        public final int zza() {
            return this.zzh;
        }

        public final zzuw zzb() {
            zzuw zzuwVar = this.zzf;
            return zzuwVar == null ? zzuw.zzd() : zzuwVar;
        }

        public final zzva zzc() {
            zzva zzvaVarZza = zzva.zza(this.zzg);
            return zzvaVarZza == null ? zzva.UNRECOGNIZED : zzvaVarZza;
        }

        public final zzvs zzf() {
            zzvs zzvsVarZza = zzvs.zza(this.zzi);
            return zzvsVarZza == null ? zzvs.UNRECOGNIZED : zzvsVarZza;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
        public final Object zza(int i10, Object obj, Object obj2) {
            zzaky zzcVar;
            zzvf zzvfVar = null;
            switch (zzvf.zza[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0006zza(zzvfVar);
                case 3:
                    return zzaje.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzaky<zza> zzakyVar = zzd;
                    if (zzakyVar != null) {
                        return zzakyVar;
                    }
                    synchronized (zza.class) {
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
        public final void zza(zzuw zzuwVar) {
            zzuwVar.getClass();
            this.zzf = zzuwVar;
            this.zze |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(int i10) {
            this.zzh = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzvs zzvsVar) {
            this.zzi = zzvsVar.zza();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzva zzvaVar) {
            this.zzg = zzvaVar.zza();
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zzb extends zzaje.zza<zzvg, zzb> implements zzakr {
        private zzb() {
            super(zzvg.zzc);
        }

        public final int zza() {
            return ((zzvg) this.zza).zza();
        }

        public final zza zzb(int i10) {
            return ((zzvg) this.zza).zza(i10);
        }

        public /* synthetic */ zzb(zzvf zzvfVar) {
            this();
        }

        public final zzb zza(zza zzaVar) {
            zzi();
            ((zzvg) this.zza).zza(zzaVar);
            return this;
        }

        public final List<zza> zzb() {
            return Collections.unmodifiableList(((zzvg) this.zza).zze());
        }

        public final zzb zza(int i10) {
            zzi();
            ((zzvg) this.zza).zzc(i10);
            return this;
        }
    }

    static {
        zzvg zzvgVar = new zzvg();
        zzc = zzvgVar;
        zzaje.zza((Class<zzvg>) zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    public static zzb zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zza> zze() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i10) {
        this.zze = i10;
    }

    public final zza zza(int i10) {
        return this.zzf.get(i10);
    }

    public static zzvg zza(InputStream inputStream, zzaiq zzaiqVar) {
        return (zzvg) zzaje.zza(zzc, inputStream, zzaiqVar);
    }

    public static zzvg zza(byte[] bArr, zzaiq zzaiqVar) {
        return (zzvg) zzaje.zza(zzc, bArr, zzaiqVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final Object zza(int i10, Object obj, Object obj2) {
        zzaky zzcVar;
        zzvf zzvfVar = null;
        switch (zzvf.zza[i10 - 1]) {
            case 1:
                return new zzvg();
            case 2:
                return new zzb(zzvfVar);
            case 3:
                return zzaje.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzaky<zzvg> zzakyVar = zzd;
                if (zzakyVar != null) {
                    return zzakyVar;
                }
                synchronized (zzvg.class) {
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
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzajl<zza> zzajlVar = this.zzf;
        if (!zzajlVar.zzc()) {
            this.zzf = zzaje.zza(zzajlVar);
        }
        this.zzf.add(zzaVar);
    }
}

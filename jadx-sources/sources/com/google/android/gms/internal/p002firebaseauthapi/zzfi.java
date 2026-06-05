package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzfi extends zzcw {
    private final zzc zza;
    private final String zzb;
    private final zzb zzc;
    private final zzcw zzd;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static class zza {
        private zzc zza;
        private String zzb;
        private zzb zzc;
        private zzcw zzd;

        private zza() {
        }

        public final zza zza(zzcw zzcwVar) {
            this.zzd = zzcwVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zza zza(String str) {
            this.zzb = str;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        public final zzfi zza() throws GeneralSecurityException {
            if (this.zza == null) {
                this.zza = zzc.zzb;
            }
            if (this.zzb != null) {
                if (this.zzc != null) {
                    zzcw zzcwVar = this.zzd;
                    if (zzcwVar != null) {
                        if (!zzcwVar.zza()) {
                            zzb zzbVar = this.zzc;
                            zzcw zzcwVar2 = this.zzd;
                            if ((zzbVar.equals(zzb.zza) && (zzcwVar2 instanceof zzdz)) || ((zzbVar.equals(zzb.zzc) && (zzcwVar2 instanceof zzeq)) || ((zzbVar.equals(zzb.zzb) && (zzcwVar2 instanceof zzgd)) || ((zzbVar.equals(zzb.zzd) && (zzcwVar2 instanceof zzdg)) || ((zzbVar.equals(zzb.zze) && (zzcwVar2 instanceof zzdq)) || (zzbVar.equals(zzb.zzf) && (zzcwVar2 instanceof zzek))))))) {
                                return new zzfi(this.zza, this.zzb, this.zzc, this.zzd);
                            }
                            throw new GeneralSecurityException(m1.k("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
                        }
                        throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                }
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            throw new GeneralSecurityException("kekUri must be set");
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zzb {
        public static final zzb zza = new zzb("ASSUME_AES_GCM");
        public static final zzb zzb = new zzb("ASSUME_XCHACHA20POLY1305");
        public static final zzb zzc = new zzb("ASSUME_CHACHA20POLY1305");
        public static final zzb zzd = new zzb("ASSUME_AES_CTR_HMAC");
        public static final zzb zze = new zzb("ASSUME_AES_EAX");
        public static final zzb zzf = new zzb("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zzb(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("NO_PREFIX");
        private final String zzc;

        private zzc(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfi)) {
            return false;
        }
        zzfi zzfiVar = (zzfi) obj;
        return zzfiVar.zzc.equals(this.zzc) && zzfiVar.zzd.equals(this.zzd) && zzfiVar.zzb.equals(this.zzb) && zzfiVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzfi.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        String str = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String strValueOf3 = String.valueOf(this.zza);
        StringBuilder sbM = m1.m("LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: ");
        sbM.append(strValueOf2);
        sbM.append(", variant: ");
        sbM.append(strValueOf3);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza != zzc.zzb;
    }

    public final zzcw zzb() {
        return this.zzd;
    }

    public final zzc zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    private zzfi(zzc zzcVar, String str, zzb zzbVar, zzcw zzcwVar) {
        this.zza = zzcVar;
        this.zzb = str;
        this.zzc = zzbVar;
        this.zzd = zzcwVar;
    }
}

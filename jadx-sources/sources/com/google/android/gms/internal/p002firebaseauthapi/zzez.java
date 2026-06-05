package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzez extends zzcw {
    private final String zza;
    private final zza zzb;

    /* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzez(String str, zza zzaVar) {
        this.zza = str;
        this.zzb = zzaVar;
    }

    public static zzez zza(String str, zza zzaVar) {
        return new zzez(str, zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzez)) {
            return false;
        }
        zzez zzezVar = (zzez) obj;
        return zzezVar.zza.equals(this.zza) && zzezVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzez.class, this.zza, this.zzb);
    }

    public final String toString() {
        return m1.k("LegacyKmsAead Parameters (keyUri: ", this.zza, ", variant: ", String.valueOf(this.zzb), ")");
    }

    public final zza zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zzb != zza.zzb;
    }
}

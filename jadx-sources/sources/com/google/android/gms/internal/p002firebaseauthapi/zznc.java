package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zznc extends zzci {
    private final zzot zza;

    public zznc(zzot zzotVar) {
        this.zza = zzotVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznc)) {
            return false;
        }
        zzot zzotVar = ((zznc) obj).zza;
        return this.zza.zza().zzd().equals(zzotVar.zza().zzd()) && this.zza.zza().zzf().equals(zzotVar.zza().zzf()) && this.zza.zza().zze().equals(zzotVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i10 = zznb.zza[this.zza.zza().zzd().ordinal()];
        return m1.k("(typeUrl=", strZzf, ", outputPrefixType=", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza.zza().zzd() != zzvs.RAW;
    }

    public final zzot zzb() {
        return this.zza;
    }
}

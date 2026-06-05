package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgii {
    private zzgik zza;
    private String zzb;
    private zzgij zzc;
    private zzgfo zzd;

    private zzgii() {
        throw null;
    }

    public final zzgii zza(zzgfo zzgfoVar) {
        this.zzd = zzgfoVar;
        return this;
    }

    public final zzgii zzb(zzgij zzgijVar) {
        this.zzc = zzgijVar;
        return this;
    }

    public final zzgii zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgii zzd(zzgik zzgikVar) {
        this.zza = zzgikVar;
        return this;
    }

    public final zzgim zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgik.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgij zzgijVar = this.zzc;
        if (zzgijVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgfo zzgfoVar = this.zzd;
        if (zzgfoVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzgfoVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzgijVar.equals(zzgij.zza) && (zzgfoVar instanceof zzgha)) || ((zzgijVar.equals(zzgij.zzc) && (zzgfoVar instanceof zzghr)) || ((zzgijVar.equals(zzgij.zzb) && (zzgfoVar instanceof zzgjo)) || ((zzgijVar.equals(zzgij.zzd) && (zzgfoVar instanceof zzggf)) || ((zzgijVar.equals(zzgij.zze) && (zzgfoVar instanceof zzggp)) || (zzgijVar.equals(zzgij.zzf) && (zzgfoVar instanceof zzghl))))))) {
            return new zzgim(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        throw new GeneralSecurityException(m1.k("Cannot use parsing strategy ", this.zzc.toString(), " when new keys are picked according to ", String.valueOf(this.zzd), "."));
    }

    public /* synthetic */ zzgii(zzgil zzgilVar) {
    }
}

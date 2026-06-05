package com.google.android.gms.internal.ads;

import java.util.UUID;
import mc.n;
import org.json.JSONObject;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdhq implements zzhfy {
    private final zzhgh zza;

    public zzdhq(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        rc.a aVarZza = ((zzchu) this.zza).zza();
        r0 r0Var = n.D.f11577c;
        return new zzayx(UUID.randomUUID().toString(), aVarZza, "native", new JSONObject(), false, true);
    }
}

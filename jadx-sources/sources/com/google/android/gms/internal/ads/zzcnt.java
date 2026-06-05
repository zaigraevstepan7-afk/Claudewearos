package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcnt implements zzhfy {
    private final zzhgh zza;

    public zzcnt(zzhgh zzhghVar) {
        this.zza = zzhghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrm) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}

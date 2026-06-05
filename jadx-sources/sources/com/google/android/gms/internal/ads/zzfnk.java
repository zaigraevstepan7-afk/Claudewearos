package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfnk extends zzfnl {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfnk(zzfnd zzfndVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfndVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j;
    }
}

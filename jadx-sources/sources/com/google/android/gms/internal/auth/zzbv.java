package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbv implements t {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        e0.i(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        e0.i(str);
        this.zzb = str;
        this.zza = Status.f3488e;
    }
}

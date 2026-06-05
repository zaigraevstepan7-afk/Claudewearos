package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, n nVar, o oVar) {
        return buildClient(context, looper, iVar, obj, (com.google.android.gms.common.api.internal.g) nVar, (com.google.android.gms.common.api.internal.q) oVar);
    }

    public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, com.google.android.gms.common.api.internal.g gVar, com.google.android.gms.common.api.internal.q qVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

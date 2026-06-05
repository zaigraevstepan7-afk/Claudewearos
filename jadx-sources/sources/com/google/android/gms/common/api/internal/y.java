package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final nd.d[] f3602a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3603b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3604c;

    public y(nd.d[] dVarArr, boolean z2, int i10) {
        this.f3602a = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z2) {
            z10 = true;
        }
        this.f3603b = z10;
        this.f3604c = i10;
    }

    public static x a() {
        x xVar = new x();
        xVar.f3597c = true;
        xVar.f3596b = 0;
        return xVar;
    }
}

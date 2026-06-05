package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f3502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f3503b;

    public a0(b0 b0Var, BasePendingResult basePendingResult) {
        this.f3503b = b0Var;
        this.f3502a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        ((Map) this.f3503b.f3507a).remove(this.f3502a);
    }
}

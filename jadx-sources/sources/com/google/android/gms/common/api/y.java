package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends BasePendingResult {

    /* renamed from: a, reason: collision with root package name */
    public final Status f3613a;

    public y(Status status) {
        super(null);
        this.f3613a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return this.f3613a;
    }
}
